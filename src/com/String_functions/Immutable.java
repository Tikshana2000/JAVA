package com.String_functions;

public class Immutable {        // Shares duplicate memory

	public static void main(String[] args) {

		String s1 = " LETS GET DEEP INTO THE SPACE ";
		System.out.println(System.identityHashCode(s1));

		String s2 = " LETS GET DEEP INTO THE SPACE ";
		System.out.println(System.identityHashCode(s2));

		String concat = s1.concat(s2);
		System.out.println(concat);

		String s = s1 + s2;
		System.out.println(s);
		System.out.println(System.identityHashCode(s));

	}

}
