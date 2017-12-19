package com.p2p.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.services.ServiceS;

@Controller
@RequestMapping(value="controller")
public class TestController {

	@Resource(name="serviceImpl")
	private ServiceS service;

}
