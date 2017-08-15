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
     <form class="form-inline upload" method="post" action="/admin/pdf/upload.co" enctype="multipart/form-data">
     	<div class="form-group">
    		<label for="file">年报</label>
    		<input type="file" class="form-control" name="file" id="file">
  		</div>
		<div class="form-group">
			<a type="submit" class="btn btn-default btn-commit">上传</a>
		</div>
     </form>
     <div class="form-group">
     	<label for="pdfurl">PDF URL</label>
     	<input type="text" class="form-control" id="pdfurl" placeholder="PDF URL">
     </div>
     <div class="form-group">
     	<a href="#" class="btn btn-default btn-url">URL上传</a>
	  </div>
     
     
     <div class="form-group">
     	<label for="code">证券代码</label>
     	<input type="text" class="form-control" id="code" placeholder="证券代码">
     </div>
     <div class="form-group">
     	<a href="#" class="btn btn-default btn-code">年报下载</a>
	  </div>
	</div>
     <script type="text/javascript">
     	$(function(){
     		$(".btn-commit").click(function(){
     			$('.upload').ajaxSubmit({
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
     		
     		$(".btn-url").click(function(){
     			$.ajax({
         			data:{'url':$("#pdfurl").val()},
         			url:'/admin/pdf/downloadpdf.co',
         			type:'POST',
         			dataType:'json',
         			success:function(data){
         				if(data.erroCode == 0){
     						$.toaster("上传成功");
     						$("#pdfurl").val('');
     					}else{
     						$.toaster(data.message);
     					}
         			}
     			})
     		});
     		
     		$(".btn-code").click(function(){
     			$.ajax({
         			data:{'code':$("#code").val()},
         			url:'/admin/pdf/downloadcode.co',
         			type:'POST',
         			dataType:'json',
         			success:function(data){
         				if(data.erroCode == 0){
     						$.toaster("上传成功");
     						$("#code").val('');
     					}else{
     						$.toaster(data.message);
     					}
         			}
     			})
     		});
     	});
     </script>
</body>
</html>