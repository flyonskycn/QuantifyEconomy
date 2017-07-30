package com.flyonsky.quantify.service.imp;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.MessageFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.flyonsky.quantify.service.FileService;

@Service
public class FileServiceImp implements FileService{
	
	private static final Logger LOG = LoggerFactory.getLogger(FileServiceImp.class);

	@Override
	public boolean downLoadN(String url, String targetDir) {
		boolean flag = false;
		CloseableHttpClient client = HttpClients.createDefault();
		HttpPost httpPost = new HttpPost(url);
		CloseableHttpResponse response2 = null;
		try {
			response2 = client.execute(httpPost);
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

}
