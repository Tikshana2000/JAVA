package com.conditions;

import java.util.Scanner;

public class If_else_if_ladder {

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter the mark");

			Scanner sc = new Scanner(System.in);
			int mark = sc.nextInt();

			if (mark < 50) {
				System.out.println("FAIL");
			}

			else if (mark >= 50 && mark < 60) {
				System.out.println("D grade");
				
			} else if (mark >= 60 && mark < 70) {
				System.out.println("C grade");
				
			} else if (mark >= 70 && mark < 80) {
				System.out.println("B grade");
				
			} else if (mark >= 80 && mark < 90) {
				System.out.println("A grade");
				
			} else if (mark >= 90 && mark < 100) {
				System.out.println("S grade");
			}

		}
	}
}
