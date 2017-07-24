package com.flyonsky.quantify.control.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(AdminPageController.PATH)
public class AdminPageController {

	public static final String PATH = "admin";
	
	@RequestMapping("{page}")
	public String execute(@PathVariable("page") String page){
		return PATH + "/" + page;
	}
}
