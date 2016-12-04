package ru.bk.rom4ik2103;

public class Main {

	public static void main(String[] args) {
		Object [] ob = {121,22.1,"Hy",121,'d',22.1,22.1,"By",1,"Kyky"};
		RepeatCounter rc = new RepeatCounter();
		rc.fullHashMapAndCount(ob);

	}

}
