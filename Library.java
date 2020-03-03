package com.bean;
import java.util.List;
public class Library {
private int id;
private String name;
private List<String> books;
public Library(int id, String name, List<String> books) {
	super();
	this.id = id;
	this.name = name;
	this.books = books;
}
@Override
public String toString() {
	return "Library [id=" + id + ", name=" + name + ", "
			+ "books=" + books + "]";
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
public List<String> getBooks() {
	return books;
}
public void setBooks(List<String> books) {
	this.books = books;
}

}
