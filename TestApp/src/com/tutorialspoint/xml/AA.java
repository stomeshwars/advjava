package com.tutorialspoint.xml;

import java.util.Date;

public class AA {
	public static void main(String[] args) {

		int finalValue = 10000000;

		for (int i = 1; i < finalValue; i++) {

			if (i == 1) {
				System.out.println(System.currentTimeMillis() + "          " + i);
			}

			if (i == finalValue - 1) {
				System.out.println(System.currentTimeMillis() + "          " + i);

			}
		}
	}
}
