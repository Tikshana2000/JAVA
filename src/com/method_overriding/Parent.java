package com.method_overriding;

public class Parent {

	public void property(String a) {          //SINGLE INHERITANCE
		System.out.println(a);
		
}
	
	public static void main(String[] args) {
		Parent p = new Parent();
		p.property("chips");
}	

		
	
}
