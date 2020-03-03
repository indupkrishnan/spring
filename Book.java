package com.bean;

public class Book {
int id;
String bname;
String price;

@Override
public String toString() {
	return "Book [id=" + id + ", bname=" + bname + ", price=" + price + ", getId()=" + getId() + ", getBname()="
			+ getBname() + ", getPrice()=" + getPrice() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
			+ ", toString()=" + super.toString() + "]";
}

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getBname() {
	return bname;
}
public void setBname(String bname) {
	this.bname = bname;
}
public String getPrice() {
	return price;
}
public void setPrice(String price) {
	this.price = price;
}
public Book(int id, String bname, String price) {
	super();
	this.id = id;
	this.bname = bname;
	this.price = price;
}
}
