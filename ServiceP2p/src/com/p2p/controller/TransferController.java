package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Detail;
import com.p2p.pojo.Transfer;
import com.p2p.services.TransferService;

@Controller
@RequestMapping("/transfer")
public class TransferController {
	
	@Resource(name="transferServiceImpl")
	private TransferService transser;
	
	@RequestMapping("/list")
	public String list(Model model) {
		List<Transfer> listtran = transser.list();
		model.addAttribute("listtran", listtran);
		return "/ntps/table-transfer";
	}
	
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id) {
		transser.delete(id);
		return "redirect:/transfer/list";
	}
	
	@RequestMapping("/update")
	public String update(Transfer transfer){
		transser.update(transfer);
		return "redirect:/transfer/list";
	}
	
	@RequestMapping("/add")
	public String add(Transfer transfer) {
		transser.add(transfer);
		return "redirect:/transfer/list";
		
	}
	
	@RequestMapping("/getby")
	@ResponseBody
	public Object openUserEdit(String tid){
		Integer id = Integer.parseInt(tid);
		Transfer transfer = transser.getById(id);
		return transfer;
	}
}
