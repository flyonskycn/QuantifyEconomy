package com.flyonsky.quantify.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.flyonsky.quantify.BaseSpringJUnit;

public class AnnualReportServiceTest extends BaseSpringJUnit{

	@Autowired
	private AnnualReportService service;
	
	@Test
	public void testQueryAnnualKey(){
		List<String> list = this.service.queryAnnualKey();
		Assert.assertNotNull(list);
		System.out.println(list);
	}
}
