package com.mgr.sawon.vo;   /* src/main/java */



public class TelInfoVO {
	private int id;
	private String name;
	private String tel;
	

	//������ 2��, getter/setter 
	public TelInfoVO() { 	}
	public TelInfoVO(int id, String name, String tel) {
		this.id = id;
		this.name = name;
		this.tel = tel;
		//this.d = d;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
}
	
