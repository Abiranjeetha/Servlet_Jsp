package com.pack;

import java.io.Serializable;

public class User implements Serializable{

	public User() {
		// TODO Auto-generated constructor stub
	}
	private String name;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
