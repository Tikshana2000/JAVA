package com.Interface;

public class Child1 implements Parent1 , Parent2 {

	@Override                          //access from left
	public void gift2() {
	System.out.println("Bike 1");
	
}

	@Override
	public void gift1() {
	System.out.println("Bike 2");
		
}

	public static void main(String[] args) {
		Child1 a = new Child1();
		a.gift1();
		a.gift2();
}
	
	
	
	
	
}
