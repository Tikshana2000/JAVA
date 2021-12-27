package com.scanner;

import java.util.Scanner;

public class Scanner_sum {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("STUDENT NAME");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		System.out.println("------------------------");

		System.out.println("STUDENT ID");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);

		System.out.println("------------------------");

		System.out.println("M1");
		int m1 = sc.nextInt();
		System.out.println(m1);

		System.out.println("------------------------");

		System.out.println("M2");
		int m2 = sc.nextInt();
		System.out.println(m2);

		System.out.println("------------------------");

		System.out.println("M3");
		int m3 = sc.nextInt();
		System.out.println(m3);

		System.out.println("------------------------");

		System.out.println("M4");
		float m4 = sc.nextFloat();
		System.out.println(m4);

		System.out.println("------------------------");

		System.out.println("M5");
		float m5 = sc.nextFloat();
		System.out.println(m5);

		System.out.println("------------------------");

		float total = m1 + m2 + m3 + m4 + m5;
		System.out.println("SUM : " + total);

		float average = total / 5;
		System.out.println("AVERAGE : " + average);

		System.out.println("------------------------");

		System.out.println(" DESCRIPTION ");
		String nextLine2 = sc.nextLine();

		
		String nextLine3 = sc.nextLine();

	}
}
