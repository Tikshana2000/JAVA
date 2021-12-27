package com.collections;

import java.util.ArrayList;
import java.util.List;

public class List_methods {

	public static void main(String[] args) {
		
		List <Integer> i = new ArrayList <Integer>();
		
		i.add(10);
		i.add(30);
		i.add(20);
		i.add(100);
		i.add(15);
		i.add(null);
		
		System.out.println(i);  // prints in insertion order
	
		int size = i.size();   //length 
		System.out.println(size);
		
		System.out.println("---------------------------------------------");
		
		List <Object> o = new ArrayList <Object>(); 
		
		o.add("Galaxy");
		o.add(1234);
		o.add(123.456f);
		o.add(true);
		o.add('A');
		o.add(0.01);
		o.add(15);
		
		System.out.println(o);
		
		int size2 = o.size();
		System.out.println(size2);
		
//		i.retainAll(o);
//		System.out.println(i);
		
		System.out.println("---------------------------------------------");	
		
		Integer integer = i.get(3);  // gets the value of given index
		System.out.println(integer);
		
		Object object = o.get(6);
		System.out.println(object);
		
		System.out.println("---------------------------------------------");
		
		Integer set = i.set(3, 200);  // Replace
		System.out.println(i);
		
		Object set2 = o.set(0, "GALAXY");
		System.out.println(o);
		
		System.out.println("---------------------------------------------");

		int indexOf = i.indexOf(15);
		System.out.println(indexOf);
		
		int indexOf2 = o.indexOf(15);
		System.out.println(indexOf2);
		
		System.out.println("---------------------------------------------");

		boolean contains = i.contains(null);
		System.out.println(contains);
		
		boolean contains2 = o.contains(1234);
		System.out.println(contains2);
		
		System.out.println("---------------------------------------------");

        o.addAll(i);  // first preference for obj
        System.out.println(o);
		// i.addAll(o);  ------> wont accept integer first
		
		System.out.println("---------------------------------------------");

     	boolean empty = i.isEmpty();
     	System.out.println(empty);
		
		boolean empty2 = o.isEmpty();
		System.out.println(empty2);
		
		System.out.println("---------------------------------------------");

		
		
		
		
	}
	
}
