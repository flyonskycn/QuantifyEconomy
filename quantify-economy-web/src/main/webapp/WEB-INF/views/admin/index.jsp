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
  	<!-- jQuery 2.2.0 -->
	<script src="<s:url value="/" />ext/jquery/jQuery-2.2.0.min.js"></script>
	<title>查询</title>
</head>
<body class="hold-transition skin-blue sidebar-mini">
    <!-- Main content -->
    <section class="content">
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
				<div id="sales"  style="width: 100%;height:700px;"></div>
			</div>
			<div class="row">
				<div id="assetturnover"  style="width: 100%;height:700px;"></div>
			</div>
			<div class="row">
				<div id="profitasset"  style="width: 100%;height:700px;"></div>
			</div>
			<div class="row">
				<div id="netassets"  style="width: 100%;height:700px;"></div>
			</div>
			<div class="row">
				<div id="debtratio"  style="width: 100%;height:700px;"></div>
			</div>
		</div>
	</section>
	
	
	<!-- Bootstrap 3.3.6 -->
	<script src="<s:url value="/" />ext/bootstrap/js/bootstrap.min.js"></script>
	<!-- FastClick -->
	<script src="<s:url value="/" />ext/fastclick/fastclick.js"></script>
	<!-- AdminLTE App -->
	<script src="<s:url value="/" />ext/AdminLTE/js/app.min.js"></script>
	<!-- Sparkline -->
	<script src="<s:url value="/" />ext/sparkline/jquery.sparkline.min.js"></script>
	<!-- jvectormap -->
	<script src="<s:url value="/" />ext/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
	<script src="<s:url value="/" />ext/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
	
	<!-- AdminLTE for demo purposes -->
	<script src="<s:url value="/" />ext/AdminLTE/js/demo.js"></script>
	
	<!-- echart 1.0.1 -->
	<script src="<s:url value="/" />ext/echarts/echarts.min.js"></script>
	<script type="text/javascript">
		// 销售曲线
		var salesChart;
		// 资产周转率曲线
		var assetturnoverChart;
		// 资产利润率曲线
		var profitChart;
		// 每股净资产
		var netassetsChart;
		// 负债率
		var debtratioChart;
	    $(function() {  
			// 基于准备好的dom，初始化echarts实例
	        salesChart = echarts.init(document.getElementById('sales'));
	        assetturnoverChart = echarts.init(document.getElementById('assetturnover'));
	        profitChart = echarts.init(document.getElementById('profitasset'));
	        netassetsChart = echarts.init(document.getElementById('netassets'));
	        debtratioChart = echarts.init(document.getElementById('debtratio'));
	         $(".search").click(function(){
	        	 $.ajax({
	        		 url:'/admin/analyser/analyserline.co',
	        		 data:{'code':$(".form-control").val()},
	        		 dataType:'json',
	        		 success:function(data){
	        			 if(data.erroCode == 0){

        			        // 销售图表的配置项和数据
        			        var salesOption = {
        			            title: {
        			                text: data.data.securitiesName + '销售曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['营业收入','营业利润']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'金额(RMB)',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '营业收入',
        			                type: 'line',
        			                data: data.data.revenueList
        			            },
        			            {
        			                name: '营业利润',
        			                type: 'line',
        			                data: data.data.operprofitList
        			            }]
        			        };
        			        
           			        // 资本周转率图表的配置项和数据
        			        var assetturnoverOption = {
        			            title: {
        			                text: data.data.securitiesName + '资产周转率曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['资产周转率']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'次',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '资产周转率',
        			                type: 'line',
        			                data: data.data.assetTurnoverList
        			            }]
        			        };
           			        
        			        // 收益率定图表的配置项和数据
        			        var profitOption = {
        			            title: {
        			                text: data.data.securitiesName + '收益率曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['总资产收益率','净资产收益率']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'收益率(%)',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '总资产收益率',
        			                type: 'line',
        			                data: data.data.totalAssetsProfitRateList
        			            },
        			            {
        			                name: '净资产收益率',
        			                type: 'line',
        			                data: data.data.netAssetsProfitRateList
        			            }]
        			        };
        			        
        			     	// 每股净资产图表的配置项和数据
        			        var netassetsOption = {
        			            title: {
        			                text: data.data.securitiesName + '每股净资产曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['每股净资产']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'每股净资产金额(RMB)',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '每股净资产',
        			                type: 'line',
        			                data: data.data.netAssetsPershareList
        			            }]
        			        };
        			     	
        			     	// 负债率图表的配置项和数据
        			        var debtratioOption = {
        			            title: {
        			                text: data.data.securitiesName + '负债率曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['负债率']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'负债率(%)',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '负债率',
        			                type: 'line',
        			                data: data.data.debtRatioList
        			            }]
        			        };

        			        // 使用刚指定的配置项和数据显示图表。
        			        salesChart.setOption(salesOption);
        			        // 资产周转率
        			        assetturnoverChart.setOption(assetturnoverOption);
        			        // 收益率曲线
        			        profitChart.setOption(profitOption);
        			        // 每股净资产
        			        netassetsChart.setOption(netassetsOption);
        			        // 负债率
        			        debtratioChart.setOption(debtratioOption);
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