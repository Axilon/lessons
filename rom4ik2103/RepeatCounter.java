package ru.bk.rom4ik2103;

import java.util.*;


public class RepeatCounter {
	private HashMap<Object, Integer> hm = new HashMap<>();

	public RepeatCounter(HashMap<Object, Integer> hm) {
		super();
		this.hm = hm;
	}

	public RepeatCounter() {
		super();
	}

	public HashMap<Object, Integer> getHm() {
		return hm;
	}

	public void setHm(HashMap<Object, Integer> hm) {
		this.hm = hm;
	}

	public void fullHashMapAndCount(Object [] elements){
		for (Object object : elements) {
			if(!hm.containsKey(object)){
				hm.put(object, 1);
			}else{
				hm.put(object, hm.get(object)+1);
			}
		}
		int i =0;
		Set<HashMap.Entry<Object, Integer>> hms=hm.entrySet();
		for(HashMap.Entry<Object, Integer> hmse:hms){ 
		System.out.println((i+1) +") " + hmse.getKey()+"\t"+" - "+hmse.getValue()+" time(s) met"); 
		i++;
		}
	}
}
