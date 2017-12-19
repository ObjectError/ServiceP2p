package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 放款表
 * 2017年11月16日09:28:50
 * 操作人：zyf
 * 
 * */


public class Loans implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("l_id")
	private Integer lid;//主键id
	
	@TableField("l_suid")
	private Integer lsuid;//用户id
	
	@TableField("l_moeny")
	private double lmoeny;//放款金额
	
	@TableField("l_time")
	private String ltime;//放款时间
	
	@TableField("l_state")
	private String lstate;//放款状态
	
	@TableField("l_ip")
	private String lip;//ip地址

	public Loans(Integer lid, Integer lsuid, double lmoeny, String ltime, String lstate, String lip) {
		super();
		this.lid = lid;
		this.lsuid = lsuid;
		this.lmoeny = lmoeny;
		this.ltime = ltime;
		this.lstate = lstate;
		this.lip = lip;
	}

	public Loans() {
		super();
	}

	public Integer getLid() {
		return lid;
	}

	public void setLid(Integer lid) {
		this.lid = lid;
	}

	public Integer getLsuid() {
		return lsuid;
	}

	public void setLsuid(Integer lsuid) {
		this.lsuid = lsuid;
	}

	public double getLmoeny() {
		return lmoeny;
	}

	public void setLmoeny(double lmoeny) {
		this.lmoeny = lmoeny;
	}

	public String getLtime() {
		return ltime;
	}

	public void setLtime(String ltime) {
		this.ltime = ltime;
	}

	public String getLstate() {
		return lstate;
	}

	public void setLstate(String lstate) {
		this.lstate = lstate;
	}

	public String getLip() {
		return lip;
	}

	public void setLip(String lip) {
		this.lip = lip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Loans [lid=" + lid + ", lsuid=" + lsuid + ", lmoeny=" + lmoeny + ", ltime=" + ltime + ", lstate="
				+ lstate + ", lip=" + lip + "]";
	}
		
	
}
