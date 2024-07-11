package com.portal.model;

public class Student {

	private int id;
	private String name;
	private String email;
	private int age;
	
	
	public Student(int id, String name, String email, int age) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.age = age;
	}
	
	public Student(String name, String email, int age) {
		super();
		this.name = name;
		this.email = email;
		this.age = age;
	}


	public Student() {
		super();
	}


	public int getId() {
		return id;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getEmail() {
		return email;
	}


	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}	

}
