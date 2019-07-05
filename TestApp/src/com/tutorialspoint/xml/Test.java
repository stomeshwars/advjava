package com.tutorialspoint.xml;

import java.util.ArrayList;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		
		
		/*
		 * System.out.println("Start Time "+new Date()); for (int i = 0; i < 6136; i++)
		 * {
		 * 
		 * System.out.println(i);
		 * 
		 * 
		 * }
		 * 
		 * System.out.println("End Time "+new Date());
		 */
		
		
		ArrayList list=new ArrayList<>();
		
		list.add("AA");
		list.add("BB");
		list.add("CC");
		list.add("DD");
		
		String[]sa= {"AA","BB", "CC","DD"};
		
		  System.out.println(sa[3]);
		
		System.out.println(list.get(list.size()-1));
	}
}
