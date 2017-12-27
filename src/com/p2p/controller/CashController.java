package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Cash;
import com.p2p.pojo.Income;
import com.p2p.services.CashService;

@Controller
@RequestMapping("/cash")
public class CashController {
	
	@Resource(name="cashServiceImpl")
	private CashService cashService;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Cash> listcash = cashService.list();
		model.addAttribute("listcash", listcash);
		return "/ntps/table-cash";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		cashService.delete(id);
		return "redirect:/cash/list";
	} 
	
	@RequestMapping("/update")
	public String update(Cash cash) {
		cashService.update(cash);
		return "redirect:/cash/list";
	}
	
	@RequestMapping("/add")
	public String add(Cash cash) {
		cashService.add(cash);
		return "redirect:/cash/list";
	}
	
	@RequestMapping("/getby")
	@ResponseBody
	public Object openUserEdit(String cid){
		Integer id = Integer.parseInt(cid);
		Cash cash  = cashService.getById(id);
		return cash;
	}
	
}
