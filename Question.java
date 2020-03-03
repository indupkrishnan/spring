package com.bean;


import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.Iterator;
public class Question {
private int id;
private String name;
private Map<String,String>answers;
public Question(int id, String name, Map<String, String> answers) {
	super();
	this.id = id;
	this.name = name;
	this.answers = answers;
}

public void displayInfo(){
	System.out.println("Question ID:"+id);
	System.out.println(""+name);
	System.out.println("........ANSWERS......."); 
	Set<Entry<String,String>> set=answers.entrySet();
	
	Iterator<Entry<String,String>> itr=set.iterator();
	while(itr.hasNext()){
		Entry<String,String> entry=itr.next();
		System.out.println("ANSWER: "+entry.getKey()+" posted by "+entry.getValue());
	}
}
}
