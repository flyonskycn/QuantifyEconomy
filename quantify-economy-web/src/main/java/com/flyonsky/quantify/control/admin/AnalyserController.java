package com.flyonsky.quantify.control.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.model.ResponseData;
import com.flyonsky.quantify.model.chart.MultiLineChartData;
import com.flyonsky.quantify.model.chart.SalesChartData;
import com.flyonsky.quantify.model.chart.SalesWithChartData;
import com.flyonsky.quantify.model.chart.SecuritiesChartsData;
import com.flyonsky.quantify.model.chart.SecuritiesRateChartsData;
import com.flyonsky.quantify.service.AnalyserService;

@Controller
@RequestMapping(AnalyserController.PATH)
public class AnalyserController extends AbstractAdminController{

	public final static String PATH = "admin/analyser";
	
	@Autowired
	private AnalyserService analyserService;
	
	@RequestMapping("{index}")
	public String execute(@PathVariable("index") String index){
		return PATH + "/" + index;
	}
	
	@RequestMapping(value="analyser",produces="application/json")
	@ResponseBody
	public ResponseData<SecuritiesRateChartsData> analyser(String code){
		ResponseData<SecuritiesRateChartsData> result = new ResponseData<SecuritiesRateChartsData>();
		SecuritiesRateChartsData data = this.getAnalyserService().query(code);
		result.setData(data);
		return result;
	}
	
	@RequestMapping(value="analyserline",produces="application/json")
	@ResponseBody
	public ResponseData<MultiLineChartData> analyserLine(String code){
		ResponseData<MultiLineChartData> result = new ResponseData<MultiLineChartData>();
		MultiLineChartData data = this.getAnalyserService().queryLine(code);
		result.setData(data);
		return result;
	}
	
	@RequestMapping(value="sales",produces="application/json")
	@ResponseBody
	public ResponseData<SalesChartData> sales(String code){
		ResponseData<SalesChartData> result = new ResponseData<SalesChartData>();
		SalesChartData data = this.getAnalyserService().querySales(code);
		result.setData(data);
		return result;
	}
	
	@RequestMapping(value="salesrate",produces="application/json")
	@ResponseBody
	public ResponseData<SalesWithChartData> salesRate(String code){
		ResponseData<SalesWithChartData> result = new ResponseData<SalesWithChartData>();
		SalesWithChartData data = this.getAnalyserService().queryRateSales(code);
		result.setData(data);
		return result;
	}
	
	@RequestMapping(value="securities",produces="application/json")
	@ResponseBody
	public ResponseData<SecuritiesChartsData> securities(@RequestParam("codes[]") List<String> codes){
		ResponseData<SecuritiesChartsData> result = new ResponseData<SecuritiesChartsData>();
		SecuritiesChartsData data = this.getAnalyserService().querySecurities(codes);
		result.setData(data);
		return result;
	}

	public AnalyserService getAnalyserService() {
		return analyserService;
	}

	public void setAnalyserService(AnalyserService analyserService) {
		this.analyserService = analyserService;
	}
}
