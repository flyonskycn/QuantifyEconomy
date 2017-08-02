package com.flyonsky.quantify.control.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AnalyserReport;
import com.flyonsky.quantify.model.ResponseData;
import com.flyonsky.quantify.service.AnalyserService;

@Controller
@RequestMapping(AnalyserController.PATH)
public class AnalyserController extends AbstractAdminController{

	public final static String PATH = "admin/analyser";
	
	@Autowired
	private AnalyserService analyserService;
	
	@RequestMapping(value="analyser",produces="application/json")
	@ResponseBody
	public ResponseData<List<AnalyserReport>> analyser(String code){
		ResponseData<List<AnalyserReport>> result = new ResponseData<List<AnalyserReport>>();
		List<AnalyserReport> data = this.getAnalyserService().query(code);
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
