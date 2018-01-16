package com.p2p.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.pojo.Detail;
import com.p2p.pojo.Fabiao;
import com.p2p.pojo.Recharge;
import com.p2p.services.DetailService;
import com.p2p.services.FabiaoService;

@Controller
@RequestMapping("/fabiao")
public class FabiaoController {
	@Resource(name="fabiaoServiceImpl")
	private FabiaoService fabiaoService;
	@Resource(name="detailServiceImpl")
	private DetailService detailService;
	
	
	@RequestMapping("list")
	public String listFabiao(Model model) {
		List<Fabiao> listfabiao = fabiaoService.list();
		model.addAttribute("listfabiao", listfabiao);
		return "/ntps/table-fabiao";
	}
	@RequestMapping("add")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException {
		 String ip = request.getRemoteHost(); 
			
	     System.out.println("ip地址="+ip);
	      
	   
	     try {
	    	//获取接收的报文
			BufferedReader reader=request.getReader();
			
			String line="";
			
			 StringBuffer inputString = new StringBuffer();  
		        while ((line = reader.readLine()) != null) {  
		        inputString.append(line);  
		     }  
	       
		    //jackJson    
	        ObjectMapper o=new ObjectMapper();
	        
	        Fabiao u=o.readValue(inputString.toString(), Fabiao.class);
	        System.out.println("接收的报文为= "+u);
	        u.setFsip(ip);
	        fabiaoService.add(u);
	        
	        Detail d=new Detail();
	        d.setDip(ip);
	        d.setDmoney(u.getFsmoney());
	        d.setDorder(u.getFsorder());
	        d.setDstate(2);
	        d.setDsuid(u.getFssuid());
	        d.setDtime(u.getFstime());
	        d.setDtype("发标");
	        detailService.add(d);
	        // 要返回的报文  
	       StringBuffer resultBuffer = new StringBuffer();  
	       resultBuffer.append("1");
	     
	       // 设置发送报文的格式  
	       response.setContentType("text/xml");  
	       response.setCharacterEncoding("UTF-8");  
	   
	       PrintWriter out = response.getWriter();  
	       out.println(resultBuffer.toString());  
	       out.flush();  
	       out.close();  
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			 StringBuffer resultBuffer = new StringBuffer();  
		       resultBuffer.append("2");
		     
		       // 设置发送报文的格式  
		       response.setContentType("text/xml");  
		       response.setCharacterEncoding("UTF-8");  
		   
		       PrintWriter out = response.getWriter();  
		       out.println(resultBuffer.toString());  
		       out.flush();  
		       out.close();  
			e.printStackTrace();
		}
		
	}
}
