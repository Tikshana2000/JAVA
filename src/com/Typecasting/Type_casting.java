package com.Typecasting;

public class Type_casting {  // converts a value from one datatype to another data type 

public static void main(String[] args) {
	
	System.out.println("WIDENING - Low to High");
	
	byte a = 15;                //byte 1 - 8 bit
	int b=a;                    //byte 4 - 32 bit
	System.out.println(b);
	
	short c = 20;
	long d = c;
	System.out.println(d);
	
	float e = 100.000f;
	double f = e;
	System.out.println(f);

	System.out.println("-------------------------------");
	
	System.out.println("NARROWING - High to Low");

	double d1 = 22.05;             // byte 8 - 64 bit
	float f1 = (float) d1;          // byte 4 - 32 bit
	System.out.println(f1);
	
	int i = 100;
	byte b1 = (byte) i;
	System.out.println(b1);
	
	long l = 1278580898745l;
	short s = (short) l;
	System.out.println(s);
	
	
	
	
	
	
	
	
	
	
	
}		
	
}
