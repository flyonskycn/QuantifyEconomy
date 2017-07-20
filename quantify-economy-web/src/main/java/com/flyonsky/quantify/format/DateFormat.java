package com.flyonsky.quantify.format;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Pattern;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.Formatter;

/**
 * 时间格式化
 * @author luowg
 *
 */
public class DateFormat implements Formatter<Date>{
	
	private static final Logger LOG = LoggerFactory.getLogger(DateFormat.class);

	@Override
	public String print(Date object, Locale locale) {
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		LOG.debug(sf.format(object));
		return sf.format(object);
	}

	@Override
	public Date parse(String text, Locale locale) throws ParseException {
		SimpleDateFormat dayFormat = new SimpleDateFormat("yyyy-MM-dd");
		SimpleDateFormat dhmFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		SimpleDateFormat dhmsFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    	if(StringUtils.isNotBlank(text)){
    		Pattern pdhmay = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}$");
    		Pattern p = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}$");
    		Pattern pdhms = Pattern.compile("^\\d{1,4}-\\d{1,2}-\\d{1,2} \\d{1,2}:\\d{1,2}:\\d{1,2}\\.\\d{1,3}$");
    		if(pdhms.matcher(text).matches()){
    			return dhmsFormat.parse(text);
    		}else if(p.matcher(text).matches()){
    			return format.parse(text);
    		}else if(pdhmay.matcher(text).matches()){
    			return dhmFormat.parse(text);
    		}else{
    			return dayFormat.parse(text);
    		}
    	}
        return null;
	}

}
