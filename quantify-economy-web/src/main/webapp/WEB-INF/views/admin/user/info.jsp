<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>编辑用户-${item.adminname }</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
	<link href="/ext/jquery-ui/jquery-ui.css" rel="stylesheet">
	<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	


    <script type="text/javascript" charset="utf-8" src="/script/jquery-1.12.3.js"> </script>
    <script type="text/javascript" charset="utf-8" src="/ext/jquery-ui/jquery-ui.js"> </script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="/ext/jquery.toaster.js"> </script>
	<script type="text/javascript" charset="utf-8" src="/js/wristband-admin.js"> </script>
	<script src="<s:url value="/ext/bootstrap-treeview/js/bootstrap-treeview.js" />"></script>

    <style type="text/css">
        div{
            width:100%;
        }
        ul{
        	margin:0px !important;	
        }
        #coverImg{max-width:100%;max-height:100%;}
        .head{max-width:35px;max-height:30px;margin-right:5px;}
        .input-group-addon{width:120px;}
    </style>
</head>
<body>
<div class="container-fluid">
    <h1>发布内容</h1>
    <div class="" id="form">
	    	<input type="hidden" id="adminid" name="adminid" value="${item.adminid }" />
	    	<input type="hidden" id="userid" name="userid" value="${item.userid }" />
		    <div class="input-group form-group">
			  <span class="input-group-addon">&nbsp;&nbsp; 管理用户名  &nbsp;&nbsp; </span>
			  <input type="text" id="adminname" name="adminname" class="form-control" placeholder="请输入2-50长度名称" aria-describedby="basic-addon1"  value="${item.adminname }">
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">&nbsp;&nbsp; 工作邮箱  &nbsp;&nbsp; </span>
			  <input type="text" id="adminemail" name="adminemail" class="form-control" placeholder="请输入正确的邮箱地址" aria-describedby="basic-addon1"  value="${item.adminemail }">
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">平台用户信息 </span>
			  <c:set var="mobile" value="(${item.mobile})"></c:set>   
			  <input type="text" id="nickname" name="nickname" class="form-control ui-autocomplete ui-autocomplete-input" placeholder="请输入昵称或手机号关键字自动匹配" aria-describedby="basic-addon1"  
			  value="${item.nickname }${item.mobile!=null? mobile:'' }">
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">管理密码</span>
			  <input type="password" id="adminpwd" name="adminpwd" class="form-control" placeholder="请输入密码" aria-describedby="basic-addon1"  >
			</div>
	
			<div class="input-group form-group">
			  <span class="input-group-addon">管理密码</span>
			  <input type="password" id="adminpwd2" name="adminpwd2" class="form-control" placeholder="请确认密码" aria-describedby="basic-addon1" >
			</div>
			
			<div class="input-group form-group">
			  <span class="input-group-addon">拥有角色</span>
			  <div class="checkbox form-control" style="margin:0px;">
			  	<c:forEach items="${ar}" var="r">
			  		<label>	
						<input type="checkbox" value="${r.roleid}" id="${r.roleid}" onchange="change()">${r.rolename}
			  		</label>
			  	</c:forEach>
			  </div>
			</div>
			
			<div class="input-group form-group">
			  <span class="input-group-addon">拥有权限</span>
			  <div id="treeview8" disabled="true">
			  </div>
			</div>
			<div class="input-group form-group">
			  <a tabindex="0" class="btn btn-default" role="button" data-toggle="popover" data-trigger="focus" onclick="save()"
	       		data-container="body" data-toggle="popover" data-placement="bottom" data-content="正在保存..."
	       	 	>保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</a>
			</div>
		</div>


</div>

