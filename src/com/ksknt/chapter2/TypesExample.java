package com.ksknt.chapter2;

public class TypesExample {
	
	public static final int IC = 10;
	
	public static void main(String[] args) {
		int i = 1;
		int x = 0;
		
		char c = IC;
		
		i = c;
		
		boolean b1 = false;
		boolean b2 = false;
		
		switch(i) {
		case 1:
			boolean b = false;
		break;
		
		case 2:
			b = true;
			break;
		}
		
		Integer in = null;
		
		String g = null;
		System.out.println(g + in);

	}
	
	public void myMethod () {
		
	}
	
	public void yourMethod() {

	}
}
