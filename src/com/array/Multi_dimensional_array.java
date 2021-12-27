package com.array;

public class Multi_dimensional_array {

	public static void main(String[] args) {

		int m[][] = new int[2][2];

		m[0][0] = 10;
		m[0][1] = 30;
		m[1][0] = 20;
		m[1][1] = 40;

		for (int i = 0; i < m.length; i++) {
//           System.out.println(m.length);  
			for (int j = 0; j < m.length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}

	}

}
