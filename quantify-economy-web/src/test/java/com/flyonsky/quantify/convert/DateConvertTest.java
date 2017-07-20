package com.flyonsky.quantify.convert;

import java.util.Date;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class DateConvertTest {
	
	private static DateConvert dataConvert;
	
	@BeforeClass
	public static void init(){
		dataConvert = new DateConvert();
	}

	@Test
	public void testConvert1(){
		Date dt = dataConvert.convert("2017-7-20 11:30");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert2(){
		Date dt = dataConvert.convert("2017-7-20 11:30:58");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert3(){
		Date dt = dataConvert.convert("2017-7-20 11:30:58.230");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert4(){
		Date dt = dataConvert.convert("2017-7-20 11:03");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert5(){
		Date dt = dataConvert.convert("2017-07-20 11:30");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert6(){
		Date dt = dataConvert.convert("2017-7-20");
		Assert.assertNotNull(dt);
	}
	
	@Test
	public void testConvert7(){
		Date dt = dataConvert.convert("17-7-20 11:30");
		Assert.assertNotNull(dt);
	}
}
