package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 自动还款表
 * 2017年11月16日09:24:45
 * 操作人：zyf
 * 
 * */

public class Repayment implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableField("r_id")
	private Integer rid;//主键id
	
	@TableField("r_suid")
	private Integer rsuid;//用户id
	
	@TableField("r_moeny")
	private double rmoeny;//还款金额
	
	@TableField("r_time")
	private String rtime;//还款时间
	
	@TableField("r_state")
	private String rstate;//还款状态
	
	@TableField("r_ip")
	private String rip;//ip地址

	public Repayment(Integer rid, Integer rsuid, double rmoeny, String rtime, String rstate, String rip) {
		super();
		this.rid = rid;
		this.rsuid = rsuid;
		this.rmoeny = rmoeny;
		this.rtime = rtime;
		this.rstate = rstate;
		this.rip = rip;
	}

	public Repayment() {
		super();
	}

	public Integer getRid() {
		return rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

	public Integer getRsuid() {
		return rsuid;
	}

	public void setRsuid(Integer rsuid) {
		this.rsuid = rsuid;
	}

	public double getRmoeny() {
		return rmoeny;
	}

	public void setRmoeny(double rmoeny) {
		this.rmoeny = rmoeny;
	}

	public String getRtime() {
		return rtime;
	}

	public void setRtime(String rtime) {
		this.rtime = rtime;
	}

	public String getRstate() {
		return rstate;
	}

	public void setRstate(String rstate) {
		this.rstate = rstate;
	}

	public String getRip() {
		return rip;
	}

	public void setRip(String rip) {
		this.rip = rip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Repayment [rid=" + rid + ", rsuid=" + rsuid + ", rmoeny=" + rmoeny + ", rtime=" + rtime + ", rstate="
				+ rstate + ", rip=" + rip + "]";
	}
	
	
	
	
}
