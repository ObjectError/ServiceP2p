package com.p2p.controller;

import javax.annotation.Resource;
import javax.xml.ws.RequestWrapper;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.services.ServiceS;

@Controller
@RequestMapping(value="controller")
public class TestController {

	@Resource(name="serviceImpl")
	private ServiceS service;
	
	@RequestMapping(name="toindex")
	public String indext() {
		return "ntps/index";
	}
}
