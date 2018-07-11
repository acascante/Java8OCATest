package com.ksknt.chapter3;

import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int[] a1 = new int[10];
		int a2 [] = new int[10];
		
		int a3 []; a3 = new int[0]; 
		int mat [][] = new int[2][];
		int mat2 [][] = new int[2][4];
		int tri [][][] = new int[10][][];
		int qua [][][][] = new int[10][][][];
		
		System.out.println("a1.length: " + a1.length);
		System.out.println("mat.length: " + mat.length); 
		System.out.println("mat2[0].length: " + mat2[0].length);
		System.out.println("int a3 []; a3 = new int[0]; a3[0] = 1: Runtime Exception"); //a3[0] = 1;
		System.out.println("int a4 [] = new int[-1]: Runtime Exception"); //int a4 [] = new int[-1];
		
		a1[0] = 1;
		a2[0] = 1;
		
		System.out.println("(a1==a2): " + (a1==a2));
		System.out.println("a1.equals(a2)): " + a1.equals(a2));
		System.out.println("a1.toString(): " + a1.toString());
		System.out.println("Arrays.toString(a1): " + Arrays.toString(a1));
		Arrays.fill(a1, 5);
		System.out.println("Arrays.fill(a1, 5)");
		System.out.println("Arrays.toString(a1): " + Arrays.toString(a1));

		a2 = a1;
		System.out.println("(a1==a2): " + (a1==a2));
		System.out.println("(a1.equals(a2))): " + (a1.equals(a2)));
		
		a2 = null;
		System.out.println("(a1==a2): " + (a1==a2));
		System.out.println("(a1.equals(a2))): " + (a1.equals(a2)));
		
		Arrays.sort(a1);
	}
}
