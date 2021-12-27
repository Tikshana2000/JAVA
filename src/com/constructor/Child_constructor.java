package com.constructor;

public class Child_constructor extends Parent_constructor {

	public Child_constructor() {
		super(1522); // Runs only base class
		System.out.println("B");
	}

	public static void main(String[] args) {

		Child_constructor cc = new Child_constructor();

	}

}
