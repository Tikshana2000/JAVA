package com.String_functions;

public class String_fn {

	public static void main(String[] args) {
		
		String s = "Welcome to Chennai 2.0";
		
		int length = s.length();
		System.out.println(length);
		
		String s1 = "Welcome To Chennai 2.0";
		boolean equals = s.equals(s1);
		System.out.println(equals);
		
		boolean eq = s.equalsIgnoreCase(s1);
		System.out.println(eq);
		
        boolean contains = s.contains("to Ch");
        System.out.println(contains);
        
        int indexOf = s.indexOf('e');
        System.out.println(indexOf);
		
		int lastIndexOf = s.lastIndexOf('e');
		System.out.println(lastIndexOf);
		
		String upperCase = s.toUpperCase();
		System.out.println(upperCase);
		
	    String lowerCase = s.toLowerCase();
	    System.out.println(lowerCase);
		
		boolean startsWith = s.startsWith("We");
		System.out.println(startsWith);
		
		boolean endsWith = s.endsWith("2.0");
		System.out.println(endsWith);
		
		char charAt = s.charAt(17);
		System.out.println(charAt);
		
		String replace = s.replace("Welcome", "Hello");
		System.out.println(replace);
		
		String substring = s.substring(11);
		System.out.println(substring);
		
		boolean empty = s.isEmpty();
		System.out.println(empty);
		
		String s12 = "";
		boolean empty1 = s.isEmpty();
		System.out.println(empty1);
		
		String[] split = s.split("o");
		for (String string : split) {	
		System.out.print(string);
		}
		
		
		String s11 = "A";
		String s13 = "a";
		int compareTo = s11.compareTo(s13);
		System.out.println(compareTo);
		
		String s15 = "      JAVA       ";
		String trim = s15.trim();
		System.out.println(trim);
		
		
		
		
		
		
	}
		
		
	
}
