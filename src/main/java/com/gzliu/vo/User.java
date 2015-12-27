package com.gzliu.vo;

import java.io.Serializable;

public class User implements Serializable{
	
	private static final long serialVersionUID = 1049464167326992148L;
	private int uID;
	private String uName;
	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public String getuName() {
		return uName;
	}
	public void setuName(String uName) {
		this.uName = uName;
	}
	@Override
	public String toString() {
		return "User [uID=" + uID + ", uName=" + uName + "]";
	}
	
	
}
