package com.abstraction;

public class Aadhar extends Government{

	@Override
	public void aadharnum() {
	System.out.println("AADHAR NUM: 12345");
		  // no super keyword
}
	 @Override
	public void address() {
    System.out.println("ADDRESS: ABCDE");
		
}
	 public static void main(String[] args) {
			Aadhar card =  new Aadhar();
			card.name();
			card.gender();
			card.dob();
			card.address();
			card.aadharnum();
}
	
	
}
