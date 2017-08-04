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
	<title>收入分析-纵向</title>
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
					<!-- 销售额 -->
					<div id="sales"></div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 利润率 -->
					<div id="profit"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 销售同比 -->
					<div id="salesrate"></div>
				</div>
				<div class="col-sm-6 col-md-6 col-lg-6">
					<!-- 资产周转次数 -->
					<div id="assetturnover"></div>
				</div>
			</div>
			<div class="row">
				<div class="col-sm-6 col-md-6 col-lg-6">
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
		// 销售曲线
		var salesChart;
		// 资产周转率曲线
		var assetturnoverChart;
		// 资产利润率曲线
		var profitChart;
		// 销售同比
		var salesrateChart;
	    $(function() {  
			// 基于准备好的dom，初始化echarts实例
	        salesChart = echarts.init(document.getElementById('sales'));
	        assetturnoverChart = echarts.init(document.getElementById('assetturnover'));
	        profitChart = echarts.init(document.getElementById('profit'));
	        salesrateChart = echarts.init(document.getElementById('salesrate'));
	         $(".search").click(function(){
	        	 $.ajax({
	        		 url:'/admin/analyser/sales.co',
	        		 data:{'code':$(".form-control").val()},
	        		 dataType:'json',
	        		 success:function(data){
	        			 if(data.erroCode == 0){
	        				 
	        				 salesChart.resize({height:500});
	        				 assetturnoverChart.resize({height:500});
	        				 profitChart.resize({height:500});
        			        // 销售图表的配置项和数据
        			        var salesOption = {
        			            title: {
        			                text: data.data.securitiesName + '销售曲线'
        			            },
        			            grid:{
        			            	left:'15%'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['营业收入','营业利润','净利润','总利润']
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
        			                name: '营业收入',
        			                type: 'line',
        			                data: data.data.revenueList
        			            },
        			            {
        			                name: '营业利润',
        			                type: 'line',
        			                data: data.data.operprofitList
        			            },
        			            {
        			                name: '净利润',
        			                type: 'line',
        			                data: data.data.netprofitList
        			            },
        			            {
        			                name: '总利润',
        			                type: 'line',
        			                data: data.data.totalprofitList
        			            }]
        			        };
        			        // 销售数据
        			        salesChart.setOption(salesOption);
           			        
        			        // 收益率定图表的配置项和数据
        			        var profitOption = {
        			            title: {
        			                text: data.data.securitiesName + '利润率曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['毛利率','净利率']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'利润率(%)',
        			                type: 'value',
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '毛利率',
        			                type: 'line',
        			                data: data.data.grossmarginList
        			            },
        			            {
        			                name: '净利率',
        			                type: 'line',
        			                data: data.data.netinterestrateList
        			            }]
        			        };
        			        // 收益率曲线
        			        profitChart.setOption(profitOption);
        			        
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
        			                boundaryGap: [0, '10%'],
        			                splitLine: {
        			                    show: false
        			                }
        			            },
        			            series: [{
        			                name: '资产周转率',
        			                type: 'line',
        			                data: data.data.assetturnoverList
        			            }]
        			        };
        			        assetturnoverChart.setOption(assetturnoverOption);
        			        
	  					}else{
	  						$.toaster(data.message);
	  					}
	        		 }
	        	 })
	        	 
	        	 $.ajax({
	        		 url:'/admin/analyser/salesrate.co',
	        		 data:{'code':$(".form-control").val()},
	        		 dataType:'json',
	        		 success:function(data){
	        			 
	        			 salesrateChart.resize({height:500});
     			        // 销售图表的配置项和数据
     			        var salesrateOption = {
     			            title: {
     			                text: data.data.securitiesName + '销售同比'
     			            },
     			            grid:{
     			            	left:'15%'
     			            },
     			            tooltip: {},
     			            legend: {
     			                data:['营业收入','营业利润','净利润','总利润']
     			            },
     			            xAxis: {
     			                type: 'category',
     			                splitLine: {
     			                    show: false
     			                },
     			                data:data.data.category
     			            },
     			            yAxis: {
     			            	name:'同比(%)',
     			                type: 'value',
     			                boundaryGap: ['10%', '5%'],
     			                splitLine: {
     			                    show: false
     			                }
     			            },
     			            series: [{
     			                name: '营业收入',
     			                type: 'line',
     			                data: data.data.revenuerateMap
     			            },
     			            {
     			                name: '营业利润',
     			                type: 'line',
     			                data: data.data.operprofitrateMap
     			            },
     			            {
     			                name: '净利润',
     			                type: 'line',
     			                data: data.data.netprofitrateMap
     			            },
     			            {
     			                name: '总利润',
     			                type: 'line',
     			                data: data.data.totalprofitrateMap
     			            }]
     			        };
     			        // 销售数据
     			        salesrateChart.setOption(salesrateOption);
	        		 }
	        	 })
	         });
	    });
	</script>
</body>
</html>