package taskTwo;


public class Main {

	public static void main(String[] args) {
		
		BlackList bl = new BlackList();
		MyStack ms = new MyStack();
		bl.addToBlackList(Double.class);
		bl.addToBlackList(String.class);
//		bl.addToBlackList(Integer.class);
		bl.checkBlackListByObject(111);
		bl.checkBlackListByObject(true);
		bl.checkBlackListByObject("Hy");
		
		ms.addObject("hy", bl);
		ms.addObject(111.11, bl);
		ms.addObject(111, bl);
		ms.addObject(false, bl);
		ms.addObject('A', bl);
		ms.addObject("helloy", bl);
		ms.addObject('C', bl);
		ms.addObject('B', bl);
		System.out.println();
		ms.toString();
		ms.deleteObject();
		ms.deleteObject('C');
		ms.toString();
		System.out.println();
		char i = 'B';
		Object obOne = ms.getObjectCopy(i);
		System.out.println();
		obOne.toString();
		Object obTwo = ms.getObjectCopyAndDelete();
		obTwo.toString();
		ms.toString();
		
	}

}
