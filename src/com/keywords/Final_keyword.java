package com.keywords;

public class Final_keyword {
	
	public static void main(String[] args) {

		int a = 100;
		a++;
		System.out.println(a);

		// ------------------------------------------------------//

		final int b = 100;        // (VARIABLE LEVEL)
		// b++;    ------------>  // ERROR
		System.out.println(b);

	}
}

// Final can be accessed in 3 levels
//*Final CLASS cannot be inheritance
//*Final METHOD cannot be overridden
//*Final VARIABLE cannot be changed