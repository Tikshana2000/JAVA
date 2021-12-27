package com.constructor;

public class Constructor {

	public Constructor() {
		System.out.println("Non-parameterized / Default Constructor");
	}

	public Constructor(int a) {
		System.out.println(a);
	}

	public Constructor(String b) {
		System.out.println(b);
	}

	public Constructor(float c) {
		System.out.println(c);
	}

	public static void main(String[] args) {
		Constructor c = new Constructor();
		Constructor c1 = new Constructor(15);
		Constructor c2 = new Constructor("Tina");
		Constructor c3 = new Constructor(22.15f);

	}

}

