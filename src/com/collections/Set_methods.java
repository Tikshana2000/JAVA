package com.collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Set_methods {

	public static void main(String[] args) {

		Set<Integer> i = new HashSet<Integer>();

		i.add(10);
		i.add(30);
		i.add(1234);
		i.add(100);
		i.add(15);
		i.add(null);
		i.add(null);
		i.add(100);

		System.out.println(i);

		System.out.println("---------------------------------------------");

		Set<Object> o = new HashSet<Object>();

		o.add("Galaxy");
		o.add(1234);
		o.add(123.456f);
		o.add(true);
		o.add('A');
		o.add(0.01);
		o.add(15);
		

		System.out.println(o);

		System.out.println("---------------------------------------------");

		int size = i.size();
		System.out.println(size);
		
		int size1 = o.size();
		System.out.println(size1);
		
		System.out.println("---------------------------------------------");

		o.addAll(i);
		System.out.println(o);
		
		System.out.println("---------------------------------------------");

		boolean contains = i.contains(100);
		System.out.println(contains);
		
		boolean contains2 = o.contains(0.02);
		System.out.println(contains2);
		
		System.out.println("---------------------------------------------");

//		i.retainAll(o);
//		System.out.println(o);
//		
//		i.removeAll(o);
//		System.out.println(o);
		
		System.out.println("---------------------------------------------");
		
		boolean empty = i.isEmpty();
		System.out.println(empty);
		
		o.clear();
		
	}

}
