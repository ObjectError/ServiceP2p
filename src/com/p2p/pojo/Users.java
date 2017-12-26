package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 用户表
 * 2017年11月16日08:07:40
 * 操作人：zyf
 * */


public class Users implements Serializable{

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
	private String suphone; //手机号
	
	@TableField("su_card")
	private String sucard; //身份证
	
	@TableField("su_email")
	private String suemail; //邮箱
	
	@TableField("supay_password")
	private String supaypassword;		//支付密码
	
	@TableField("su_bankcard")
	private String subankcard; //银行卡
	
	@TableField("su_banktype")
	private String subanktype; //银行卡类型
	
	@TableField("su_money")
	private double sumoney; //账户余额
	
	@TableField("su_credit")
	private Integer sucredit; //信用额度
	
	@TableField("su_ip")
	private String suip;	//ip地址

	@TableField("su_password")
	private String supassword;

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

	public String getSuphone() {
		return suphone;
	}

	public void setSuphone(String suphone) {
		this.suphone = suphone;
	}

	public String getSucard() {
		return sucard;
	}

	public void setSucard(String sucard) {
		this.sucard = sucard;
	}

	public String getSuemail() {
		return suemail;
	}

	public void setSuemail(String suemail) {
		this.suemail = suemail;
	}

	public String getSubankcard() {
		return subankcard;
	}

	public void setSubankcard(String subankcard) {
		this.subankcard = subankcard;
	}

	public String getSubanktype() {
		return subanktype;
	}

	public void setSubanktype(String subanktype) {
		this.subanktype = subanktype;
	}

	public double getSumoney() {
		return sumoney;
	}

	public void setSumoney(double sumoney) {
		this.sumoney = sumoney;
	}

	public Integer getSucredit() {
		return sucredit;
	}

	public void setSucredit(Integer sucredit) {
		this.sucredit = sucredit;
	}

	public String getSuip() {
		return suip;
	}

	public void setSuip(String suip) {
		this.suip = suip;
	}

	public String getSupassword() {
		return supassword;
	}

	public void setSupassword(String supassword) {
		this.supassword = supassword;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	
	public String getSupaypassword() {
		return supaypassword;
	}

	public void setSupaypassword(String supaypassword) {
		this.supaypassword = supaypassword;
	}

	public Users() {
		super();
	}

	public Users(Integer suid, String suusername, String suname, String suphone, String sucard, String suemail,
			String supaypassword, String subankcard, String subanktype, double sumoney, Integer sucredit, String suip,
			String supassword) {
		super();
		this.suid = suid;
		this.suusername = suusername;
		this.suname = suname;
		this.suphone = suphone;
		this.sucard = sucard;
		this.suemail = suemail;
		this.supaypassword = supaypassword;
		this.subankcard = subankcard;
		this.subanktype = subanktype;
		this.sumoney = sumoney;
		this.sucredit = sucredit;
		this.suip = suip;
		this.supassword = supassword;
	}

	@Override
	public String toString() {
		return "Users [suid=" + suid + ", suusername=" + suusername + ", suname=" + suname + ", suphone=" + suphone
				+ ", sucard=" + sucard + ", suemail=" + suemail + ", supaypassword=" + supaypassword + ", subankcard="
				+ subankcard + ", subanktype=" + subanktype + ", sumoney=" + sumoney + ", sucredit=" + sucredit
				+ ", suip=" + suip + ", supassword=" + supassword + "]";
	}

}
