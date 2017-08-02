package com.flyonsky.quantify.control.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AnnualReport;
import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.model.ResponseData;
import com.flyonsky.quantify.service.AnnualReportService;
import com.flyonsky.quantify.service.FileService;

@Controller
@RequestMapping(AnnualController.PATH)
public class AnnualController extends AbstractAdminController{

	public static final String PATH = "admin/annual";
	
	@Value("${quantify.upload.dir}")
	private String uploadDir;
	
	@Autowired
	private FileService fileService;
	
	@Autowired
	private AnnualReportService annualService;
	
	@RequestMapping("index")
	public String execute(Model model){	
		List<String> data = this.getFileService().recursive(true, this.getUploadDir());
		model.addAttribute("files", data);
		return PATH + "/index";
	}
	
	@RequestMapping(value="queryannual",produces="application/json")
	@ResponseBody
	public ResponseData<AnnualReport> queryAnnual(String code,int year){
		ResponseData<AnnualReport> result = new ResponseData<AnnualReport>();
		AnnualReport data = this.getAnnualService().queryAnnualReport(code, year);
		if(data != null){
			result.setData(data);
		}else{
			result.set(1, "non data");
		}
		return result;
	}
	
	@RequestMapping(value="saveannual",produces="application/json")
	@ResponseBody
	public ResponseCode saveAnnual(@RequestBody AnnualReport data){
		ResponseCode result = new ResponseCode();
		boolean flag = false;
		if(data.getId() > 0){
			flag = this.getAnnualService().modifyAnnualReport(data);
		}else{
			flag = this.getAnnualService().createAnnualReport(data);
		}
		if(!flag){
			result.set(1, "数据操作失败");
		}
		return result;
	}

	public FileService getFileService() {
		return fileService;
	}

	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public AnnualReportService getAnnualService() {
		return annualService;
	}

	public void setAnnualService(AnnualReportService annualService) {
		this.annualService = annualService;
	}
}
