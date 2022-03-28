package com.pod;



public class User {
	private String userid;
	private String userlv;
	private String usernu;
	private int userpo;
	
	
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getUserlv() {
		return userlv;
	}
	public void setUserlv(String userlv) {
		this.userlv = userlv;
	}
	public String getUsernu() {
		return usernu;
	}
	public void setUsernu(String usernu) {
		this.usernu = usernu;
	}
	public int getUserpo() {
		return userpo;
	}
	public void setUserpo(int userpo) {
		this.userpo = userpo;
	}
	public String getUserInFo() {
	 String result = this.userid+"의 등급은"+this.userlv+"이고 연락처는"+this.usernu+"이며 포인트는"+this.userpo+"점"; 
	return result;
	}
//	public void setUserid(String userid) {
//		this.userid = userid;
//	}
//	public String getUsId(){
//		return this.userid;
//		
//	}
//	public void setUserlv(String userlv) {
//		this.userlv = userlv;
//	}
//	public String getUserlv() {
//		return this.userlv;
//	}
//	public void setUsernu(String usernu) {
//		this.usernu = usernu;
//	}
//	public String getUsernu() {
//		return this.usernu;
//	
//	}
//	public void setUserpo(int userpo) {
//		this.userpo=userpo;
//	}
//	public int getUserpo() {
//		return this.userpo;
//	}
//	public String getUserInfo() {
//	 String result = this.userid+"의 등급은"+this.userlv+"이고 연락처는"+this.usernu+"이며 포인트는"+this.userpo+"점"; 
//		return result;
//	}
}
