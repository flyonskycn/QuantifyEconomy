package com.flyonsky.quantify.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.convert.converter.Converter;

/**
 * 日期格式化输入
 * @author luowg
 *
 */
public class DateConvert implements Converter<String, Date>{
	
	private static final Logger LOG = LoggerFactory.getLogger(DateConvert.class);

	// yyyy-MM-dd
	private SimpleDateFormat dayFormat;
	// yyyy-MM-dd HH:mm
	private SimpleDateFormat dhmFormat;
	// yyyy-MM-dd HH:mm:ss
	private SimpleDateFormat format;
	// yyyy-MM-dd HH:mm:ss.SSS
	private SimpleDateFormat dhmsFormat;
	
	public DateConvert(){
		dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		dhmFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		dhmsFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
	}

    @Override
    public Date convert(String date) {
        try {
        	if(StringUtils.isNotBlank(date)){
        		Pattern pday = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2}$");
        		Pattern pdhmay = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}$");
        		Pattern p = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}$");
        		Pattern pdhms = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}$");
        		if(pdhms.matcher(date).matches()){
        			return dhmsFormat.parse(date);
        		}else if(p.matcher(date).matches()){
        			return format.parse(date);
        		}else if(pdhmay.matcher(date).matches()){
        			return dhmFormat.parse(date);
        		}else if(pday.matcher(date).matches()){
        			return dayFormat.parse(date);
        		}
        	}
        } catch (ParseException e) {
        	LOG.error(e.getMessage());
        }
        return null;
    }
}
