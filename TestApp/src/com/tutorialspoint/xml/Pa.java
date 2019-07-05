package com.tutorialspoint.xml;

import java.util.ArrayList;
import java.util.Date;

public class Pa {

	public static void main(String[] args) {

		ArrayList<Long> list = new ArrayList<>();
		
		System.out.println(new Date());
		for (long i = 0; i < 10000000000l; i++) {

			list.add(new Long(i));

		}
		System.out.println(new Date() +"" + list.size());

	}

}
