package com.example.demo;


public class User {
	private int userid;
	public String username;
	public String pswd;
	private String phno;
	private String email;
	
	public User() {
	}

	public User(int userid, String username, String pswd, String phno, String email) {
		super();
		this.userid = userid;
		this.username = username;
		this.pswd = pswd;
		this.phno = phno;
		this.email = email;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public User(String username, String pswd) {
		super();
		this.username = username;
		this.pswd = pswd;
	}

	public String getPswd() {
		return pswd;
	}

	public void setPswd(String pswd) {
		this.pswd = pswd;
	}

	public String getPhno() {
		return phno;
	}

	public void setPhno(String phno) {
		this.phno = phno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
