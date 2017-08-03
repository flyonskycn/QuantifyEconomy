package com.flyonsky.quantify.control.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.model.ResponseData;
import com.flyonsky.quantify.model.YearOnYearData;
import com.flyonsky.quantify.service.AnalyserService;

@Controller
@RequestMapping(AnalyserController.PATH)
public class AnalyserController extends AbstractAdminController{

	public final static String PATH = "admin/analyser";
	
	@Autowired
	private AnalyserService analyserService;
	
	@RequestMapping(value="analyser",produces="application/json")
	@ResponseBody
	public ResponseData<YearOnYearData> analyser(String code){
		ResponseData<YearOnYearData> result = new ResponseData<YearOnYearData>();
		YearOnYearData data = this.getAnalyserService().query(code);
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
