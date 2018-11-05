package cn.bj.pojo;

import java.util.Date;

public class User {

	private int id;
	private String loginname;
	private String password;
	private Date logintime;
	private Date exittime;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLoginname() {
		return loginname;
	}
	public void setLoginname(String loginname) {
		this.loginname = loginname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Date getLogintime() {
		return logintime;
	}
	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}
	public Date getExittime() {
		return exittime;
	}
	public void setExittime(Date exittime) {
		this.exittime = exittime;
	}
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id, String loginname, String password, Date logintime, Date exittime) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
		this.logintime = logintime;
		this.exittime = exittime;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", loginname=" + loginname + ", password=" + password + ", logintime=" + logintime
				+ ", exittime=" + exittime + "]";
	}
	public User(int id, String loginname, String password) {
		super();
		this.id = id;
		this.loginname = loginname;
		this.password = password;
	}
	
}
