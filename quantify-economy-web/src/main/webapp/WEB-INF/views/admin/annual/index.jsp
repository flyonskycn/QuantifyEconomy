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
	<title>年报数据处理</title>
</head>
<body>
	<div class="container-fluid" style="margin-top: 1.75rem;">
     <div class="row">
     	<div class="col-xs-3">
     		<div class="list-group">
     			<c:forEach var="item" items="${files}">
     				<a href="#" class="list-group-item annual">${item}</a>
     			</c:forEach>
			</div>
     	</div>
     	<div class="col-xs-9 content">
     		<form class="form-horizontal">
     		<input type="hidden" id="recortid" value="0">
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="code">股票代码</label>
     				 	<div class="col-sm-8">
					    	<input type="text" class="form-control" id="code" readonly="readonly">
     					</div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="year">年</label>
     					<div class="col-sm-8">
					    	<input type="text" class="form-control" id="year">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="revenue">营业收入</label>
     					<div class="col-sm-8">
					    	<input type="number" min="1" class="form-control" id="revenue">
					    </div>
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="operprofit">营业利润</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="operprofit">
				    	</div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="totalprofit">利润总额</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="totalprofit">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="netprofit">净利润</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="netprofit">
					    </div>
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="shnetprofit">股东净利润</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="shnetprofit">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="deshnetprofit">股东净利润(扣非)</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="deshnetprofit">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="netcashflow">现金流量净额</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="netcashflow">
					    </div>
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="totalassets">总资产</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="totalassets">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="totalliability">总负债</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="totalliability">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="shequity">股东权益</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="shequity">
					    </div>
				  	</div>
     			</div>
     		</div>
     		<div class="row">
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="totalshares">股份总数</label>
     					<div class="col-sm-8">
					    	<input type="number" class="form-control" id="totalshares">
					    </div>
				  	</div>
     			</div>
     			<div class="col-xs-4">
     				<div class="form-group">
     					<label class="control-label col-sm-4" for="remark">备注</label>
     					<div class="col-sm-8">
					    	<textarea class="form-control" id="remark" rows="1"></textarea>
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
     		
     		<a class="media" href="#">PDF File</a>
     		
     	</div>
     </div>
     
	</div>
	
	<script type="text/javascript">
	$(function(){
		$(".annual").click(function(){
			
			var re = new RegExp("(\\d{1,})_(\\d{1,4})\\d*_(\\w{1,})\\.pdf$");
			var m = $(this).html().match(re);
			$('#code').val(m[1]);
			$('#year').val(m[2]);
 			$.ajax({
				url:'/admin/annual/queryannual.co',
				data:{'code':m[1],'year':m[2]},
				dataType:'json',
				success:function(data){
					if(data.erroCode == 0){
						$("#recortid").val(data.data.id);
						$("#revenue").val(data.data.revenue);
						$("#operprofit").val(data.data.operprofit);
						$("#totalprofit").val(data.data.totalprofit);
						$("#netprofit").val(data.data.netprofit);
						$("#shnetprofit").val(data.data.shnetprofit);
						
						$("#deshnetprofit").val(data.data.deshnetprofit);
						$("#netcashflow").val(data.data.netcashflow);
						$("#totalassets").val(data.data.totalassets);
						$("#totalliability").val(data.data.totalliability);
						$("#shequity").val(data.data.shequity);
						$("#totalshares").val(data.data.totalshares);
						
						$("#remark").val(data.data.remark);
 					}else{
 						$("#recortid").val("0");
 						
						$("#revenue").val("0");
						$("#operprofit").val("0");
						$("#totalprofit").val("0");
						$("#netprofit").val("0");
						$("#shnetprofit").val("0");
						
						$("#deshnetprofit").val("0");
						$("#netcashflow").val("0");
						$("#totalassets").val("0");
						$("#totalliability").val("0");
						$("#shequity").val("0");
						$("#totalshares").val("0");
						
						$("#remark").val("");
 					}
				}
			});
			$('.media').media({width:1200, 
				height:700,
				src:$(this).html()});  
		});
		
		$(".btn-success").click(function(){
			var data = {'id':$("#recortid").val(),
					'code':$("#code").val(),
					'year':$("#year").val(),
					'revenue':$("#revenue").val(),
					'operprofit':$("#operprofit").val(),
					'totalprofit':$("#totalprofit").val(),
					'netprofit':$("#netprofit").val(),
					'shnetprofit':$("#shnetprofit").val(),
					'deshnetprofit':$("#deshnetprofit").val(),
					'netcashflow':$("#netcashflow").val(),
					'totalassets':$("#totalassets").val(),
					'totalliability':$("#totalliability").val(),
					'shequity':$("#shequity").val(),
					'totalshares':$("#totalshares").val(),
					'remark':$("#remark").val()};
			$.ajax({
				data:JSON.stringify(data),
				dataType:'json',
				type:'post',
				contentType:'application/json',
				url:'/admin/annual/saveannual.co',
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