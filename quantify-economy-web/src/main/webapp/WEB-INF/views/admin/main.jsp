<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>量化</title>
	<!-- Tell the browser to be responsive to screen width -->
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<!-- Bootstrap 3.3.6 -->
	<link rel="stylesheet" href="<s:url value="/" />ext/bootstrap/css/bootstrap.min.css">
	<!-- Font Awesome -->
	<link rel="stylesheet" href="<s:url value="/" />ext/font-awesome/4.5.0/css/font-awesome.min.css">
  	<!-- Ionicons -->
  	<link rel="stylesheet" href="<s:url value="/" />ext/ionicons/2.0.1/css/ionicons.min.css">
  	<!-- jvectormap -->
  	<link rel="stylesheet" href="<s:url value="/" />ext/jvectormap/jquery-jvectormap-1.2.2.css">
	<!-- Theme style -->
	<link rel="stylesheet" href="<s:url value="/" />ext/AdminLTE/css/AdminLTE.min.css">
	<!-- AdminLTE Skins. Choose a skin from the css/skins
	       folder instead of downloading all of them to reduce the load. -->
	<link rel="stylesheet" href="<s:url value="/" />ext/AdminLTE/css/skins/_all-skins.min.css">
	  
  	<!-- jQuery 2.2.0 -->
	<script src="<s:url value="/" />ext/jquery/jQuery-2.2.0.min.js"></script>
