package com.p2p.controller;

import java.io.BufferedReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
@RequestMapping("demo")
public class DemoController {
	@RequestMapping("add")
	public String abc(HttpServletRequest request,HttpServletResponse response) {
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
	}catch(Exception e) {
		e.printStackTrace();
	}
	     return null;
	}
}
