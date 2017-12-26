package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Bank;
import com.p2p.services.BankService;

@Controller
@RequestMapping("/bank")
public class BankController {

	@Resource(name="bankServiceImpl")
	private BankService bankService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Bank> bankList = bankService.list();
		model.addAttribute("bankList", bankList);
		return "/ntps/table-dynamic";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		bankService.delete(id);
		return "redirect:/bank/list";
	}
	@RequestMapping("/update")
	public String update(Bank bank){
		bankService.update(bank);
		return "redirect:/bank/list";
	}
	@RequestMapping("/add")
	public String add(Bank bank) {
		bankService.add(bank);
		return "redirect:/bank/list";
		
	}
	
	@RequestMapping("/getby")
	@ResponseBody
	public Object openUserEdit(String bid){
		Integer id = Integer.parseInt(bid);
		Bank bank = bankService.getById(id);
		return bank;
	}
}