</head>
<body class="hold-transition skin-blue sidebar-mini" style="overflow-y: hidden;">
	<div class="wrapper">
		<!-- Main header -->
		<div class="main-header">
		    <!-- Logo -->
		    <a href="main.co" class="logo">
		      <!-- mini logo for sidebar mini 50x50 pixels -->
		      <span class="logo-mini"><b>SKY</b></span>
		      <!-- logo for regular state and mobile devices -->
		      <span class="logo-lg"><b>FLYONSKY</b></span>
		    </a>
		    
		    <!-- Header Navbar: style can be found in header.less -->
    		<nav class="navbar navbar-static-top">
    			<!-- Sidebar toggle button-->
   				<a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
        			<span class="sr-only">Toggle navigation</span>
     	 		</a>
     	 		
     	 		<div class="nav navbar-nav">
		      		<ul class="nav nav-tabs my-tabs" style="margin-top:10px">
						<li class="active"><a href="#contentfrm" data-toggle="tab">
							首页</a>
						</li>
					</ul>
		      	</div>
     	 		
     	 		<!-- Navbar Right Menu -->
     	 		<div class="navbar-custom-menu">
			        <ul class="nav navbar-nav">
			          <!-- User Account: style can be found in dropdown.less -->
			          <li class="dropdown user user-menu">
			            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
			              <img src="${user.headerpic }" class="user-image" alt="User Image">
			              <span class="hidden-xs">${user.admindesc!=null?user.admindesc:user.adminName }</span>
			            </a>
			            <ul class="dropdown-menu">
			              <!-- User image -->
			              <li class="user-header">
			                <img src="${user.headerpic }" class="img-circle" alt="User Image">
							<p>
			                  	<small>上一次登录：<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss" value="${user.logintime}"/></small>
			                </p>
			                <p>
			                	<small>登录地点：${user.location}</small>
			                </p>
			              </li>
			              <!-- Menu Footer-->
			              <li class="user-footer">
			                <div class="pull-left">
			                  <a href="updatePwd.co" class="btn btn-default btn-flat" id="updatePwd" title="修改密码">修改密码</a>
			                </div>
			                <div class="pull-right">
			                  <a href="logout.co" class="btn btn-default btn-flat">退出系统</a>
			                </div>
			              </li>
			            </ul>
			          </li>
			
			        </ul>
		        </div>
    		</nav>
      
		</div>
		
		<!-- Left side column. contains the logo and sidebar -->
		<aside class="main-sidebar">
			<!-- sidebar: style can be found in sidebar.less -->
		    <section class="sidebar">
		      <!-- Sidebar user panel -->
		      <div class="user-panel">
		        <div class="pull-left image">
		          <img src="${user.headerpic }" class="img-circle" alt="User Image">
		        </div>
		        <div class="pull-left info">
		          <p>${user.admindesc!=null?user.admindesc:user.adminName }</p>
		          <a href="#"><i class="fa fa-circle text-success"></i> Online</a>
		        </div>
		      </div>
		      <!-- search form -->
		      <form action="#" method="get" class="sidebar-form">
		        <div class="input-group">
		          <input type="text" id="q" name="q" class="form-control" placeholder="菜单名称...">
		              <span class="input-group-btn">
		                <button type="submit" name="search" id="search-btn" class="btn btn-flat"><i class="fa fa-search"></i>
		                </button>
		              </span>
		        </div>
		      </form>
		      <!-- /.search form -->
		      <!-- sidebar menu: : style can be found in sidebar.less -->
		      <ul class="sidebar-menu">
		        <li class="headerx"> 
			        <a href="/admin/index.co" target="contentfrm">
			        	<i class="fa fa-home"></i><span>首页</span>
			        </a>
		        </li>
		        <c:forEach items="${tree.childrens }" var="item" varStatus="var">        
		        <li class="<c:if test="${var.first }">active</c:if> treeview">
		          <a href="#">
		            <i class="fa ${item.value.ucsscls }"></i> <span>${item.value.utitle }</span> 
		            <i class="fa fa-angle-left pull-right"></i>
		            <small class="label pull-right bg-green ">${fn:length(item.childrens) }</small>
		          </a>
		          <ul class="treeview-menu">
		          	<c:forEach items="${item.childrens }" var="item2" varStatus="var2">  
		            <li><a href="${item2.value.url}" title="${item2.value.utitle}" value="${item2.value.url}" ${ item2.value.uname}>
		            <i class="fa fa-circle-o ${item2.value.ucsscls }"></i> ${item2.value.utitle }
		            <c:if test="${var2.last }"> <small class="label pull-right bg-green">new</small></c:if>
		            </a></li>
		            </c:forEach>
		          </ul>
		        </li>
		        </c:forEach>
		      </ul>
		    </section>
		    <!-- /.sidebar -->
		</aside>
		
		<!-- Content Wrapper. Contains page content -->
  		<div class="content-wrapper tab-content" style="min-height: 916px;">
  			<iframe src="/admin/index.co" class="contentfrm tab-pane fade in active" id="contentfrm" frameborder="0" name="contentfrm" style="width:100%;height:650px;"></iframe>
  		</div>
  		
  		<footer class="main-footer">
  			<div class="pull-right hidden-xs">
				<b>Version</b> 4.0.0
    		</div>
    		<strong>Copyright © 2014-2016 <a href="https://www.flyonskycn.com/">flyonsky</a>.</strong> All rights reserved.
		</footer>
		
		<!-- The Right Sidebar -->
  		<aside class="control-sidebar control-sidebar-dark">
  		</aside>
  		
		<!-- The sidebar's background -->
		<!-- This div must placed right after the sidebar for it to work-->
  		<div class="control-sidebar-bg"></div>
  		
	</div>

	<!-- Bootstrap 3.3.6 -->
	<script src="<s:url value="/" />ext/bootstrap/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="<s:url value="/" />ext/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="<s:url value="/" />ext/AdminLTE/js/app.js"></script>
	<!-- Sparkline -->
	<script src="<s:url value="/" />ext/sparkline/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script src="<s:url value="/" />ext/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<s:url value="/" />ext/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	<!-- SlimScroll 1.3.0 -->
	<script src="<s:url value="/" />ext/slimScroll/jquery.slimscroll.min.js"></script>
	<!-- ChartJS 1.0.1 -->
	<script src="<s:url value="/" />ext/chartjs/Chart.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/jquery.toaster.js"> </script>
	<script src="<s:url value="/" />js/main.js"></script>
</body>
</html>