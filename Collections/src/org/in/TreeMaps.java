package org.in;

import java.util.TreeMap;

public class TreeMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
     TreeMap<Integer, String> tree=new TreeMap<Integer, String>();
     tree.put(45874, "bala");
     tree.put(58057, "Ajayapatel");
     tree.put(12345, "patelkumar");
     tree.put(47854, "pradeep");
     tree.put(78920, "Arunkumar");
     
     System.out.println(tree);
     System.out.println("print the name only : ");
    
     for (Integer name : tree.keySet()) {
    	 System.out.println(tree.get(name));
		
	}
   
   
     }

}
