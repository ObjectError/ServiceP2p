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
	private String bcode;//银行卡号
	
	@TableField("b_type")
	private String btype;//银行卡类型
	
	@TableField("b_money")
	private double bmoney;//银行卡余额
	
	@TableField("b_state")
	private String bstate;//银行卡状态

	public Integer getBid() {
		return bid;
	}

	public void setBid(Integer bid) {
		this.bid = bid;
	}

	public Integer getBsuid() {
		return bsuid;
	}

	public void setBsuid(Integer bsuid) {
		this.bsuid = bsuid;
	}

	public String getBcode() {
		return bcode;
	}

	public void setBcode(String bcode) {
		this.bcode = bcode;
	}

	public String getBtype() {
		return btype;
	}

	public void setBtype(String btype) {
		this.btype = btype;
	}

	public double getBmoney() {
		return bmoney;
	}

	public void setBmoney(double bmoney) {
		this.bmoney = bmoney;
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

	public Bank(Integer bid, Integer bsuid, String bcode, String btype, double bmoney, String bstate) {
		super();
		this.bid = bid;
		this.bsuid = bsuid;
		this.bcode = bcode;
		this.btype = btype;
		this.bmoney = bmoney;
		this.bstate = bstate;
	}

	public Bank() {
		super();
	}

	@Override
	public String toString() {
		return "Bank [bid=" + bid + ", bsuid=" + bsuid + ", bcode=" + bcode + ", btype=" + btype + ", bmoney=" + bmoney
				+ ", bstate=" + bstate + "]";
	}

	
	

}
