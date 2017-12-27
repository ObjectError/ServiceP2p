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
	private Integer tid;//主键id
	
	@TableField("t_suid")
	private Integer tsuid;//转账人id
	
	@TableField("t_suids")
	private Integer tsuids;//收账人id
	
	@TableField("t_money")
	private double tmoney;//转账金额
	
	@TableField("t_time")
	private String ttime;//转账时间
	
	@TableField("t_state")
	private String tstate;//转账状态
	
	@TableField("t_order")
	private Integer torder;//转账订单
	
	@TableField("t_ip")
	private String tip;//转账人ip
	
	@TableField("t_ips")
	private String tips;//收账人ip

	public Integer getTid() {
		return tid;
	}

	public void setTid(Integer tid) {
		this.tid = tid;
	}

	public Integer getTsuid() {
		return tsuid;
	}

	public void setTsuid(Integer tsuid) {
		this.tsuid = tsuid;
	}

	public Integer getTsuids() {
		return tsuids;
	}

	public void setTsuids(Integer tsuids) {
		this.tsuids = tsuids;
	}

	public double getTmoney() {
		return tmoney;
	}

	public void setTmoney(double tmoney) {
		this.tmoney = tmoney;
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

	public String getTips() {
		return tips;
	}

	public void setTips(String tips) {
		this.tips = tips;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Transfer(Integer tid, Integer tsuid, Integer tsuids, double tmoney, String ttime, String tstate,
			Integer torder, String tip, String tips) {
		super();
		this.tid = tid;
		this.tsuid = tsuid;
		this.tsuids = tsuids;
		this.tmoney = tmoney;
		this.ttime = ttime;
		this.tstate = tstate;
		this.torder = torder;
		this.tip = tip;
		this.tips = tips;
	}

	public Transfer() {
		super();
	}

	@Override
	public String toString() {
		return "Transfer [tid=" + tid + ", tsuid=" + tsuid + ", tsuids=" + tsuids + ", tmoney=" + tmoney + ", ttime="
				+ ttime + ", tstate=" + tstate + ", torder=" + torder + ", tip=" + tip + ", tips=" + tips + "]";
	}
	
	
}
