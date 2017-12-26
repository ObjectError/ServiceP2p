package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 充值表
 * 2017年11月16日08:17:53
 * 操作人：zyf
 * 
 * */

public class Recharge implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("ch_id")
	private Integer chid;//主键id
	
	@TableField("ch_suid")
	private Integer chsuid;//用户id
	
	@TableField("ch_moeny")
	private double chmoeny;//充值金额
	
	@TableField("ch_order")
	private Integer chorder;//订单号
	
	@TableField("ch_state")
	private String chstate; //充值状态
	
	@TableField("ch_time")
	private String chtime; //充值时间
	
	@TableField("ch_bankid")
	private Integer chbankid;//充值卡id
	
	@TableField("ch_type")
	private String chtype; //充值类型
	
	@TableField("ch_ip")
	private String chip;	//需要充值的IP地址

	public Recharge(Integer chid, Integer chsuid, double chmoeny, Integer chorder, String chstate, String chtime,
			Integer chbankid, String chtype, String chip) {
		super();
		this.chid = chid;
		this.chsuid = chsuid;
		this.chmoeny = chmoeny;
		this.chorder = chorder;
		this.chstate = chstate;
		this.chtime = chtime;
		this.chbankid = chbankid;
		this.chtype = chtype;
		this.chip = chip;
	}

	public Recharge() {
		super();
	}

	public Integer getChid() {
		return chid;
	}

	public void setChid(Integer chid) {
		this.chid = chid;
	}

	public Integer getChsuid() {
		return chsuid;
	}

	public void setChsuid(Integer chsuid) {
		this.chsuid = chsuid;
	}

	public double getChmoeny() {
		return chmoeny;
	}

	public void setChmoeny(double chmoeny) {
		this.chmoeny = chmoeny;
	}

	public Integer getChorder() {
		return chorder;
	}

	public void setChorder(Integer chorder) {
		this.chorder = chorder;
	}

	public String getChstate() {
		return chstate;
	}

	public void setChstate(String chstate) {
		this.chstate = chstate;
	}

	public String getChtime() {
		return chtime;
	}

	public void setChtime(String chtime) {
		this.chtime = chtime;
	}

	public Integer getChbankid() {
		return chbankid;
	}

	public void setChbankid(Integer chbankid) {
		this.chbankid = chbankid;
	}

	public String getChtype() {
		return chtype;
	}

	public void setChtype(String chtype) {
		this.chtype = chtype;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}

	@Override
	public String toString() {
		return "Recharge [chid=" + chid + ", chsuid=" + chsuid + ", chmoeny=" + chmoeny + ", chorder=" + chorder
				+ ", chstate=" + chstate + ", chtime=" + chtime + ", chbankid=" + chbankid + ", chtype=" + chtype
				+ ", chip=" + chip + "]";
	}

	
}
