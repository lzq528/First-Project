package com.woniu.pojo;
// Generated 2019-12-17 16:59:59 by Hibernate Tools 5.4.7.Final

/**
 * User generated by hbm2java
 */
public class User implements java.io.Serializable {

	private Integer uid;
	private String uname;
	private String upwd;
	private String uphoto;
	private Integer rid;

	public User() {
	}

	public User(String uname, String upwd, String uphoto, Integer rid) {
		this.uname = uname;
		this.upwd = upwd;
		this.uphoto = uphoto;
		this.rid = rid;
	}

	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	public String getUname() {
		return this.uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return this.upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUphoto() {
		return this.uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	public Integer getRid() {
		return this.rid;
	}

	public void setRid(Integer rid) {
		this.rid = rid;
	}

}