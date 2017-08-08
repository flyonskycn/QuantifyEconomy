
/**
 * 
 * @param chart 图表dom对象
 * @param title 图表标题
 * @param linedata 图表数据
 * @param xdata 图表x轴数据
 */
function linechart(chart,title,linedata,xdata){
	var seriesdata = new Array();
	var legenddata = new Array();
	$.each(linedata, function(i, n){
		 legenddata.push(n.lineName);
		 seriesdata.push({
			 name: n.lineName,
			 type: 'line',
			 data: n.ydata
		 })
	});
	var option = {
       title: {
           text: title
       },
       grid:{
       	left:'15%'
       },
       tooltip: {
       	trigger: 'axis'
       },
       legend: {
           data:legenddata
       },
       xAxis: {
           type: 'category',
           splitLine: {
               show: false
           },
           data:xdata
       },
       yAxis: {
    	   name:linedata.yunit,
           type: 'value',
           boundaryGap: [0, '5%'],
           splitLine: {
               show: false
           }
       },
       series: seriesdata
	};
	// 销售数据
	chart.setOption(option);
}