package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.p2p.pojo.ServiceUser;
import com.p2p.services.ServiceUserServices;

@Controller
public class IUserController {
	
	@Resource(name="serviceUserImpl")
	private ServiceUserServices serviceUserServices;
	
	@RequestMapping(name="getAlluser")
	public ModelAndView userget() {
		ModelAndView mo = new ModelAndView();
		mo.setViewName("/ntps/table-dose");
		List<ServiceUser> lists =  serviceUserServices.list();
		mo.addObject("serviceUsers",lists);
		return mo;
	}
	
	
	
}
