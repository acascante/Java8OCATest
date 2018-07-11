package com.ksknt.chapter3;

import java.time.LocalDate;

public class CoreJavaAPIs {

	public static void main(String[] args) {
		String s = ""+false;
		String s1 = new String(""+false);;
		String s2 = ""+false;
		String s3 = new String(""+false);;
		
		System.out.println(s);
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		
		System.out.println(s==s2);
		System.out.println(s1==s3);
		System.out.println(s1.equals(s3));
		
		
		String animal="animals";
		System.out.println(animal.indexOf("a", 10));
		
		animal.toUpperCase();
		System.out.println(animal.toUpperCase());
		
		System.out.println(animal.endsWith("s"));
		System.out.println(animal.endsWith("mls"));
		
		System.out.println(animal.replace("a", "B"));
		
		StringBuilder sb = new StringBuilder("animals");
		StringBuilder sb1 = new StringBuilder("animals");
		System.out.println(sb==sb1);
		System.out.println(sb.toString().equals(sb1.toString()));
		
		Integer i1 = 1000;
		Integer i2 = 1000;
		System.out.println(i1==i2);
		System.out.println(i1.equals(i2));
		
		int [] i, j;
		int k[], l;
		int m, n[];
		
		Integer [] ia = {1,2,3};
		int [] i1a = {1,2,3};
		//ia = (Integer[])i1a;
		//System.out.println(ia==i1a);
		System.out.println(ia.equals(i1a));
		
		String str = "Hello";
		String str1 = new String(s);
		
		if("Hello".equals(str)) System.out.println("one");
		if(str == str1) System.out.println("two");
		if(str1.equals(str)) System.out.println("three");
		if("Hello" == str) System.out.println("four");
		if("Hello" == str1) System.out.println("five");
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append("aaa").insert(1, "bb").insert(4, "ccc"); 
		System.out.println(sb2); // abbaccca
		sb.substring(6, 5);
		
		//if (str == m) System.out.println("1");
		if (str.equals(sb2)) System.out.println("1");
		
		LocalDate ld;
	}
}
