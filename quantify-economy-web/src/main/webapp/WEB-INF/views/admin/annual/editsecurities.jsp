<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="//cdn.bootcss.com/bootstrap/3.3.5/css/bootstrap.min.css" rel="stylesheet">
	
    <script type="text/javascript" charset="utf-8" src="<s:url value="/" />ext/jquery/jQuery-2.2.0.min.js"> </script>
	
	<script src="//cdn.bootcss.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="<s:url value="/" />ext/jquery.toaster.js"> </script>
	<script type="text/javascript" src="<s:url value="/" />ext/jquery.media.js"></script>
	<script type="text/javascript" src="<s:url value="/" />js/flyonsky-admin.js"> </script>
	<title>证券数据</title>
</head>
<body>
	<div class="container-fluid" style="margin-top: 1.75rem;">
     <div class="row">
     	<div class="col-xs-12 content">
     		<form class="form-horizontal">
	     		<input type="hidden" id="recortid" value="${data.id}">
	     		<div class="row">
	     			<div class="col-xs-4">
	     				<div class="form-group">
	     					<label class="control-label col-sm-4" for="code">股票代码</label>
	     				 	<div class="col-sm-8">
						    	<input type="text" class="form-control" id="code" value="${data.code}">
	     					</div>
					  	</div>
	     			</div>
	     			<div class="col-xs-4">
	     				<div class="form-group">
	     					<label class="control-label col-sm-4" for="year">股票名称</label>
	     					<div class="col-sm-8">
						    	<input type="text" class="form-control" id="name" value="${data.name}">
						    </div>
					  	</div>
	     			</div>
	     			<div class="col-xs-4">
	     				<div class="form-group">
	     					<label class="control-label col-sm-4">&nbsp;</label>
	     					<div class="col-sm-8">
						    	<a href="#" class="btn btn-success btn-md">保存</a>
						    </div>
					  	</div>
	     			</div>
	     		</div>
     		</form>
     		
     	</div>
     </div>
     
	</div>
	
	<script type="text/javascript">
	$(function(){
		
		$(".btn-success").click(function(){
			var data = {'id':$("#recortid").val(),
					'code':$("#code").val(),
					'name':$("#name").val()};
			$.ajax({
				data:JSON.stringify(data),
				dataType:'json',
				type:'post',
				contentType:'application/json',
				url:'/admin/annual/savesecurities.co',
				success:function(data){
					if(data.erroCode == 0){
 						$.toaster("保存成功");
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