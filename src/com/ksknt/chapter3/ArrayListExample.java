package com.ksknt.chapter3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<Integer> a1 = new ArrayList<>();
		
		a1.add(1);
		System.out.println("a1.add(1): " + a1.toString());

		a1.add(1,20);
		System.out.println("a1.add(1,20): " + a1.toString());
		
		//a1.add(10,20);
		System.out.println("a1.add(10,20): Runtime Exception");
		
		//a1.add(-1,20);
		System.out.println("a1.add(-1,20): Runtime Exception");
		
		System.out.println("a1.remove(0): " + a1.remove(0));
		System.out.println("a1.remove(0): " + a1.toString());
		
		System.out.println("a1.remove(new Integer(0)): " + a1.remove(new Integer(0)));
		System.out.println("a1.remove(new Integer(0)): " + a1.toString());
		
		a1.set(0, 15);
		System.out.println("a1.set(0, 15): " + a1.toString());
		
		//a1.set(1, 10);
		System.out.println("a1.set(0, 15):  Runtime Exception");
		
		System.out.println("a1.size(): " + a1.size());
		System.out.println("a1.isEmpty(): " + a1.isEmpty());
		System.out.println("a1.remove(0): " + a1.remove(0));
		System.out.println("a1.size(): " + a1.size());
		System.out.println("a1.isEmpty(): " + a1.isEmpty());
		Collections.sort(a1);
	}
}
