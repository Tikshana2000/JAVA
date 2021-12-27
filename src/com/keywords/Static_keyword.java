package com.keywords;

public class Static_keyword { // We cannot use static with class level
	
	private void earth() {
		System.out.println("EARTH");

	}

	public Static_keyword() {
		System.out.println("CONSTRUCTOR");

	}

	static int mars = 15;
	public static void mars() {
		System.out.println(mars);

	}

	static {
		System.out.println("STATIC BLOCK");
	}

	public void jupiter() {
		System.out.println("JUPITER");

	}

	public static void main(String[] args) {

		Static_keyword sk = new Static_keyword();
		sk.earth();
		sk.jupiter();
		mars();
				
	}
	
}
