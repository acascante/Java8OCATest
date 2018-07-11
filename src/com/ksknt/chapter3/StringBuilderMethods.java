package com.ksknt.chapter3;

public class StringBuilderMethods {
	public static void main(String[] args) {
		
		StringBuilder sb = new StringBuilder(5);	// Capacity
		
		System.out.println("sb: " + sb);
		System.out.println("sb.capacity(): " + sb.capacity());
		System.out.println("sb.length(): " + sb.length());
		
		sb.append("StringBuilder Example");
		System.out.println("sb: " + sb);
		System.out.println("sb.capacity(): " + sb.capacity());
		System.out.println("sb.length(): " + sb.length());
		
		System.out.println("charAt");
		System.out.println("sb.charAt(0): " + sb.charAt(0));
		System.out.println("sb.charAt(1): " + sb.charAt(1));
		System.out.println("sb.charAt(30): RuntimeException");// + sb.charAt(30));
		
		System.out.println("indexOf");
		System.out.println("sb.indexOf(\"S\"): " + sb.indexOf("S"));
		System.out.println("sb.indexOf(\"E\",1): " + sb.indexOf("E",1));
		System.out.println("sb.indexOf(\"E\",30): " + sb.indexOf("E",30));
		
		System.out.println("insert");
		System.out.println("sb.insert(0, \"Insert at begin\"): " + sb.insert(0, "Insert at begin"));
		System.out.println("sb.length(): " + sb.length());
		System.out.println("sb.insert(sb.length(), \"Insert at end\"): " + sb.insert(sb.length(), "Insert at end"));
		System.out.println("sb.insert(sb.length()+1, \"Insert at end\"): Runtime Exception");// + sb.insert(sb.length()+1, "Insert at end"));
		System.out.println("sb.insert(1, \"\"): " + sb.insert(1, ""));
		System.out.println("sb.insert(100, \"--Out of Index--\"): Runtime Exception");// + sb.insert(100, "--Out of Index--"));
		
		System.out.println("delete");
		System.out.println("sb.delete(0, 1): " + sb.delete(0, 1));
		System.out.println("sb.delete(1, 1): " + sb.delete(1, 1));
		System.out.println("sb.delete(0, -1): Runtime Exception"); // + sb.delete(0, -1));
		System.out.println("sb.delete(1, 0): Runtime Exception"); // + sb.delete(1, 0));
		System.out.println("sb.delete(10, sb.length()): Runtime Exception");// + sb.delete(10, sb.length()));
		System.out.println("sb.delete(10, sb.length()-1): " + sb.delete(10, sb.length()-1));
		
		System.out.println("deleteCharAt");
		System.out.println("sb.deleteCharAt(0): " + sb.deleteCharAt(0));
		System.out.println("sb.deleteCharAt(-1): Runtime Exception"); // + sb.deleteCharAt(-1));
		System.out.println("sb.deleteCharAt(sb.length()): Runtime Exception"); // + sb.deleteCharAt(sb.length()));
		
	}
}