<script type="text/javascript">
	
    function save() {
    	var data={};
    	if(!$('#adminname').val()){
    		$.toaster('管理用户名不能为空','结果','danger');
    		return;
    	}
    	if(!$('#userid').val()){
    		$.toaster('前端用户不能为空','结果','danger');
    		return;
    	}
    	if(!$('#adminid').val() && !$('#adminpwd').val()){
    		$.toaster('创建新的管理用户密码不能为空','结果','danger');
    		return;
    	}
    	if($('#adminpwd').val()!=$('#adminpwd2').val()){
    		$.toaster('两次输入密码不一致','结果','danger');
    		return;
    	}
    	
    	$('#form input,#form select,#form textarea').each(function(o,i){
    		data[this.name]=this.value;
    	});
    	var roles="";
		 var cb=$(".checkbox input");
		 for(var i=0;i<cb.length;i++){
			 if(cb[i].checked){
				 roles+=cb[i].value+",";
			 }
		 }
		 roles=roles.slice(0, roles.length-1);
		 data["roles"]=roles;
        $.ajax({
        	url:'save.co',
        	data:data,
        	type:'POST',
        	dataType:'json',
        	success:function(data){
        		if(data.erroCode==0){
        			$.toaster('发布成功','结果','success');
        		}else{
        			$.toaster(data.message,'结果','danger');
        		}
        	},error:function(){
        		
        	},complete:function(){
        		
        	}
        });
    }
    

    function split( val ) {
	      return val.split( /,\s*/ );
	 }
	 function extractLast( term ) {
	      return split( term ).pop();
	 }
	 
	 $(function(){
		 if($('#userid').val()){
			 $('#nickname').prop('disabled',true);
		 }else{
			 $( "#nickname" )
		     // 当选择一个条目时不离开文本域
		     .bind( "keydown", function( event ) {
		       if ( event.keyCode === $.ui.keyCode.TAB &&
		           $( this ).data( "ui-autocomplete" ).menu.active ) {
		         event.preventDefault();
		       }
		     })
		     .autocomplete({
		        source: function( request, response ) {
		          $.getJSON( "/dealer/admin/finduser.co", {
		            keyword: extractLast( request.term )
		          }, response );
		        },
		        search: function() {
		          // 自定义最小长度
		          //var term = extractLast( this.value );
		          if ( this.value.length < 0 ) {
		            return false;
		          }
		        },
		        focus: function() {
		          // 防止在获得焦点时插入值
		          return false;
		        },
		        select: function( event, ui ) {

		          this.value = ui.item.nickname+'('+ ui.item.mobile+')';
		          $('#userid').val(ui.item.userid);
		          return false;
		        }
		      }).data( "ui-autocomplete" )._renderItem = function( ul, item ) {
		    	 // if(item.id == '0') {
		    		  return jQuery( "<li></li>" )
		    		   .data( "item.autocomplete", item )
		    		   .append( "<img class='head' src='"+ item.headerpic + "'  />" )
		    		   .append( "<span class='no-result'>"+ item.nickname + "("+ item.mobile + ")</span>" )
		    		   .appendTo( ul );
		    	 // }
		     };
		 }
		
		 //当前admin和角色
		 <c:forEach items="${vr}" var="v">
		 	$("#${v.roleid}").attr({"checked":"checked"});
		 </c:forEach>
		 
	    	
		change();
	 })
	 
	 var btree;
	 function change(){
		 var roles="";
		 var cb=$(".checkbox input");
		 for(var i=0;i<cb.length;i++){
			 if(cb[i].checked){
				 roles+=cb[i].value+",";
			 }
		 }
		 roles=roles.slice(0, roles.length-1);
		 
		 $.ajax({
			 url:'getUrls.co',
			 type:'POST',
			 data:{
				 "roles":roles
			 },
			 dataType:'json',
			 success:function(data){
				 data = JSON.parse(data);
				 btree=data;
				 btree=[{"id":0,"text":"全部",nodes:btree}];
				 var $btree={};
				 load();
				 $(".check-icon").click(function(e){
					 e.stopPropagation();
				 });
			 }
		 });
	 }
	
	 function checkSubNodes(node){
 		if(node.nodes){
     		$.each(node.nodes,function(){
     			//var n=$btree.treeview('getNode',this.nodeId);
     			$btree.treeview('checkNode',this.nodeId);
     			checkSubNodes(this);
     		});
     	}
 	}
 	function uncheckSubNodes(node){
 		if(node.nodes){
     		$.each(node.nodes,function(){
     			//var n=$btree.treeview('getNode',this.nodeId);
     			$btree.treeview('uncheckNode',this.nodeId);
     			uncheckSubNodes(this);
     		});
     	}
 	}
 	
	 function load(){
   		$btree = $('#treeview8').treeview({
               data: btree,
               showIcon: false,
               showCheckbox: true,
               checked:'',
               onNodeChecked: function(event, node) {
                 	if(this.unioncheck)return;
                 	
                 	this.unioncheck=true;
               	var parent=$btree.treeview('getParent',node);
               	while(parent.nodeId>-1){
               		$btree.treeview('checkNode',parent.nodeId);
               		parent=$btree.treeview('getParent',parent);
               	}
               	
                 	checkSubNodes(node);
                 	this.unioncheck=false;
               },
               onNodeUnchecked: function (event, node) {
               	uncheckSubNodes(node);
               }
        })
    }
	    
</script>

</body>
</html>