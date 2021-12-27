package com.oops_concept;

               //Class name
public class Concept_oopsbasic {
  
	// Method name
	public void student_name() {
		System.out.println("TIKSHANA");   
}
	// change private to public
	public void student_age() {
		System.out.println("21");

}
	public void student_favourite() {
		System.out.println("Biriyani");

}
	public static void main(String[] args) {  //  Always create object inside main
		//syntax
		//Classname         obj  = new   Classname();
		Concept_oopsbasic detail = new Concept_oopsbasic();
		                        //new keyword allocates new memory
		//calling methods using object
		detail.student_name();
		detail.student_age();
		detail.student_favourite();
		
		
		
	
}
	
	
	
	
}
