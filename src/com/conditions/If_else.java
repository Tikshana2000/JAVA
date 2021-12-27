package com.conditions;

import java.util.Scanner;

public class If_else {

	public static void main(String[] args) {
		for (int i = 0; i <= 5; i++) {
			System.out.println("ENTER THE NUMBER");

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();

			if (n <= 500) {
				System.out.println("TRUE");
			} else {
				System.out.println("FALSE");
			}

		}

	}
}