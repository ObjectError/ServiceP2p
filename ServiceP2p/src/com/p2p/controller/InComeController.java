package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.Income;
import com.p2p.services.InComeService;

@Controller
@RequestMapping("/income")
public class InComeController {
	
	@Resource(name="inComeServiceImpl")
	private InComeService inComeService; 
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Income> listin = inComeService.list();
		model.addAttribute("listin", listin);
		return "/ntps/table-Income";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		inComeService.delete(id);
		return "redirect:/income/list";
	}
	
	@RequestMapping("/update")
	public String update(Income income) {
		inComeService.update(income);
		return "redirect:/income/list";
	}
	
	@RequestMapping("/add")
	public String add(Income income) {
		inComeService.add(income);
		return "redirect:/income/list";
	}
}
