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
        			                text: data.data.securitiesName + '同比曲线'
        			            },
        			            tooltip: {},
        			            legend: {
        			                data:['营业收入','营业利润','利润总额','净利润','归属股东净利润','归属股东净利润(扣非)','现金流量净额','总资产','总负债','股东权益','每股收益']
        			            },
        			            xAxis: {
        			                type: 'category',
        			                splitLine: {
        			                    show: false
        			                },
        			                data:data.data.category
        			            },
        			            yAxis: {
        			            	name:'同比增长率(%)',
        			                type: 'value',
        			                boundaryGap: [0, '100%'],
        			                splitLine: {
        			                    show: false
        			                },
        			                interval:0.2,
        			                min:-1,
        			                max:3.6
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
        			                name: '利润总额',
        			                type: 'line',
        			                data: data.data.totalprofitrateMap
        			            },
        			            {
        			                name: '净利润',
        			                type: 'line',
        			                data: data.data.netprofitrateMap
        			            },
        			            {
        			                name: '归属股东净利润',
        			                type: 'line',
        			                data: data.data.shnetprofitrateMap
        			            },
        			            {
        			                name: '归属股东净利润(扣非)',
        			                type: 'line',
        			                data: data.data.deshnetprofitrateMap
        			            },
        			            {
        			                name: '现金流量净额',
        			                type: 'line',
        			                data: data.data.netcashflowrateMap
        			            },
        			            {
        			                name: '总资产',
        			                type: 'line',
        			                data: data.data.totalassetsrateMap
        			            },
        			            {
        			                name: '总负债',
        			                type: 'line',
        			                data: data.data.totalliabilityrateMap
        			            },
        			            {
        			                name: '股东权益',
        			                type: 'line',
        			                data: data.data.shequityrateMap
        			            },
        			            {
        			                name: '每股收益',
        			                type: 'line',
        			                data: data.data.persharerateMap
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