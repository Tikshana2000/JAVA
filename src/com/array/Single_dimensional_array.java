package com.array;

public class Single_dimensional_array {

	public static void main(String[] args) {

		int a[] = new int[6];

		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 50;
		a[5] = 60;

		System.out.println(a.length);

		System.out.println("------------");

		for (int i = 0; i < 6; i++) {             // ------> usimg for loop
			System.out.println(a[i]);
		}

		System.out.println("**************************************************");

		int b[] = new int[6];

//		b[0] ------ Default value of index 0 will print
		b[1] = 20;
		b[2] = 30;
		b[3] = 40;
		b[4] = 50;
		b[2] = 60; // ------ Override

		System.out.println(a.length);

		System.out.println("-----------");

		for (int i = 0; i < 6; i++) {
			System.out.println(b[i]);
		}

		System.out.println("**************************************************");

		int c[] = new int[6];

		c[1] = 20;
		c[2] = 30;
		c[3] = 40;
		c[4] = 50;
		c[2] = 60;

		System.out.println(a.length);

		System.out.println("-----------");

		for (int i : c) {                 // ------>using for each loop
			System.out.println(i);
		}

	}

}
