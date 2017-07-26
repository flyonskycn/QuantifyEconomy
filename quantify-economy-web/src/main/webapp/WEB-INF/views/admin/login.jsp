<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>登录-量化管理平台</title>
  <!-- Tell the browser to be responsive to screen width -->
  <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
  <!-- Bootstrap 3.3.6 -->
  <link rel="stylesheet" href="<s:url value="/" />ext/bootstrap/css/bootstrap.min.css">
  <!-- Font Awesome -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.5.0/css/font-awesome.min.css">
  <!-- Ionicons -->
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/ionicons/2.0.1/css/ionicons.min.css">
  <!-- Theme style -->
  <link rel="stylesheet" href="<s:url value="/" />ext/AdminLTE/css/AdminLTE.min.css">
  <!-- iCheck -->
  <link rel="stylesheet" href="<s:url value="/" />ext/iCheck/square/blue.css">

  <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
  <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
  <!--[if lt IE 9]>
  <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
  <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
  <![endif]-->
</head>
<body class="hold-transition login-page">
<div class="login-box">
  <div class="login-logo">
    <a href=""><b>量化</b>管理平台</a>
  </div>
  <!-- /.login-logo -->
  <div class="login-box-body">
    <p class="login-box-msg">登录量化管理平台</p>

    <form action="chklogin.co" method="post" class="hide">
      <div class="form-group has-feedback">
        <input type="text" name="adminName" class="form-control" placeholder="管理用户名">
        <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
      </div>
      <div class="form-group has-feedback">
        <input type="password" name="adminPwd" class="form-control" placeholder="管理密码">
        <span class="glyphicon glyphicon-lock form-control-feedback"></span>
      </div>
      <div class="row">
        <div class="col-xs-8">
          <div class="checkbox icheck">
            <label>
              <input type="checkbox" name="remember" value="true"> 记住
            </label>
          </div>
        </div>
        <!-- /.col -->
        <div class="col-xs-4">
          <button type="submit" class="btn btn-primary btn-block btn-flat">登录</button>
        </div>
        <!-- /.col -->
      </div>
      <div class="row alert alert-error">
      </div>
    </form>

    <!-- /.social-auth-links -->

    <a href="#">忘记密码?请联系管理人员重置</a>

  </div>
  <!-- /.login-box-body -->
</div>
<!-- /.login-box -->

<!-- jQuery 2.2.0 -->
<script src="<s:url value="/ext/jquery/jQuery-2.2.0.min.js" />"></script>
<!-- Bootstrap 3.3.6 -->
<script src="<s:url value="/ext/bootstrap/js/bootstrap.min.js" />"></script>

<script src="<s:url value="/ext/jquery/jquery.form.js" />"></script>
<!-- iCheck -->
<script src="<s:url value="/ext/iCheck/icheck.min.js" />"></script>
<script>

  $(function () {
	  	$('form').removeClass('hide');
		$('.alert-error').hide();
	  
		$('input').iCheck({
		  checkboxClass: 'icheckbox_square-blue',
		  radioClass: 'iradio_square-blue',
		  increaseArea: '20%' // optional
		});
		var url=decodeURIComponent('${param.url}');
		$('form').ajaxForm(function(data){
			if(data.erroCode==0){
				if(url){
					location.href=url;
				}else{
					location.href="main.co";
				}    		
			}else{
				$('.alert-error').hide().html(data.message).show(50);
			}
		});
  });
</script>
</body>
</html>
