package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.p2p.pojo.Recharge;
import com.p2p.services.RechargeService;

@Controller
@RequestMapping("/recharge")
public class RechargeController {
	
	@Resource(name="rechargeServiceImpl")
	private RechargeService rechargeService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Recharge> rechlist = rechargeService.list();
		model.addAttribute("rechlist", rechlist);
		return "/ntps/table-recharge";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		rechargeService.delete(id);
		return "redirect:/recharge/list";
	}
	
	@RequestMapping("/update")
	public String update(Recharge recharge) {
		rechargeService.update(recharge);
		return "redirect:/recharge/list";
	}
	
	@RequestMapping("/add")
	public String add(Recharge recharge) {
		rechargeService.add(recharge);
		return "redirect:/recharge/list";
	}
	
	
}
