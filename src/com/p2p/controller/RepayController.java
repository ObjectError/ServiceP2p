package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Repayment;
import com.p2p.services.RepayServices;

@Controller
@RequestMapping("/repayment")
public class RepayController {
		
	@Resource(name="repayServiceImpl")
	private RepayServices repayServices;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Repayment> listre = repayServices.list();
		model.addAttribute("listre", listre);
		return "/ntps/table-repayment";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		repayServices.delete(id);
		return "redirect:/repayment/list";
	}
	
	@RequestMapping("/update")
	public String update(Repayment repayment) {
		repayServices.update(repayment);
		return "redirect:/repayment/list";
	}
	
	public String add(Repayment repayment) {
		repayServices.add(repayment);
		return "redirect:/repayment/list";
	}
	
	@RequestMapping("/getby")
	@ResponseBody
	public Object openUserEdit(String rid){
		Integer id = Integer.parseInt(rid);
		Repayment repayment = repayServices.getById(id);
		return repayment;
	}
	
	
}
