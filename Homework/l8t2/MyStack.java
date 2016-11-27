package taskTwo;

import java.util.ArrayList;

public class MyStack {
	private ArrayList<Object> sList = new ArrayList<Object>();

	public void addObject(Object object, BlackList bl) {
		if (bl.checkBlackListByObject(object) == false) {
			sList.add(object);
			System.out.println(object + " was added to the list");
		}
	}

	public void deleteObject() {
		int n = sList.size() - 1;
		Object buffer = sList.get(n);
		sList.remove(n);
		System.out.println(buffer + " is delited from the list");
	}

	public void deleteObject(Object object) {
		int n = sList.size() - 1;
		Object objectFromList = sList.get(n);
		if (objectFromList.equals(object)) {
			deleteObject();
		} else {
			if (findObject(object) > 0) {
				System.out.println("Soryy, but " + object + " is not on the top of the list, so we can`t delete it");
			}
			if (findObject(object) < 0) {
				System.out.println("Soryy, but there is no " + object + " in the list");
			}

		}

	}

	public Object getObjectCopy() {
		Object ob = sList.get(sList.size() - 1);
		System.out.println(ob+" was copied");
		return ob;
	}

	public Object getObjectCopy(Object object) {
		
		Object ob = sList.get(findObject(object));
		System.out.println(ob+" was copied");
		return ob;
		
	}

	public Object getObjectCopyAndDelete() {
		Object ob = sList.get(sList.size() - 1);
		System.out.println(ob+" was copy and deleted");
		deleteObject();
		return ob;
	}

	public Object getObjectCopyAndDelete(Object object) {
		Object ob = sList.get(findObject(object));
		
		deleteObject();
		return ob;
	}

	public int findObject(Object object) {
		int n = 0;
		for (int i = 0; i < sList.size(); i++) {
			Object ob = sList.get(i);
			if (ob.equals(object)){
				n = i;
			}
			if (i < sList.size() && !(sList.get(i).equals(object))) {

				n = -1;
			}
		}
		return n;

	}

	@Override
	public boolean equals(Object a) {
		if (this == a)
			return true;
		else if (a == null)
			return false;
		else if (this.getClass() != a.getClass())
			return false;
		else
			return false;
	}

	@Override
	public String toString() {
		System.out.println("List:");
		for (Object object : sList) {
			System.out.println(object);
		}
		return "";
	}
	
}
