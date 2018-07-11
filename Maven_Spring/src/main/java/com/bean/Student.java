package com.bean;

public class Student {
	private String id;
	private String names;
	private String age;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNames() {
		return names;
	}
	public void setNames(String names) {
		this.names = names;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}

	public Student(String id, String names, String age) {
		super();
		this.id = id;
		this.names = names;
		this.age = age;
	}
}
