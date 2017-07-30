package com.flyonsky.quantify.service;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.junit.Ignore;
import org.junit.Test;

import com.flyonsky.quantify.BaseSpringJUnit;

public class FileServiceTest extends BaseSpringJUnit{

	@Ignore
	@Test
	public void test(){
		CloseableHttpClient client = HttpClients.createDefault();
		HttpGet httpGet = new HttpGet("http://static.sse.com.cn/disclosure/listedinfo/announcement/c/2016-03-31/600036_2015_n.pdf");
		CloseableHttpResponse response2 = null;
		try {
			response2 = client.execute(httpGet);
			HttpEntity entity2 = response2.getEntity();
			Header[] header = response2.getAllHeaders();
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
}
