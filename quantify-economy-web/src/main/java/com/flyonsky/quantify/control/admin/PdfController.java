package com.flyonsky.quantify.control.admin;

import java.io.File;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.flyonsky.quantify.model.ResponseCode;
import com.flyonsky.quantify.service.FileService;

@Controller
@RequestMapping(PdfController.PATH)
public class PdfController extends AbstractAdminController{

	public final static String PATH = "admin/pdf";
	
	@Value("${quantify.upload.dir}")
	private String uploadDir;
	
	@Autowired
	private FileService fileService;
	
	/**
	 * PDF文件上传
	 * @param model
	 * @return
	 */
	@RequestMapping("index")
	public String execute(Model model){	
		return PATH + "/index";
	}
	
	@RequestMapping(value = "upload", method = RequestMethod.POST)
	@ResponseBody
    public ResponseCode handleFormUpload(@RequestParam("file") MultipartFile file) {
		ResponseCode result = new ResponseCode();
        if (!file.isEmpty()) {
            try {
            	String fileName = file.getOriginalFilename();
            	Pattern p = Pattern.compile("^(\\d{1,})_(\\d{1,})_(\\w{1,})\\.pdf$");
            	Matcher m = p.matcher(fileName);
            	if(m.find()){
            		String dirPath = MessageFormat.format("{0}{1}/{2}", this.getUploadDir(),m.group(1),m.group(2));
            		File dir = new File(dirPath);
            		if(!dir.exists()){
            			dir.mkdirs();
            		}
                	String nFileName = MessageFormat.format("{0}/{1}", dirPath,m.group(0));
                	File nFile = new File(nFileName);
                	if(!nFile.exists()){
                		if(nFile.createNewFile()){
                    		file.transferTo(nFile);
                		}else{
                			result.set(4, "文件上传失败");
                		}
                	}else{
                		result.set(2, "文件已存在");
                	}
            	}else{
            		result.set(3, "文件非法");
            	}
			} catch (IOException e) {
				result.set(1, "文件上传失败");
				LOG.error(e.getMessage());
			}
       } else {
    	   result.set(1, "文件上传失败");
       }
       return result;
    }
	
	@RequestMapping(value = "downloadpdf", method = RequestMethod.POST)
	@ResponseBody
    public ResponseCode downLoadPdf(String url) {
		ResponseCode result = new ResponseCode();
		boolean flag = this.getFileService().downLoadN(url, this.getUploadDir());
        if (!flag) {
        	result.set(1, "文件上传失败");
    	}
        return result;
    }

	public String getUploadDir() {
		return uploadDir;
	}

	public void setUploadDir(String uploadDir) {
		this.uploadDir = uploadDir;
	}

	public FileService getFileService() {
		return fileService;
	}

	public void setFileService(FileService fileService) {
		this.fileService = fileService;
	}

}
