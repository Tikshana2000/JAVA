package com.jumping_statements;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			Scanner sc = new Scanner(System.in);
			System.out.println("ENTER THE ID");
			int Tina = sc.nextInt();

			switch (Tina) {

			case 100:
				System.out.println("ACTIVE TINA");
				break;

			case 101:
				System.out.println("SLEEPY TINA");
				break;

			case 102:
				System.out.println("TALL TINA");
				break;

			case 103:
				System.out.println("MEDIUM TINA");
				break;

			case 104:
				System.out.println("TALKATIVE TINA");
				break;

			default:
				System.out.println("invalid");
				break;
			}
			sc.close();
		}
	}
}
