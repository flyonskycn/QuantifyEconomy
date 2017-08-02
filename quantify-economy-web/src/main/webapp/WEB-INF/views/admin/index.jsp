<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
	<link rel="stylesheet" href="<s:url value="/" />ext/bootstrap/css/bootstrap.min.css">

	<title>查询</title>
</head>
<body>
	<div class="container-fluid">
		<div class="row" style="margin-top: 4rem;">
			<div class="col-sm-4 col-md-4 col-lg-4 col-md-offset-4">
				<input type="text" class="form-control"/>
			</div>
			<div class="col-sm-1 col-md-1 col-lg-1">
				<a href="#" class="search" style="height: 34px;line-height: 34px;" >查询</a>
			</div>
		</div>
		<div class="row">
			<div id="rate"  style="width: 100%;height:400px;"></div>
		</div>
	</div>
	
	
	<!-- Bootstrap 3.3.6 -->
	<script src="<s:url value="/" />ext/bootstrap/js/bootstrap.min.js"></script>	
	<script type="text/javascript" src="<s:url value="/ext/jquery/jQuery-2.2.0.min.js"></s:url>"></script>
	<script type="text/javascript" src="<s:url value="/ext/jquery.media.js"></s:url>"></script>
	<script type="text/javascript" src="<s:url value="/ext/echarts/echarts.min.js"></s:url>"></script>
	<script type="text/javascript">
		var myChart;
	    $(function() {  
			// 基于准备好的dom，初始化echarts实例
	        myChart = echarts.init(document.getElementById('rate'));
	         $(".search").click(function(){
	        	 $.ajax({
	        		 url:'/admin/analyser/analyser.co',
	        		 data:{'code':$(".form-control").val()},
	        		 dataType:'json',
	        		 success:function(data){
	        			 if(data.erroCode == 0){

        			        // 指定图表的配置项和数据
        			        var option = {
        			            title: {
        			                text: 'ECharts 入门示例'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['销量']
        			            },
        			            xAxis: {
        			                data: ["衬衫","羊毛衫","雪纺衫","裤子","高跟鞋","袜子"]
        			            },
        			            yAxis: {},
        			            series: [{
        			                name: '销量',
        			                type: 'bar',
        			                data: [5, 20, 36, 10, 10, 20]
        			            }]
        			        };

        			        // 使用刚指定的配置项和数据显示图表。
        			        myChart.setOption(option);
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