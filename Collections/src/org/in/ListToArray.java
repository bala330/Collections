package org.in;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> list =new LinkedList<Integer>();
		list.add(547);
		list.add(485);
		list.add(204);
		list.add(980);
		
		Integer[] array=new Integer[list.size()];
	    array=list.toArray(array);
	    for (Integer integer : array) {
	    	System.out.println(integer);
			
		}
		
		}

	}


