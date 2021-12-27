package com.scanner;

import java.util.Scanner;

public class Scanner_concept {

public static void main(String[] args) {
	Scanner sc = new Scanner (System.in);
	
//	Scanner_concept s = new Scanner_concept();

		System.out.println("ENTER THE NAME");
		String nextLine = sc.nextLine();
		System.out.println(nextLine);

		System.out.println("ENTER THE ID");
		int nextInt = sc.nextInt();
		System.out.println(nextInt);

		System.out.println("GENDER");
		String next = sc.next();
		System.out.println(next);

		System.out.println("ENTER PHONE NUMBER");
		long nextLong = sc.nextLong();
		System.out.println(nextLong);

		System.out.println("SALARY");
		float nextFloat = sc.nextFloat();
		System.out.println(nextFloat);
	
	    sc.close();
	
	
	
	
	
	
	
	
	
	
	
	
}		
	
}
