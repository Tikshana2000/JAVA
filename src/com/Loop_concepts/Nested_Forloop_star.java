package com.Loop_concepts;

public class Nested_Forloop_star {
 
	public static void main(String[] args) {

		for (int i = 5; i >= 1; i--) {                // row
			for (int j = 1; j <= i; j++) {            // column
				System.out.print(i);
				// System.out.print("*");
			}
			System.out.println();
		}
	}

}
