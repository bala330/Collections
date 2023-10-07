package org.in;

import java.util.ArrayList;

public class ArrayListRemove {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> array=new ArrayList<String>();
		array.add("Bala");
		array.add("virtusa");
		array.add("zoho");
		array.add("Tcs");
		array.add("99234");
		array.removeAll(array);
		System.out.println("If the remove the elemnt in the method : "+ array);

	}

}
