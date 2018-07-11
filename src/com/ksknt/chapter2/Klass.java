package com.ksknt.chapter2;

public class Klass {

	public static void main(String[] args) {

		
		Integer i1 = 127;
		Integer i2 = 127;
		
		System.out.println(i1==i2);
		byte a = 40, b = 50;
		byte sum = (byte)( a + b);
		System.out.println(sum);
		
		String s = "Hola";
		int a1 = 40;
		long l1 = 40L;
		float f1 = 40.0f;
		short s1 = 40;
		System.out.println(s1==f1);
		
		float value = 102;
		float value1 = 102;
		float value2 = (int)102.0;
		float value3 = 1f * 0;
		float value4 = 1f * (short)0.0;
		//float value5 = 1f * (boolean)0;
	}

}
