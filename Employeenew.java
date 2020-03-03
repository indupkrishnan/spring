package com.bean;

public class Employeenew {
private Address addr;
int salary;
@Override
public String toString() {
	return "Employeenew [addr=" + addr + ", salary=" + salary + "]";
}
public Address getAddr() {
	return addr;
}
public void setAddr(Address addr) {
	this.addr = addr;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
//public Employeenew(){}
//public Employeenew(Address addr) {
//	super();
//	this.addr = addr;
	
//}


}
