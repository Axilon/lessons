package ru.bk.rom4ik2103;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) {

		Group n1=new Group();
		n1.addStudent("Pavel", "Struchkov", 21, 'm');
		n1.addStudent("Oleg", "Olegov", 45, 'm');
		n1.addStudent("Aleksey", "Stenkov", 12, 'm');
		System.out.println("List of group n1");
		System.out.println();
		n1.printGroup();
		System.out.println();
		String fileNameOne = "groupOne";
		
		Group n2=new Group();
		n2.addStudent("Olga", "Molochka", 18, 'f');
		n2.addStudent("Mariya", "Oduvanchik", 25, 'f');
		n2.addStudent("Sveta", "Strucha", 29, 'f');
		n2.addStudent("Artur", "Pirozhkov", 20, 'm');
		System.out.println("List of group n2");
		System.out.println();
		n2.printGroup();
		String fileNameTwo = "groupTwo";
		
		saveGroup(n1, fileNameOne);
		saveGroup(n2, fileNameTwo);
		
		Group n123 = loadGroup(fileNameOne);
		System.out.println();
		System.out.println("List of group n123");
		System.out.println();
		n123.printGroup();

		
	}
	private static void saveGroup(Group group,String fileName){
		try(ObjectOutputStream OOS = new ObjectOutputStream(new FileOutputStream(fileName))){
			OOS.writeObject(group);
		}catch(IOException e){
			System.out.println("Error save group");
		}
	}
	private static Group loadGroup(String fileName){
		Group group = null;
		try(ObjectInputStream OIS = new ObjectInputStream(new FileInputStream(fileName))){
			group=(Group)OIS.readObject();
		}catch(IOException|ClassNotFoundException e){
			System.out.println("Error Load group");
		}return group;
	}
}	

