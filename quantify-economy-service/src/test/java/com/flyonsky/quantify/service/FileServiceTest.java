package com.flyonsky.quantify.service;

import java.io.IOException;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import com.flyonsky.quantify.BaseSpringJUnit;

public class FileServiceTest extends BaseSpringJUnit{
	
	@Autowired
	private FileService fileService;
	
	@Value("${quantify.upload.dir}")
	private String dir;

	@Ignore
	@Test
	public void test(){
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://static.sse.com.cn/disclosure/listedinfo/announcement/c/2016-03-31/600036_2015_n.pdf");
		CloseableHttpResponse response2 = null;
		try {
			response2 = client.execute(httpGet);
			System.out.println(response2.getFirstHeader("Content-Disposition"));
		} catch(Exception e ){
			e.printStackTrace();
		}finally{
			if(response2 != null){
				try {
					response2.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	@Ignore
	@Test
	public void test2(){
		Pattern p = Pattern.compile("(\\d{1,})_(\\d{1,4})\\d*_(\\w{1,})\\.pdf$");
    	Matcher m = p.matcher("http://static.sse.com.cn/disclosure/listedinfo/announcement/c/2016-06-28/600036_20160628_1.pdf");
    	
    	System.out.println(m.find());
    	System.out.println(m.group(0));
    	System.out.println(m.group(1));
    	System.out.println(m.group(2));
    	System.out.println(m.group(3));
	}
	
	@Ignore
	@Test
	public void testPdfCode(){
		Set<String> codes = this.fileService.pdfCode(this.dir);
		Assert.assertNotNull(codes);
		System.out.println(codes);
	}
}
