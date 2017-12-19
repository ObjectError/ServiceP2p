package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 转账表
 * 2017年11月16日09:17:04
 * 操作人：zyf
 * 
 * */

public class Transfer implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@TableField("t_id")
	private Integer iid;//主键id
	
	@TableField("t_suid")
	private Integer isuid;//转账人id
	
	@TableField("t_suids")
	private Integer isuids;//收账人id
	
	@TableField("t_moeny")
	private double tmoeny;//转账金额
	
	@TableField("t_time")
	private String ttime;//转账时间
	
	@TableField("t_state")
	private String tstate;//转账状态
	
	@TableField("t_order")
	private Integer torder;//转账订单
	
	@TableField("t_ip")
	private String tip;//ip地址

	public Transfer(Integer iid, Integer isuid, Integer isuids, double tmoeny, String ttime, String tstate,
			Integer torder, String tip) {
		super();
		this.iid = iid;
		this.isuid = isuid;
		this.isuids = isuids;
		this.tmoeny = tmoeny;
		this.ttime = ttime;
		this.tstate = tstate;
		this.torder = torder;
		this.tip = tip;
	}

	public Transfer() {
		super();
	}

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public Integer getIsuid() {
		return isuid;
	}

	public void setIsuid(Integer isuid) {
		this.isuid = isuid;
	}

	public Integer getIsuids() {
		return isuids;
	}

	public void setIsuids(Integer isuids) {
		this.isuids = isuids;
	}

	public double getTmoeny() {
		return tmoeny;
	}

	public void setTmoeny(double tmoeny) {
		this.tmoeny = tmoeny;
	}

	public String getTtime() {
		return ttime;
	}

	public void setTtime(String ttime) {
		this.ttime = ttime;
	}

	public String getTstate() {
		return tstate;
	}

	public void setTstate(String tstate) {
		this.tstate = tstate;
	}

	public Integer getTorder() {
		return torder;
	}

	public void setTorder(Integer torder) {
		this.torder = torder;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Transfer [iid=" + iid + ", isuid=" + isuid + ", isuids=" + isuids + ", tmoeny=" + tmoeny + ", ttime="
				+ ttime + ", tstate=" + tstate + ", torder=" + torder + ", tip=" + tip + "]";
	}
	
	
}
