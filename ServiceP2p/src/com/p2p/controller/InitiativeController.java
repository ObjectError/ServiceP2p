package com.p2p.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.p2p.pojo.Detail;
import com.p2p.pojo.Initiative;
import com.p2p.services.DetailService;
import com.p2p.services.InitiativeService;

@Controller
@RequestMapping("initiative")
public class InitiativeController {

	@Resource(name="initiativeServiceImpl")
	private InitiativeService initiativeService;
	@Resource(name="detailServiceImpl")
	private DetailService detailService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Initiative> list=initiativeService.list();
		model.addAttribute("listInitiative", list);
		return "/ntps/table_initiative";
	}
	@RequestMapping("likeList")
	public String likeList(Initiative initiative,Model model) {
		List<Initiative> likeList=initiativeService.likeList(initiative);
		model.addAttribute("listInitiative",likeList);
		return "/ntps/table_initiative";
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
	        
	        Initiative u=o.readValue(inputString.toString(), Initiative.class);
	        System.out.println("接收的报文为= "+u);
	        u.setItip(ip);
	        initiativeService.add(u);
	        
	        Detail d=new Detail();
	        d.setDip(ip);
	        d.setDmoney(u.getItmoney());
	        d.setDorder(u.getItorder());
	        d.setDstate(2);
	        d.setDsuid(u.getItstate());
	        d.setDtime(u.getIttime());
	        d.setDtype("投标");
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
