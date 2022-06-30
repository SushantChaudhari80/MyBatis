package com.example.sushant.Model;

public class Users {

	String id;
	String name;
	String address;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdddress() {
		return address;
	}
	public void setAdddress(String adddress) {
		this.address = adddress;
	}
	public Users(String id, String name, String adddress) {
		super();
		this.id = id;
		this.name = name;
		this.address = adddress;
	}
	public Users() {
		super();
	}
	
}
