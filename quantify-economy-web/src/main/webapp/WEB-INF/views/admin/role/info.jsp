<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>编辑角色-${item.rolename }</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>

	<!-- Bootstrap 3.3.6 -->
  	<link rel="stylesheet" href="<s:url value="/ext/bootstrap/css/bootstrap.min.css" />">
  	<link rel="stylesheet" href="<s:url value="/ext/bootstrap-treeview/css/bootstrap-treeview.css" />">
  	
  	<script type="text/javascript" charset="utf-8" src="/script/jquery-1.12.3.js"> </script>
	<script src="<s:url value="/ext/bootstrap/js/bootstrap.min.js" />"></script>
	<script src="<s:url value="/ext/bootstrap-treeview/js/bootstrap-treeview.js" />"></script>
	
	<!-- Theme style -->
  	<link rel="stylesheet" href="<s:url value="/" />ext/AdminLTE/css/AdminLTE.min.css">
  	<!-- AdminLTE Skins. Choose a skin from the css/skins
       folder instead of downloading all of them to reduce the load. -->
  	<link rel="stylesheet" href="<s:url value="/" />ext/AdminLTE/css/skins/_all-skins.min.css">

	
    
	<script type="text/javascript" charset="utf-8" src="/ext/jquery.toaster.js"> </script>
	<script type="text/javascript" charset="utf-8" src="/js/wristband-admin.js"> </script>


    <style type="text/css">
        div{
            width:100%;
        }
        #coverImg{max-width:100%;max-height:100%;}
        .input-group-addon{width:120px;}
    </style>
</head>
<body>
<div class="container-fluid">
    <h1>管理角色</h1>
    <div class="form-horizontal" id="form">
	    	<input type="hidden" id="roleid" name="roleid" value="${item.roleid }" />
		    <div class="panel panel-info fixed">
			  <div class="panel-heading">角色名称</div>
			   <div class="panel-body">
			   	<input type="text" id="rolename" name="rolename" class="form-control" placeholder="请输入2-50长度名称" aria-describedby="basic-addon1"  value="${item.rolename }">
			  </div>
			</div>
			<div class="panel panel-info">
			  <div class="panel-heading">包含用户</div>
			  <ul class="list-group">			  
			  	<c:forEach items="${users}" var="admin" varStatus="it">
		    		<li class="list-group-item" >
		                 <input type="checkbox" name="adminid" value="${admin.adminid }" ${admin.urid!=null?'checked':'' }>${admin.adminname }
		            </li>
			    </c:forEach>
			  </<ul>
			</div>
			<div class="panel panel-info">
			  <div class="panel-heading">赋予权限</div>
			  <div id="treeview8">
			  </div>
			  <%-- <ul  class="list-group">			  
			  	<c:forEach items="${utree.childrens}" var="node" varStatus="it">
		    		<li  class="list-group-item" style="padding-left:10px;">
		                 <input type="checkbox" name="uid" value="${node.id }" ${node.value.ruid!=null?'checked':'' }>${node.name }
		            </li>		  
				  	<c:forEach items="${node.childrens}" var="node" varStatus="it">
			    		<li  class="list-group-item" style="padding-left:40px;">
			                 <input type="checkbox" name="uid" value="${node.id }" ${node.value.ruid!=null?'checked':'' }>${node.name }
			            </li>		  
						<c:forEach items="${node.childrens}" var="node" varStatus="it">
				    		<li  class="list-group-item" style="padding-left:70px;">
				                 <input type="checkbox" name="uid" value="${node.id }" ${node.value.ruid!=null?'checked':'' }>${node.name }
				            </li>
						</c:forEach>			    
				    </c:forEach>			    
			    </c:forEach>			    
			  </ul> --%>
			</div>
			
			<div class="panel">
			  <a tabindex="0" class="btn btn-default" role="button" data-toggle="popover" data-trigger="focus" onclick="save()"
	       		data-container="body" data-toggle="popover" data-placement="bottom" data-content="正在保存..."
	       	 	>保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</a>
			</div>
		</div>


</div>

<script type="text/javascript">
	var btree=${btree};
	btree=[{"id":0,"text":"全部",nodes:btree}];
	var $btree={};
                   
    $(function(){
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
              });
    	}
    	
    	load();
    	

    })
   

    function save() {
    	var data=[];
    	$(':text,:password,:checked,:submit,:image,:button,:hidden,select,textarea',$('#form')).each(function(o,i){
    		if(this.name){
    			data.push(this.name+'='+encodeURIComponent(this.value));
    		}
    	});
    	var checkeds=$btree.treeview('getChecked');
    	$.each(checkeds,function(){
    		if(this.nodeId>0){
    			data.push('uid='+this.id);
    		}
    	});
    	
    	data=data.join('&');
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

    

</script>

</body>
</html>