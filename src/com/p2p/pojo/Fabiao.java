package com.p2p.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotations.TableField;

public class Fabiao implements Serializable{
	@TableField("fs_id")
	private Integer fsid;
	@TableField("fs_suid")
	private Integer fssuid;
	@TableField("fs_title")
	private String fstitle;
	@TableField("fs_order")
	private String fsorder;
	@TableField("fs_money")
	private double fsmoney;
	@TableField("fs_time")
	private String fstime;
	@TableField("fs_state")
	private Integer fsstate;
	@TableField("fs_ip")
	private String fsip;
	
	private Users user;
	public Fabiao() {}
	
	public Fabiao(Integer fsid, Integer fssuid, String fstitle, String fsorder, double fsmoney, String fstime,
			Integer fsstate, String fsip, Users user) {
		super();
		this.fsid = fsid;
		this.fssuid = fssuid;
		this.fstitle = fstitle;
		this.fsorder = fsorder;
		this.fsmoney = fsmoney;
		this.fstime = fstime;
		this.fsstate = fsstate;
		this.fsip = fsip;
		this.user = user;
	}

	@Override
	public String toString() {
		return "Fabiao [fsid=" + fsid + ", fssuid=" + fssuid + ", fstitle=" + fstitle + ", fsorder=" + fsorder
				+ ", fsmoney=" + fsmoney + ", fstime=" + fstime + ", fsstate=" + fsstate + ", fsip=" + fsip + ", user="
				+ user + "]";
	}

	public Integer getFsid() {
		return fsid;
	}
	public void setFsid(Integer fsid) {
		this.fsid = fsid;
	}
	public Integer getFssuid() {
		return fssuid;
	}
	public void setFssuid(Integer fssuid) {
		this.fssuid = fssuid;
	}
	public String getFstitle() {
		return fstitle;
	}
	public void setFstitle(String fstitle) {
		this.fstitle = fstitle;
	}
	public String getFsorder() {
		return fsorder;
	}
	public void setFsorder(String fsorder) {
		this.fsorder = fsorder;
	}
	public double getFsmoney() {
		return fsmoney;
	}
	public void setFsmoney(double fsmoney) {
		this.fsmoney = fsmoney;
	}
	public String getFstime() {
		return fstime;
	}
	public void setFstime(String fstime) {
		this.fstime = fstime;
	}
	public Integer getFsstate() {
		return fsstate;
	}
	public void setFsstate(Integer fsstate) {
		this.fsstate = fsstate;
	}
	public String getFsip() {
		return fsip;
	}
	public void setFsip(String fsip) {
		this.fsip = fsip;
	}

	public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}
	
	
}
