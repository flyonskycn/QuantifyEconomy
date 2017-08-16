package com.flyonsky.quantify.service.imp;

import java.io.File;
import java.io.FileFilter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.entity.Securities;
import com.flyonsky.quantify.service.AnnualReportService;
import com.flyonsky.quantify.service.FileService;
import com.flyonsky.quantify.service.SecuritieService;

@Service
public class FileServiceImp implements FileService{
	
	private static final Logger LOG = LoggerFactory.getLogger(FileServiceImp.class);
	
	@Autowired
	public AnnualReportService annualService;
	
	@Autowired
	private SecuritieService securitiesService;
	
	@Value("${sse.download.url}")
	private String sseurl;
	
	@Value("${sse.download.02.url}")
	private String sse02url;
	
	@Value("${sse.download.01.url}")
	private String sse01url;


	@Override
	public boolean downLoadN(String url, String targetDir) {
		boolean flag = false;
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response2 = null;
		try {
			response2 = client.execute(httpPost);
			if(response2.getStatusLine().getStatusCode() != 404){
				HttpEntity entity2 = response2.getEntity();
	          
	        	Pattern p = Pattern.compile("(\\d{1,})_(\\d{1,4})\\d*_(\\w{1,})\\.pdf$");
	        	Matcher m = p.matcher(url);
	        	if(m.find()){
	        		String dirPath = MessageFormat.format("{0}{1}/{2}", targetDir, m.group(1), m.group(2));
	        		File dir = new File(dirPath);
	        		if(!dir.exists()){
	        			dir.mkdirs();
	        		}
	            	String nFileName = MessageFormat.format("{0}/{1}", dirPath, m.group(0));
	            	File nFile = new File(nFileName);
	            	if(!nFile.exists()){
	            		if(nFile.createNewFile()){
	            			FileOutputStream output = new FileOutputStream(nFile);
	            			entity2.writeTo(output);
	            			output.close();
	            			flag = true;
	            		}
	            	}
	        	}
			}
		} catch(Exception e ){
			LOG.error(e.getMessage());
		}finally{
			if(response2 != null){
				try {
					response2.close();
				} catch (IOException e) {
					LOG.error(e.getMessage());
				}
			}
		}
		return flag;
	}

	@Override
	public List<String> recursive(boolean isAnnualReport, String dir) {
		List<String> list = new ArrayList<String>();
		File fd = new File(dir);
		final List<String> keys = this.getAnnualService().queryAnnualKey();
		File[] fs = fd.listFiles(new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				if(pathname.isDirectory()){
					list.addAll(recursive(isAnnualReport,pathname.getAbsolutePath()));
					return false;
				}else{
					if(isAnnualReport){
						Pattern p = Pattern.compile("^(\\d{1,})_(\\d{1,4})_(\\w{1,})\\.pdf$");
				    	Matcher m = p.matcher(pathname.getName());
				    	if(m.matches() && !keys.contains(m.group(1) + "_" + m.group(2))){
				    		return true;
				    	}
				    	return false;
					}
					return true;
				}
			}
			
		});
		for(File f : fs){
			Pattern p = Pattern.compile("^(\\d{1,})_(\\d{1,4})_(\\w{1,})\\.pdf$");
	    	Matcher m = p.matcher(f.getName());
	    	if(m.matches()){
	    		list.add(MessageFormat.format("/{0}/{1}/{2}", m.group(1),m.group(2),m.group(0)));
	    	}
		}
		return list;
	}

	@Override
	public boolean downloadByCode(String code, String targetDir) {
		Securities sec = this.getSecuritiesService().querySecurities(code);
		Date now = Calendar.getInstance().getTime();
		Calendar cal = Calendar.getInstance();
		String url = null;
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat sfsix = new SimpleDateFormat("yyyy-06-01");
		Date releaseTime = null;
		int year = cal.get(Calendar.YEAR);
		String dt = null;
		boolean flag = false;
		while(sec.getIssuedate().before(now)){
			dt = sf.format(now);
			try {
				releaseTime = sf.parse(sfsix.format(now));
				if(now.after(releaseTime)){
					now.setTime(now.getTime() - 24*60*60*1000);
					continue;
				}
			} catch (ParseException e) {
				LOG.error(e.getMessage());
			}
			cal.setTime(now);
			year = cal.get(Calendar.YEAR);
			if(year > 2002){
				url = MessageFormat.format(this.getSseurl(), dt,code,String.valueOf(year - 1));
			}else if(year == 2002){
				url = MessageFormat.format(this.getSse02url(), code,String.valueOf(year - 1));
			}else{
				url = MessageFormat.format(this.getSse01url(), code,String.valueOf(year - 1));
			}
			LOG.debug(url);
			flag = this.downLoadN(url,targetDir);
			if(flag){
				LOG.debug(url);
				now.setTime(now.getTime() - 365*24*60*60*1000l);
				try {
					now = sf.parse(sfsix.format(now));
				} catch (ParseException e) {
					LOG.error(e.getMessage());
				}
			}else{
				now.setTime(now.getTime() - 24*60*60*1000);
			}
		}
		return true;
	}

	@Override
	public Set<String> pdfCode(String dir) {
		Set<String> list = new HashSet<String>();
		File fd = new File(dir);
		File[] fs = fd.listFiles(new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				if(pathname.isDirectory()){
					return true;
				}
				return false;
			}
			
		});
		for(File f : fs){
			list.add(f.getName());
		}
		return list;
	}

	public AnnualReportService getAnnualService() {
		return annualService;
	}

	public void setAnnualService(AnnualReportService annualService) {
		this.annualService = annualService;
	}

	public SecuritieService getSecuritiesService() {
		return securitiesService;
	}

	public void setSecuritiesService(SecuritieService securitiesService) {
		this.securitiesService = securitiesService;
	}

	public String getSseurl() {
		return sseurl;
	}

	public void setSseurl(String sseurl) {
		this.sseurl = sseurl;
	}

	public String getSse02url() {
		return sse02url;
	}

	public void setSse02url(String sse02url) {
		this.sse02url = sse02url;
	}

	public String getSse01url() {
		return sse01url;
	}

	public void setSse01url(String sse01url) {
		this.sse01url = sse01url;
	}
}
