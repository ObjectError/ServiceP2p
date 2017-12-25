package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.Admin;
import com.p2p.services.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController{

	@Resource(name="adminServiceImpl")
	private AdminService adminService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Admin> adminList = adminService.list();
		model.addAttribute("adminList", adminList);
		return "/ntps/profile";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		adminService.delete(id);
		return "redirect:/admin/list";
	}
	@RequestMapping("/update")
	public String update(Admin admin){
			
		adminService.update(admin);
		return "redirect:/admin/list";
	}
	@RequestMapping("/add")
	public String add(Admin admin) {
		adminService.add(admin);
		return "redirect:/admin/list";
		
	}
}
