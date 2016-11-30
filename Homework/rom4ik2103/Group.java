package ru.bk.rom4ik2103;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class Group {
	private ArrayList<Student> groupList = new ArrayList<Student>();

	public void addSudent(Student student) {
		if (student != null) {
			groupList.add(student);
			System.out.println();
			System.out.println("WAS ADDED TO GROUP:");
			System.out.format(" Name - %7s\n SurNamne - %7s\n Age - %3d\n Sex - %2s\n", student.getName(),
					student.getSurName(), student.getAge(), student.getSex());
			
		}if(student==null){
			System.out.println("Adding error.");
		}
		
	}
	public void sortByLetter(Character letter){
		int count=0;
		 ArrayList<Student>res = (ArrayList<Student>)groupList.stream()
				.filter(Student ->Student.getSurName().charAt(0)==letter)
				.sorted((a,b)->a.getSurName().compareTo(b.getSurName()))
				.collect(Collectors.toCollection(ArrayList::new));
		 for (Student student : res) {
			System.out.println(student);
			count++;
		}
		 if (count == 0)System.out.println("There is no students whose Surname bedins from "+ letter);
	}
	
	public void stringGroup(){
		int i = 1;
		for (Student student : groupList) {
			System.out.println(i+") " +student);
			i++;
		}
	}
}
