package com.test;

public class Employee 
{
 private int id;
 private String name;
 private String City;
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
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public void disp() {
	System.out.println("ID:"+id+"Name:"+name+"City:"+City);
	
}
 
}
