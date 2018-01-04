package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

/**
 * 收益表
 * 2017-11-16 09:05:42
 * 操作人：zyf
 * 
 * */

public class Income implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@TableField("i_id")
	private Integer iid;//主键id
	
	@TableField("i_suid")
	private Integer isuid;//用户id
	
	@TableField("i_moeny")
	private double imoeny;//收益金额
	
	@TableField("i_time")
	private String itime;//收益时间
	
	@TableField("i_type")
	private String itype;//收益类型
	
	@TableField("i_ip")
	private String iip;//ip地址
	private Users user;

	public Income(Users user,Integer iid, Integer isuid, double imoeny, String itime, String itype, String iip) {
		super();
		this.user=user;
		this.iid = iid;
		this.isuid = isuid;
		this.imoeny = imoeny;
		this.itime = itime;
		this.itype = itype;
		this.iip = iip;
	}

	public Income() {
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

	public double getImoeny() {
		return imoeny;
	}

	public void setImoeny(double imoeny) {
		this.imoeny = imoeny;
	}

	public String getItime() {
		return itime;
	}

	public void setItime(String itime) {
		this.itime = itime;
	}

	public String getItype() {
		return itype;
	}

	public void setItype(String itype) {
		this.itype = itype;
	}

	public String getIip() {
		return iip;
	}

	public void setIip(String iip) {
		this.iip = iip;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Income [user=" + user + ",iid=" + iid + ", isuid=" + isuid + ", imoeny=" + imoeny + ", itime=" + itime + ", itype="
				+ itype + ", iip=" + iip + "]";
	}
	
	
}
