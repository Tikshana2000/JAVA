package com.method_overriding;

public class Child extends Parent {           //SINGLE INHERITANCE
            
	@Override
	public void property(String a) {
		super.property(a);   // reference of parent class
	
}
	
	public static void main(String[] args) {
		Child ch = new Child();
	    ch.property("chocolates");
	
	    
	// upcastting - access child class obj in parent class
      	Parent p = new Child();
      	p.property("juice");
      	
      	Parent p1 = new Parent();   //new keyword allocates new memory
      	p1.property("icecream");
      	
   // downcastting - access parent class obj in child class
    //   Child ch=	new Parent();	
       // it is not possible in java
	
	}
            
}	

