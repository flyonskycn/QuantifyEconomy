$(function(){
	function resizefrm(){
		var max=parseInt($(".content-wrapper").css('min-height'));
		var mainheight = 0;
		try{
			mainheight=$("#contentfrm").contents().find("body").height()+30;
		}catch(ex){// 外部连接 无法获取。
			mainheight=0;
		}
		mainheight=Math.max(mainheight,max);
		$("#contentfrm").height(mainheight);
	}
	$("#contentfrm").load(function(){
	// 	resizefrm();	
	// 	setTimeout(resizefrm,500);
	// 	setTimeout(resizefrm,1500);
	// 	$(this).contents()[0].onresizestart=resizefrm;
	
	}); 

	
	$('a[target="contentfrm"]').click(function(){
		//$('.sidebar-toggle').click();
	});

	$('.sidebar-form').submit(function(){
		var q=$('#q').val().toUpperCase();
		$('.sidebar-menu li').show();
		$('.sidebar-menu .treeview.active').removeClass('active');
		if(!q){
			
			$('.sidebar-menu .treeview:first').addClass('active');
			return;
		}
	
		$('.sidebar-menu .treeview').each(function(i,li){
			if($(this).text().toUpperCase().indexOf(q)>-1){
				if($('>a',this).text().toUpperCase().indexOf(q)==-1){// 如果主分类匹配，子类全部可见
					$('li',this).each(function(j,li){  // 如果子类匹配，主分类保持可见，当前子类可见
						if($(this).text().toUpperCase().indexOf(q)==-1){
							$(this).hide();
						}
					});
				}
				$(this).addClass('active');
			}else{
				$(this).hide();
			}
		});
		return false;
		
	});
	
	$(".treeview a,#wlist").click(function(){
		if($(this).attr("href") && this.title){
			
			var cname=subcname($(this).attr("href"));
			createtab(cname,$(this).attr("href"),this.title);
			return false;
		}
	});
	
	//为系统导航加上事件
	$(".headerx a").click(function(){
		$(".my-tabs li:eq(0) a").tab('show');
	});
	
	
	//标签页的点击事件
	$('.my-tabs a').click(function (e) {
	  e.preventDefault()
	  $(this).tab('show');
	})
	
	$("#updatePwd").click(function(){
        createtab(this.id+"iframe",this.href,this.title);
        $(".user").removeClass("open");
        return false;
    });
});

function subcname(val){
	var val=val.replace(/\//g,"-");
	//截取
	var cname="";
	if(val.indexOf("=")>=0){
		cname=val.substring(val.indexOf("=")+1);
		var reg=/[0-9]+/g;
		if(reg.test(cname)){
			cname=val.substring(1,val.indexOf("."));
		}
	}else{
		cname=val.substring(1,val.indexOf("."));
	}
	return cname;
}
var applycount=0;
//对iframe每个a标签添加click事件
function loadtab(x){
	var tab=x.contentWindow;
	$(tab.document).on('click','a',function(event){
		if(this.href && !this.href.match(/^javascript/)){
			if(this.id && this.href && this.title){
				if(this.title=="发货申请"){
					var timestamp = Date.parse(new Date());
					this.id=this.id+""+timestamp;
				}
				createtab(this.id,this.href,this.title);
				return false;
			}
		}
  	});
}

//创建标签页
function createtab(cname,href,title){
	//判断是否存在
	if($("[href='#"+cname+"']").length==0){
		if($(".my-tabs li").length>=12){
			$.toaster('您打开的标签页过多,请关闭后重新打开...','提醒','danger');
			return;
		}
  		$(".content-wrapper iframe").removeClass("in active");
  		$(".content-wrapper").append('<iframe src="'+href+'" class="contentfrm tab-pane fade in active" id='+cname+' frameborder="0" name='+cname+' style="width:100%;height:854px;" onload="loadtab(this)"></iframe>');
  		
  		$(".my-tabs li").removeClass("active");
  		$(".my-tabs").append('<li class="active"><a href="#'+cname+'" data-toggle="tab">'+title+'<span class="glyphicon glyphicon-remove" style="display:none;"></span></a></li>');
  		$(".my-tabs .active a").tab('show');
  		
  		//删除操作
  	  	$(".my-tabs .active a span").click(function(){
  	  		var next=$(this).parent().parent().index()-1;
			$(this).parent().parent().remove();
			$($(this).parent().attr("href")).remove();
			//$($(this).parent().attr("href")).undelegate("click");
  	  		if($(this).parent().parent().hasClass("active")){
  				$('.my-tabs li:eq('+next+') a').tab('show');
  	  		}
  		});
  		//鼠标事件
  	  	$(".my-tabs .active a").mouseover(function(){
  	  		$(this).children("span").css({"display":"inline-block"});	  			  
  	  	});
  	  	$(".my-tabs .active a").mouseout(function(){
  	  		$(this).children("span").css({"display":"none"});	  			  
  	  	});
	}else{
		$("[href='#"+cname+"']").tab('show');
	}
}
	
	