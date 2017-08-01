package com.flyonsky.quantify.control.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.flyonsky.quantify.service.FileService;

@Controller
@RequestMapping(AnnualController.PATH)
public class AnnualController extends AbstractAdminController{

	public static final String PATH = "admin/annual";
	
	@Value("${quantify.upload.dir}")
	private String uploadDir;
	
	@Autowired
	private FileService fileService;
	
	@RequestMapping("index")
	public String execute(Model model){	
		List<String> data = this.getFileService().recursive(true, this.getUploadDir());
		model.addAttribute("files", data);
		return PATH + "/index";
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
}
