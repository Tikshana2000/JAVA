package com.variables;

public class Variables {
	
	// LOCAL VARIABLE
	// *inside the method
	// *must initialize local variable

	private void local() {
		int a = 10;
		System.out.println(a);
	}

	//-----------------------------------------------------------------------------------//
	
	// CLASS VARIABLE
	// *outside the method but inside the class
	// *if we dont initialize the value the default value of the given
	// datatype will be printed.

	int b = 15;
	private void class_var() {
		System.out.println(b);

	}

	//-----------------------------------------------------------------------------------//

	
	// STATIC VARIABLE
	// *outside the method but inside the class
	// *once we create both variable and method as static , no need to create an
	// object.

	static int c = 20;
	private static void static_var() {
		System.out.println(c);
	}

	//-----------------------------------------------------------------------------------//

	
	public static void main(String[] args) {

		Variables v = new Variables();

		v.local();
		v.class_var();
		static_var();

	}

}
