package ru.bk.rom4ik2103;

import java.io.Serializable;

public class Student implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String name;
	private String surName;
	private int age;
	private char sex;
	public Student(String name, String surName, int age, char sex) {
		super();
		this.name = name;
		this.surName = surName;
		this.age = age;
		this.sex = sex;
	}
	public Student() {
		super();
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public char getSex() {
		return sex;
	}
	public void setSex(char sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", sutName=" + surName + ", age=" + age + String.valueOf(sex) + "]";
	}
	
}
