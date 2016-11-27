package ru.bk.rom4ik2103;

import java.io.*;

public class Group implements Serializable{
	
	private Student[]groupList;

	private static final long serialVersionUID = 1L;
	Group(){
		groupList = new Student[0];
	}
	public void addStudent(String name,String surName,int age,char sex){
		Student[]c=new Student[groupList.length+1];
		System.arraycopy(groupList, 0, c, 0, groupList.length);
		c[c.length-1]=new Student(name,surName,age,sex);
		groupList=c;
	}
	public void printGroup(){
		for(Student k:groupList){
			System.out.println(k);
		}
	}
	
	
}
