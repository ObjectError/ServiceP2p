package com.p2p.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class PageController {
	

	@RequestMapping("toindextt")
	public String openindex() {
		return "/ntps/index";
	}
	
	@RequestMapping("touserss")
	public String openuserss() {
		return "/ntps/table-dose";
	}
}
