package org.revision;

import java.io.EOFException;
import java.io.IOException;

public class Exception_5 {

	public static void main(String[] args)
	{
	try
	{
	System.out.println("1");
	int value = 10 / 0;
	throw new IOException();
	}
	catch(EOFException e)
	{
	System.out.println("2");
	}
	catch(ArithmeticException e)
	{
	System.out.println("3");
	}
	catch(NullPointerException e)
	{
	System.out.println("4");
	}
	catch(IOException e)
	{
	System.out.println("5");
	}
	catch(Exception e)
	{
	System.out.println("6");
	}
	}
	
}





//Given string as "Welcome to java class java" and replace java into sql if ends with java
//
//Sample Output:
//--------------
//Input :Welcome to class java
//Output :Welcome to class sql




