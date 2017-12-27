package com.p2p.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.p2p.pojo.Users;
import com.p2p.services.UsersService;

@Controller
@RequestMapping("/user")
public class UserdsController {

	@Resource(name="usersServiceImpl")
	private UsersService userService;
	
	@RequestMapping("/list")
	public String list(Model model){
		List<Users> userList = userService.list();
		model.addAttribute("userList", userList);
		return "/ntps/table-dose";
	}
	@RequestMapping("/delete/{id}")
	public String delete(@PathVariable Integer id){
		userService.delete(id);
		return "redirect:/user/list";
	}
	
	@RequestMapping("/update")
	public String update(Users users){
		userService.update(users);
		return "redirect:/user/list";
	}
	@RequestMapping("/add")
	public String add(Users users) {
		userService.add(users);
		return "redirect:/user/list";
		
	}
	
	@RequestMapping("/getby")
	@ResponseBody
	public Object openUserEdit(String suid){
		Integer id = Integer.parseInt(suid);
		Users users = userService.getById(id);
		return users;
	}
}
