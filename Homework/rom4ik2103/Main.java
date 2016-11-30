package ru.bk.rom4ik2103;

public class Main {

	public static void main(String[] args) {
		Group group = new Group();
		group.addSudent(new Student("Serzh","Ivasyshyn",22,'M'));
		group.addSudent(new Student("Paul","Zakysilo",33,'M'));
		group.addSudent(new Student("Inna","Varynkova",15,'F'));
		group.addSudent(new Student("Roman","Hnyniyk",143,'M'));
		group.addSudent(new Student("Potap","Ivanovich",10,'M'));
		group.addSudent(new Student("Nastuha","Hohlova",45,'F'));
		group.addSudent(new Student("Ivanyshka","Ivanovich",10,'M'));
		
		group.stringGroup();
		System.out.println();
		group.sortByLetter('I');
		System.out.println();
		group.sortByLetter('H');
		System.out.println();
		
	}

}
