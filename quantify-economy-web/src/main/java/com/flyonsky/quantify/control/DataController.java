package com.flyonsky.quantify.control;

import java.util.Calendar;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DataController {

	@RequestMapping(value="online")
	@ResponseBody
	public Date online(Date querytime){
		
		return Calendar.getInstance().getTime();
	}
}
