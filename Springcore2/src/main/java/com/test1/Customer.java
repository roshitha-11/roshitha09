package com.test1;

public class Customer 
{
	private int id;
	private String name;
	private int phno;
	private String city;
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
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public void disp() {
		System.out.println("ID:"+id+"Name:"+name+"City:"+city+"Phno:"+phno);
		
	}
}
