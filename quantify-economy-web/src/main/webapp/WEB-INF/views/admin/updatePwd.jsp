<%@ page language="java" contentType="text/html; charset=UTF-8" isELIgnored="false"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@	taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
    <title>修改密码-${user.adminname }</title>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8"/>
	<link href="/ext/jquery-ui/jquery-ui.css" rel="stylesheet">
	<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">

    <script type="text/javascript" charset="utf-8" src="/ext/jquery/jQuery-2.2.0.min.js"> </script>
    <script type="text/javascript" charset="utf-8" src="/ext/jquery-ui/jquery-ui.js"> </script>
    <script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" charset="utf-8" src="/ext/jquery.toaster.js"> </script>
	<script type="text/javascript" charset="utf-8" src="/js/flyonsky-admin.js"> </script>
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
    <h1>修改密码</h1>
    <div class="" id="form">
	    	<input type="hidden" id="adminid" name="adminid" value="${user.adminid }" />
		    <div class="input-group form-group">
			  <span class="input-group-addon">&nbsp;&nbsp; 管理用户名  &nbsp;&nbsp; </span>
			  <input type="text" id="adminname" name="adminname" class="form-control" placeholder="请输入2-50长度名称" aria-describedby="basic-addon1"  value="${user.adminname }" disabled="disabled">
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">&nbsp;&nbsp; 工作邮箱  &nbsp;&nbsp; </span>
			  <input type="text" id="adminemail" name="adminemail" class="form-control" placeholder="请输入正确的邮箱地址" aria-describedby="basic-addon1"  value="${user.adminemail }" disabled="disabled">
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">旧密码</span>
			  <input type="password" id="oldpwd" name="oldpwd" class="form-control" placeholder="请输入旧密码" aria-describedby="basic-addon1"  >
			</div>
			<div class="input-group form-group">
			  <span class="input-group-addon">管理密码</span>
			  <input type="password" id="adminpwd" name="adminpwd" class="form-control" placeholder="请输入密码" aria-describedby="basic-addon1" disabled="disabled">
			</div>
	
			<div class="input-group form-group">
			  <span class="input-group-addon">重新输入</span>
			  <input type="password" id="adminpwd2" name="adminpwd2" class="form-control" placeholder="请确认密码" aria-describedby="basic-addon1" disabled="disabled">
			</div>
			
			<div class="input-group form-group">
			  <button class="btn btn-default save" onclick="save()">保&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;存</button>
			</div>
		</div>
</div>
<script>
	$("#oldpwd").blur(function(){
		if(!$("#oldpwd").val()){
			$.toaster("请输入您的旧密码",'结果','danger');
			return;
		}
		var param={
			"adminName":$("#adminname").val(),
			"adminPwd":$("#oldpwd").val()
		};
		$.ajax({
			url:'/admin/checkPwd.co',
			type:'POST',
			dataType:'JSON',
			data:param,
			success:function(data){
				if(data.erroCode==0){
					$("#adminpwd").attr({"disabled":false});
					$("#adminpwd2").attr({"disabled":false});
				}else{
					$.toaster(data.message,'结果','danger');
				}
			}
		});
	});
	
	function save(){
		var param={};
		$(':input').each(function(o,i){
			if(this.name){
				param[this.name]=encodeURIComponent(this.value);
			}
		});
		if(!param["oldpwd"]){
			$.toaster("请输入您的旧密码",'结果','danger');
			return;
		}
		if(!param["adminpwd"]){
			$.toaster("请输入密码",'结果','danger');
			return;
		}
		if(!param["adminpwd2"]){
			$.toaster("请再一次输入密码",'结果','danger');
			return;
		}
		if(param["adminpwd"]!=param["adminpwd2"]){
			console.info("123");
			$.toaster("两次密码不一样",'结果','danger');
			return;
		}
		$.ajax({
			url:'/admin/save.co',
			type:'POST',
			dataType:'JSON',
			data:param,
			success:function(data){
				if(data.erroCode==0){
					$.toaster('发布成功','结果','success');
        			setTimeout(function(){top.location.href='login.co';},2000);
				}else{
					$.toaster(data.message,'结果','danger');
				}
			}
		});
	}
</script>
</body>
</html>