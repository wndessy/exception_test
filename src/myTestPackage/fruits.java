package myTestPackage;

import java.util.ArrayList;

public class fruits {
	
	public static String testException(int index) {
		ArrayList<String> myArrayList = new ArrayList<String>();
		myArrayList.add("appleß");
		myArrayList.add("mango");
		myArrayList.add("avocado");
		System.out.print(myArrayList.get(index));
		
		return myArrayList.get(index);
	}
	
		

}
