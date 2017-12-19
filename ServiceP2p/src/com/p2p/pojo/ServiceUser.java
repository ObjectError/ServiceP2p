package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 用户表
 * 2017年11月16日08:07:40
 * 操作人：zyf
 * */


public class ServiceUser implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableField("su_id")
	private Integer suid;//主键id
	
	@TableField("su_username")
	private String suusername; //用户名
	
	@TableField("su_name")
	private String suname; //真实姓名
	
	@TableField("su_phone")
	private Integer suphone; //手机号
	
	@TableField("su_card")
	private Integer sucard; //身份证
	
	@TableField("su_email")
	private String suemail; //邮箱
	
	@TableField("su_bankcard")
	private Integer subankcard; //银行卡
	
	@TableField("su_banktype")
	private String subanktype; //银行卡类型
	
	@TableField("su_moeny")
	private double sumoeny; //账户余额
	
	@TableField("su_credit")
	private Integer sucredit; //信用额度
	
	@TableField("su_ip")
	private String suip;	//ip地址

	@TableField("su_password")
	private String supassword;

	

	public ServiceUser(Integer suid, String suusername, String suname, Integer suphone, Integer sucard, String suemail,
			Integer subankcard, String subanktype, double sumoeny, Integer sucredit, String suip, String supassword) {
		super();
		this.suid = suid;
		this.suusername = suusername;
		this.suname = suname;
		this.suphone = suphone;
		this.sucard = sucard;
		this.suemail = suemail;
		this.subankcard = subankcard;
		this.subanktype = subanktype;
		this.sumoeny = sumoeny;
		this.sucredit = sucredit;
		this.suip = suip;
		this.supassword = supassword;
	}

	public ServiceUser(Integer suid, String suusername, String suname, Integer suphone, Integer sucard, String suemail,
			Integer subankcard, String subanktype, double sumoeny, Integer sucredit, String suip) {
		super();
		this.suid = suid;
		this.suusername = suusername;
		this.suname = suname;
		this.suphone = suphone;
		this.sucard = sucard;
		this.suemail = suemail;
		this.subankcard = subankcard;
		this.subanktype = subanktype;
		this.sumoeny = sumoeny;
		this.sucredit = sucredit;
		this.suip = suip;
	}

	public ServiceUser(Integer suid, String suusername, String suname, Integer suphone, Integer sucard, String suemail,
			Integer subankcard, String subanktype, double sumoeny, Integer sucredit) {
		super();
		this.suid = suid;
		this.suusername = suusername;
		this.suname = suname;
		this.suphone = suphone;
		this.sucard = sucard;
		this.suemail = suemail;
		this.subankcard = subankcard;
		this.subanktype = subanktype;
		this.sumoeny = sumoeny;
		this.sucredit = sucredit;
	}

	public ServiceUser() {
		super();
	}

	public Integer getSuid() {
		return suid;
	}

	public void setSuid(Integer suid) {
		this.suid = suid;
	}

	public String getSuusername() {
		return suusername;
	}

	public void setSuusername(String suusername) {
		this.suusername = suusername;
	}

	public String getSuname() {
		return suname;
	}

	public void setSuname(String suname) {
		this.suname = suname;
	}

	public Integer getSuphone() {
		return suphone;
	}

	public void setSuphone(Integer suphone) {
		this.suphone = suphone;
	}

	public Integer getSucard() {
		return sucard;
	}

	public void setSucard(Integer sucard) {
		this.sucard = sucard;
	}

	public String getSuemail() {
		return suemail;
	}

	public void setSuemail(String suemail) {
		this.suemail = suemail;
	}

	public Integer getSubankcard() {
		return subankcard;
	}

	public void setSubankcard(Integer subankcard) {
		this.subankcard = subankcard;
	}

	public String getSubanktype() {
		return subanktype;
	}

	public void setSubanktype(String subanktype) {
		this.subanktype = subanktype;
	}

	public double getSumoeny() {
		return sumoeny;
	}

	public void setSumoeny(double sumoeny) {
		this.sumoeny = sumoeny;
	}

	public Integer getSucredit() {
		return sucredit;
	}

	public void setSucredit(Integer sucredit) {
		this.sucredit = sucredit;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getSuip() {
		return suip;
	}

	public void setSuip(String suip) {
		this.suip = suip;
	}
	@Override
	public String toString() {
		return "ServiceUser [suid=" + suid + ", suusername=" + suusername + ", suname=" + suname + ", suphone="
				+ suphone + ", sucard=" + sucard + ", suemail=" + suemail + ", subankcard=" + subankcard
				+ ", subanktype=" + subanktype + ", sumoeny=" + sumoeny + ", sucredit=" + sucredit + ", suip=" + suip
				+ ", supassword=" + supassword + "]";
	}
	public String getSupassword() {
		return supassword;
	}

	public void setSupassword(String supassword) {
		this.supassword = supassword;
	}
	

}
