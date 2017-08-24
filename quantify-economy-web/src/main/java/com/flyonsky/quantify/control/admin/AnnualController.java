package com.flyonsky.quantify.control.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.flyonsky.quantify.entity.AnnualReport;
import com.flyonsky.quantify.entity.Securities;
import com.flyonsky.quantify.entity.VAnnualReport;
import com.flyonsky.quantify.model.GridData;
import com.flyonsky.quantify.model.QueryInfo;
import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.model.ResponseData;
import com.flyonsky.quantify.service.AnnualReportService;
import com.flyonsky.quantify.service.FileService;
import com.flyonsky.quantify.service.SecuritieService;

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
	
	@Autowired
	private SecuritieService secService;
	
	@RequestMapping("{page}")
	public String execute(@PathVariable("page") String page){
		return PATH + "/" + page;
	}
	
	@RequestMapping("index")
	public String index(Model model){	
		List<String> data = this.getFileService().recursive(true, this.getUploadDir());
		model.addAttribute("files", data);
		return PATH + "/index";
	}
	
	@RequestMapping("edit")
	public String edit(int recordid,Model model){	
		AnnualReport data = this.getAnnualService().queryAnnualReport(recordid);
		model.addAttribute("data", data);
		return PATH + "/edit";
	}
	
	@RequestMapping("querypdf")
	@ResponseBody
	public ResponseData<List<String>> queryPdf(String code){
		ResponseData<List<String>> result = new ResponseData<List<String>>();
		List<String> data = this.getFileService().recursive(true, this.getUploadDir() + code + "/");
		result.setData(data);
		return result;
	}
	
	/**
	 * 年报数据
	 * @param model
	 * @param role 
	 * @param query 
	 * @return
	 */
	@RequestMapping(value="query",produces="application/json")
	@ResponseBody
	public GridData<VAnnualReport> query(Model model, QueryInfo query){
		GridData<VAnnualReport> grid = this.getAnnualService().queryAnnualReport(query);
		return grid;
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
	
	/**
	 * 年报数据
	 * @param model
	 * @param role 
	 * @param query 
	 * @return
	 */
	@RequestMapping(value="querysecurities",produces="application/json")
	@ResponseBody
	public GridData<Securities> querySecurities(Model model, QueryInfo query){
		GridData<Securities> grid = this.getSecService().querySecurities(query);
		return grid;
	}
	
	@RequestMapping("editsecurities")
	public String editSecurities(int recordid,Model model){	
		Securities data = this.getSecService().querySecurities(recordid);
		model.addAttribute("data", data);
		return PATH + "/editsecurities";
	}
	
	@RequestMapping(value="savesecurities",produces="application/json")
	@ResponseBody
	public ResponseCode saveSecurities(@RequestBody Securities data){
		ResponseCode result = new ResponseCode();
		boolean flag = false;
		if(data.getId() != null && data.getId() > 0){
			flag = this.getSecService().modifySecuritie(data);
		}else{
			flag = this.getSecService().createSecuritie(data);
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

	public SecuritieService getSecService() {
		return secService;
	}

	public void setSecService(SecuritieService secService) {
		this.secService = secService;
	}
}
