<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	
    <script type="text/javascript" charset="utf-8" src="<s:url value="/" />ext/jquery/jQuery-2.2.0.min.js"> </script>
    <script type="text/javascript" charset="utf-8" src="<s:url value="/" />ext/jquery/jquery.form.js"> </script>
	
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/jquery.toaster.js"> </script>
	<script type="text/javascript" src="<s:url value="/" />js/flyonsky-admin.js"> </script>
	<title>PDF文件上传</title>
</head>
<body>
	<div class="container-fluid" style="margin-top: 1.75rem;">
     <form class="form-inline" method="post" action="/admin/pdf/upload.co" enctype="multipart/form-data">
     	<div class="form-group">
    		<label for="file">年报</label>
    		<input type="file" class="form-control" name="file" id="file">
  		</div>
		<div class="form-group">
			<a type="submit" class="btn btn-default">上传</a>
		</div>
     </form>
	</div>
     <script type="text/javascript">
     	$(function(){
     		$(".btn-default").click(function(){
     			$('form').ajaxSubmit({
     				dataType:"json",
     				success:function(data){
     					if(data.erroCode == 0){
     						$.toaster("上传成功");
     						$('form').clearForm();
     					}else{
     						$.toaster(data.message);
     					}
     				}
     			});
     		});
     	});
     </script>
</body>
</html>