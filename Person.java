package com.bean;

public class Person {
String name;
String address;
@Override
public String toString() {
	return "Person [name=" + name + ", address=" + address +"]";
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
}
