<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
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
	<title>股标指标-纵向</title>
</head>
<body class="hold-transition skin-blue sidebar-mini">
    <!-- Main content -->
    <section class="content">
		<div class="container-fluid">
			<div class="row" style="margin-top: 4rem;margin-bottom: 1.75rem;">
				<div class="col-sm-4 col-md-4 col-lg-4 col-md-offset-4">
					<input type="text" class="form-control"/>
				</div>
				<div class="col-sm-1 col-md-1 col-lg-1">
					<a href="#" class="search" style="height: 34px;line-height: 34px;" >查询</a>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 每股净资产 -->
					<div id="netassetspershare"></div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 每股收益 -->
					<div id="pershare"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 每股现金流 -->
					<div id="persharecash"></div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 净资产收益率-->
					<div id="netassetsprofit"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 负债率 -->
					<div id="debtratio"></div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 同比增长率 -->
					<div id="rate"></div>
				</div>
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
	
	<!-- echart 1.0.1 -->
	<script src="<s:url value="/" />ext/echarts/echarts.min.js"></script>
	<script type="text/javascript">
		// 每股净资产
		var netassetspershareChart;
		// 每股收益
		var pershareChart;
		// 每股现金流
		var persharecashChart;
		// 净资产收益率
		var netassetsprofitChart;
		// 负债率
		var debtratioChart;
		// 同比增长率 
		var rateChart;
	    $(function() {  
			// 基于准备好的dom，初始化echarts实例
	        netassetspershareChart = echarts.init(document.getElementById('netassetspershare'));
	        pershareChart = echarts.init(document.getElementById('pershare'));
	        persharecashChart = echarts.init(document.getElementById('persharecash'));
	        netassetsprofitChart = echarts.init(document.getElementById('netassetsprofit'));
	        debtratioChart = echarts.init(document.getElementById('debtratio'));
	        rateChart = echarts.init(document.getElementById('rate'));
	         $(".search").click(function(){
	        	 $.ajax({
	        		 url:'/admin/analyser/securities.co',
	        		 data:{'code':$(".form-control").val()},
	        		 dataType:'json',
	        		 success:function(data){
	        			 if(data.erroCode == 0){
	        				 
	        				 netassetspershareChart.resize({height:500});
	        				 pershareChart.resize({height:500});
	        				 persharecashChart.resize({height:500});
	        				 netassetsprofitChart.resize({height:500});
	        				 debtratioChart.resize({height:500});
	        				 rateChart.resize({height:500});
        			        // 每股净资产配置
        			        var netassetspershareOption = {
        			            title: {
        			                text: data.data.securitiesName + '销售曲线'
        			            },
        			            grid:{
        			            	left:'15%'
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
        			            	name:'金额(RMB)',
        			                type: 'value',
        			                boundaryGap: [0, '5%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '每股净资产',
        			                type: 'line',
        			                data: data.data.netassetsprofitList
        			            }]
        			        };
        			        // 每股净资产
        			        netassetspershareChart.setOption(netassetspershareOption);
           			        
        			        // 每股收益图表的配置项和数据
        			        var pershareOption = {
        			            title: {
        			                text: data.data.securitiesName + '每股收益'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['每股收益']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'每股收益(RMB)',
        			                type: 'value',
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '每股收益',
        			                type: 'line',
        			                data: data.data.pershareList
        			            }]
        			        };
        			        // 每股收益
        			        pershareChart.setOption(pershareOption);
        			        
        			     	// 每股现金
        			        var persharecashOption = {
        			            title: {
        			                text: data.data.securitiesName + '每股现金'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['每股现金']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'每股现金(RMB)',
        			                type: 'value',
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '每股现金',
        			                type: 'line',
        			                data: data.data.persharecashList
        			            }]
        			        };
        			        // 每股现金
        			        persharecashChart.setOption(persharecashOption);
        			        
           			        // 净资产收益率
        			        var netassetsprofitOption = {
        			            title: {
        			                text: data.data.securitiesName + '净资产收益率'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['净资产收益率']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'净资产收益率(%)',
        			                type: 'value',
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '净资产收益率',
        			                type: 'line',
        			                data: data.data.netassetsprofitList
        			            }]
        			        };
        			        netassetsprofitChart.setOption(netassetsprofitOption);
        			        
           			        // 负债率
        			        var debtratioOption = {
        			            title: {
        			                text: data.data.securitiesName + '负债率'
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
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '负债率',
        			                type: 'line',
        			                data: data.data.debtratioList
        			            }]
        			        };
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