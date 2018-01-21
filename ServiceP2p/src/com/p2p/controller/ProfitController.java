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
import com.p2p.pojo.Fabiao;
import com.p2p.pojo.Initiative;
import com.p2p.pojo.Profit;
import com.p2p.pojo.Repayment;
import com.p2p.pojo.Users;
import com.p2p.services.DetailService;
import com.p2p.services.FabiaoService;
import com.p2p.services.InitiativeService;
import com.p2p.services.ProfitService;
import com.p2p.services.UsersService;
import com.p2p.util.SendServiceUtil;

@Controller
@RequestMapping("/profit")
public class ProfitController {

	@Resource(name="profitServiceImpl")
	private ProfitService profitService;
	@Resource(name="fabiaoServiceImpl")
	private FabiaoService fabiaoService;
	@Resource(name="initiativeServiceImpl")
	private InitiativeService initiativeService;
	@Resource(name="usersServiceImpl")
	private UsersService userService;
	@Resource(name="detailServiceImpl")
	private DetailService detailService;
	
	@RequestMapping("list")
	public String list(Model model) {
		List<Profit> list=profitService.list();
		model.addAttribute("profitList", list);
		return "/ntps/tableprofit";
	}
	
	@RequestMapping("addProfit")
	public void addProfit() throws Exception {
		
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date=new Date();
		//查询所有发标
		List<Fabiao> listFabiao=fabiaoService.list();
		for(Fabiao fabiao:listFabiao) {
			Date date2=df.parse(fabiao.getFshktime());
			//判断是否满标
			if(fabiao.getFsstate()==7) {
				//判断是否在收益期内
				if(date.getTime()<date2.getTime()) {
					//根据标的订单号去查询投标人
					Initiative initiative=new Initiative();
					initiative.setItorder(fabiao.getFsorder());
					initiative.getUser().setSuname(null);
					List<Initiative> listInitiative=initiativeService.likeList(initiative);
					
					for(Initiative init:listInitiative) {
						//根据用户id查询出用户的对象
						Users user=userService.getById(init.getItsuid());
						
						//计算收益的天数	1天=1*24*60*60*1000
						
						Date d1=df.parse(fabiao.getFshktime());
						Date d2=df.parse(fabiao.getFstime());
						int day=(int)(d1.getTime()-d2.getTime())/86400000;
						
						//拿出计算总收益的一半做为用户每天的收益
						double money=fabiao.getFsmoney()*fabiao.getFsroe()*0.5;
						
						//计算每天应该拿出多少钱作为用户的收益
						double everydayMoney=Math.round(money/day*100)/100;
						
						//每个用户所投金额所占的百分比
						double everyoneRoe=init.getItmoney()/fabiao.getFsmoney();
						
						//每个用户每天得到的收益
						double everymoney=Math.round(everyoneRoe*everydayMoney*100)/100;
						
						//获取到用户的余额并且给用户加上收益
						user.setSumoney(user.getSumoney()+everymoney);
						
						//给收益表插入数据
						Profit profit=new Profit();
						profit.setPfmoney(everymoney);
						profit.setPfmoneywhere(fabiao.getFstitle());
						profit.setPftime(df.format(new Date()));
						profit.setUid(user.getId());
						
						//给资金明细插入数据
						SimpleDateFormat dfs=new SimpleDateFormat("yyyyMMddHHmmss");
						Detail detail = new Detail();
						detail.setDmoney(everymoney);
						detail.setDsuid(user.getId());
						detail.setDtime(profit.getPftime());
						detail.setDorder(dfs.format(new Date()));
						detail.setDstate(2);
						detail.setDtype("投资收益");
						//向前台发送收益请求
						int count=SendServiceUtil.list(profit, "192.168.90.47:8080/Finances/");
						//向前台发送修改用户金额请求
						int counts=SendServiceUtil.list(user, "192.168.90.47:8080/Finances/");
						if(count==1&&counts==1) {
							//修改数据库
							detailService.add(detail);
							profitService.add(profit);
							userService.update(user);
						}
					}
				}
			}
		}
	}
	
	//用户每天收益接口
	@RequestMapping("add")
	public void add(HttpServletRequest request,HttpServletResponse response) throws IOException {
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
	        
	        
	        //事物开始。。。。。。。。。。。。。。。
	        
	        Profit u=o.readValue(inputString.toString(), Profit.class);
	        
	        Users user=userService.getById(u.getUid());
	        user.setSumoney(user.getSumoney()+u.getPfmoney());
	        user.setSucanmoney(user.getSucanmoney()+u.getPfmoney());
	        
	        Users user1=userService.getById(1);
	        user1.setSumoney(user1.getSumoney()-u.getPfmoney());
	        user1.setSucanmoney(user1.getSucanmoney()-u.getPfmoney());
        
	        Detail d=new Detail();
       	 	d.setDmoney(u.getPfmoney());
			d.setDstate(2);
			d.setDsuid(u.getUid());
			d.setDtime(u.getPftime());
			d.setDtype("投标收益");
			//d.setDorder(u.get);
			
			 Detail d1=new Detail();
       	 	d1.setDmoney(u.getPfmoney());
			d1.setDstate(2);
			d1.setDsuid(1);
			d1.setDtime(u.getPftime());
			d1.setDtype("投标垫付收益");
			
			profitService.add(u);
			userService.update(user);
			userService.update(user1);
			detailService.add(d);
			detailService.add(d1);
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
	/*public static void main(String[] args) throws ParseException {
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date d1=df.parse("2018-01-21 09:01:00");
		Date d2=df.parse("2018-01-19 09:01:00");
		Date d3=new Date();
		System.out.println((d1.getTime()-d2.getTime())/(1*24*60*60*1000));
		System.out.println(1*24*60*60*1000);
		System.out.println(d3.getTime()>d2.getTime());
	}*/
}
