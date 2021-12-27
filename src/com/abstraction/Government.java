package com.abstraction;

public abstract class Government {

//non-abstract method
	
    public void name() {
	System.out.println("NAME: TIKSHANA.B"); // implemetation part

}
	public void gender() {
	System.out.println("GENDER: FEMALE");

}
	public void dob() {
	System.out.println("DOB: 15/04/2000");

}  
//abstract method  - Hiding implementation part and showing only functionality to users
	
	public abstract void aadharnum(); // un implemented part / signature part
	public abstract void address();
		
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

