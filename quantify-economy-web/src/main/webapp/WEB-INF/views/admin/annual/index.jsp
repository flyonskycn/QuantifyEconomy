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
	<script type="text/javascript" src="<s:url value="/" />js/flyonsky-admin.js"> </script>
	<title>年报数据处理</title>
</head>
<body>
	<div class="container-fluid" style="margin-top: 1.75rem;">
     <div class="row">
     	<div class="col-xs-3">
     		<div class="list-group">
     			<c:forEach var="item" items="${files}">
     				<a href="#" class="list-group-item">${item}</a>
     			</c:forEach>
			</div>
     	</div>
     	<div class="col-xs-9 content">
     		<form class="form-inline">
     		<input type="hidden" value="">
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="code">股票代码</label>
					    <input type="text" class="form-control" id="code" readonly="readonly">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="year">年</label>
					    <input type="text" class="form-control" id="year" readonly="readonly">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="revenue">营业收入</label>
					    <input type="number" class="form-control" id="revenue">
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="operprofit">营业利润</label>
					    <input type="number" class="form-control" id="operprofit">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="totalprofit">利润总额</label>
					    <input type="number" class="form-control" id="totalprofit">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="netprofit">净利润</label>
					    <input type="number" class="form-control" id="netprofit">
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="shnetprofit">归属股东净利润</label>
					    <input type="number" class="form-control" id="shnetprofit">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="deshnetprofit">扣非后归属股东净利润</label>
					    <input type="number" class="form-control" id="deshnetprofit">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="netcashflow">经营活动产生的现金流量净额</label>
					    <input type="number" class="form-control" id="netcashflow">
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="totalassets">总资产</label>
					    <input type="number" class="form-control" id="totalassets">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="totalliability">总负债</label>
					    <input type="number" class="form-control" id="totalliability">
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="shequity">股东权益</label>
					    <input type="number" class="form-control" id="shequity">
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label for="totalshares">股份总数</label>
					    <input type="number" class="form-control" id="totalshares">
				  	</div>
     			</div>
     			<div class="col-xs-8">
     				<div class="form-group">
     					<label for="remark">备注</label>
					    <textarea class="form-control" id="remark" rows="10">
						</textarea>
				  	</div>
     			</div>
     		</div>
     		</form>
     	</div>
     </div>
     
	</div>
</body>
</html>