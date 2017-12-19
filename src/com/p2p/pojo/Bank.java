package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 银行卡表
 * 2017年11月16日08:28:22
 * 操作人：zyf
 * 
 * */

public class Bank implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableField("b_id")
	private Integer bid;//主键id
	
	@TableField("b_suid")
	private Integer bsuid;//用户id
	
	@TableField("b_code")
	private Integer bcode;//银行卡号
	
	@TableField("b_type")
	private String btype;//银行卡类型
	
	@TableField("b_moeny")
	private double bmoeny;//银行卡余额
	
	@TableField("b_state")
	private String bstate;//银行卡状态

	public Bank(Integer suid, Integer bsuid, Integer bcode, String btype, double bmoeny, String bstate) {
		super();
		this.bid = suid;
		this.bsuid = bsuid;
		this.bcode = bcode;
		this.btype = btype;
		this.bmoeny = bmoeny;
		this.bstate = bstate;
	}

	public Bank() {
		super();
	}

	public Integer getSuid() {
		return bid;
	}

	public void setSuid(Integer suid) {
		this.bid = suid;
	}

	public Integer getBsuid() {
		return bsuid;
	}

	public void setBsuid(Integer bsuid) {
		this.bsuid = bsuid;
	}

	public Integer getBcode() {
		return bcode;
	}

	public void setBcode(Integer bcode) {
		this.bcode = bcode;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public double getBmoeny() {
		return bmoeny;
	}

	public void setBmoeny(double bmoeny) {
		this.bmoeny = bmoeny;
	}

	public String getBstate() {
		return bstate;
	}

	public void setBstate(String bstate) {
		this.bstate = bstate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Bank [suid=" + bid + ", bsuid=" + bsuid + ", bcode=" + bcode + ", btype=" + btype + ", bmoeny="
				+ bmoeny + ", bstate=" + bstate + "]";
	}
	
	

}
