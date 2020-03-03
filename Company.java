package com.bean;

import java.util.Set;

public class Company {
private String name;
private int telNo;
public Set<EmployeeDetails> employees;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getTelNo() {
	return telNo;
}
public void setTelNo(int telNo) {
	this.telNo = telNo;
}
public Set<EmployeeDetails> getEmployees() {
	return employees;
}
public void setEmployees(Set<EmployeeDetails> employees) {
	this.employees = employees;
}

}
