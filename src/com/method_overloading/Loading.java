package com.method_overloading;

public class Loading {                   // Class name same
                                         // Method names are same
	public void details(String a) {      // but different parameters
	System.out.println(a);
}
	public void details(int a) { 
	System.out.println(a);
}
	public void details(int a, int b) {
	System.out.println(a+b);
}
	public void details(int a,char b) {
	System.out.println(a + b);
}
	public void details(String a , int b) {
		System.out.println(a+b);
}
	public void details(String a , char b) {
		System.out.println(a+b);
}

	public static void main(String[] args) {
		Loading c= new Loading();
		c.details("Tikshana");
		c.details(1522);
		c.details(5, 10);
		c.details(5,'A');
		c.details("tina", 2000);
		c.details("22", 'T');
		
}
	
}
