package taskTwo;

import java.util.ArrayList;

public class BlackList {
	private ArrayList<Class> bList = new ArrayList<Class>();
	
	public void addToBlackList(Class cl){
		if(checkBlackList(cl)==false){
			bList.add(cl);
		}
		
	}
	
	private boolean checkBlackList(Class cl){
		for (int i=0;i<bList.size();i++){
			if(bList.get(i)==cl){
				return true;
			}
		}return false;
	}
	public boolean checkBlackListByObject(Object cl){
		for (int i=0;i<bList.size();i++){
			if(bList.get(i)==cl.getClass()){
				System.out.println(cl + " is in the black List so it`s can`t be added");
				return true;
			}
		}return false;
	}
}
