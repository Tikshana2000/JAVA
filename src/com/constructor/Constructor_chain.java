package com.constructor;

public class Constructor_chain {

	public Constructor_chain() {
		this ("STRING");
		System.out.println("Non-parameterized / Default Constructor");
	}

	public Constructor_chain(int a) {
		this (1522.00f);
		System.out.println(a);
	}

	public Constructor_chain(String b) {
		this (2215);
		System.out.println(b);
	}

	public Constructor_chain(float c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		
		Constructor_chain c = new Constructor_chain();
//		Constructor_chain c1 = new Constructor_chain(15);
//		Constructor_chain c2 = new Constructor_chain("Tina");
//		Constructor_chain c3 = new Constructor_chain(22.15f);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}

