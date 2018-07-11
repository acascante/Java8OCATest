package com.ksknt.chapter2;

public class OperatorsAndStatements {
	public static void main(String[] args) {
		int x = 0;
		
		int div = 4;
		
		System.out.println("X: " + x + " " + x++ % div);
		System.out.println("X: " + x + " " + x++ % div);
		System.out.println("X: " + x + " " + x++ % div);
		System.out.println("X: " + x + " " + x++ % div);
		System.out.println("X: " + x + " " + x++ % div);
		System.out.println("X: " + x + " " + x++ % div);
		
		long d = 10;
		int g = 5;
		//g = g * d;
		
		int f = 10;
		int f1 = 5;
		
		f = f1 + (f1 = f) - f;
		System.out.println(f);
		System.out.println(f1);
		
		
		//--Comparations
		double d1 = 5.0;
		int i = 5;
		System.out.println(d1 == i);
		
		boolean b = false;
		Boolean b1 = new Boolean(Boolean.FALSE);
		System.out.println(b == b1);
		
		String s = new String("H");
		String s1 = new String("H");
		String s2 = "H";
		String s3 = "H";
		System.out.println(s == s1);
		System.out.println(s2 == s3);
		System.out.println(s.equals(s1));
		
		
		//String bool = false;
		long p = 5;
		int mul = (int) (2 * p);
		System.out.println("MUL: " + mul);
		
		
		dayOfTheWeek("10", "2");
		forExamples ();
		
	}
	private static void forExamples () {
		for(;;) {break;}
		
		for (int i = 0, j = 1; i < j; ++i) {
			
		}
		
		for (String i = "A"; i.length() < 10; i+=i) {
			System.out.println(i);
		}
		
		for (float i = 1.0f; i < 1.9; i+=0.1) {
			System.out.println(i);
		}
		
		for (double i = 1.0; i < 1.9; i+=0.1) {
			System.out.println(i);
		}
		
		$a_: for (byte i = 1; i < 10; i+=1) {
			System.out.println(i);
		}
		
		String[] names = new String[3];
		for(String name : names) { 
			System.out.print(name + " ");
		}
		
		String name = "Alvaro";
		A: for(byte b : name.getBytes()) { 
			for(int i = 0; i < 10; i++) {
				System.out.print(b + " ");
				continue A;
			}
		}
	}
	
	private static void dayOfTheWeek(String day, final String day1) {
		final String day2 = "2";
		final String day3 = "3";
		final String day4 = "4";
		final String day5 = "5";
		switch (day) {
		case "0": System.out.println("Sunday");
		//case day1: System.out.println("Monday");
		default: System.out.println("ALL");
		case day2: System.out.println("Tuesday");
		case day3: System.out.println("Wednesday");
		case day4: System.out.println("Thursday");
		case day5: System.out.println("Friday");
		
		}
	}
	
	
}
