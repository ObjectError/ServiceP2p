package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 账单明细表
 * 2017年11月16日08:43:12
 * 操作人：zyf
 * 
 * */


public class Detail implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("d_id")
	private Integer did;//主键id
	
	@TableField("d_suid")
	private Integer dsuid;//用户id
	
	@TableField("d_moeny")
	private double dmoeny;//金额
	
	@TableField("d_type")
	private String dtype;//明细类型
	
	@TableField("d_time")
	private String dtime;//受理时间
	
	@TableField("d_order")
	private Integer dorder;//订单号
	
	@TableField("d_state")
	private String dstate;//交易状态

	public Detail(Integer did, Integer dsuid, double dmoeny, String dtype, String dtime, Integer dorder,
			String dstate) {
		super();
		this.did = did;
		this.dsuid = dsuid;
		this.dmoeny = dmoeny;
		this.dtype = dtype;
		this.dtime = dtime;
		this.dorder = dorder;
		this.dstate = dstate;
	}

	public Detail() {
		super();
	}

	public Integer getDid() {
		return did;
	}

	public void setDid(Integer did) {
		this.did = did;
	}

	public Integer getDsuid() {
		return dsuid;
	}

	public void setDsuid(Integer dsuid) {
		this.dsuid = dsuid;
	}

	public double getDmoeny() {
		return dmoeny;
	}

	public void setDmoeny(double dmoeny) {
		this.dmoeny = dmoeny;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public String getDtime() {
		return dtime;
	}

	public void setDtime(String dtime) {
		this.dtime = dtime;
	}

	public Integer getDorder() {
		return dorder;
	}

	public void setDorder(Integer dorder) {
		this.dorder = dorder;
	}

	public String getDstate() {
		return dstate;
	}

	public void setDstate(String dstate) {
		this.dstate = dstate;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Detail [did=" + did + ", dsuid=" + dsuid + ", dmoeny=" + dmoeny + ", dtype=" + dtype + ", dtime="
				+ dtime + ", dorder=" + dorder + ", dstate=" + dstate + "]";
	}
	
	
}
