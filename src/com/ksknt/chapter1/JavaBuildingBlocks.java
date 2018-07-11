
package com.ksknt.chapter1;

/*
 * -- Main declarations
 * public static void main(String[] args) { 
 * public static void main(String args[]) {
 * public static void main(String... args) {
 * 
 * -- Numeric bases
 * Octal (0-7)- 017
 * Hexadecimal (0-9 + A-F) 0x  -- 0xFF
 * Binary (0-1) 0B - 0b -- 0B11 
 * 
 * 
 * -- UNDERSCORE in Numerics
 * notAtStart = _1000.00;
 * notAtEnd = 1000.00_;
 * notByDecimal = 1000_.00;
 * annoyingButLegal = 1_00_0.0_0;
 * 
 * --	References 	vs 	Primitives
 * 		allow null		don't allow null
 * 		have methods	don't have methods
 * 
 * -- Local (inside methods) variables are NEVER initialized
 * -- Class or Static variables are initialized by default
 * 		boolean - false
 * 		byte, short, int, long - 0 (in their size)
 * 		float, double - 0.0 (in their size)
 * 		char - '\u0000' (NUL)
 * 		references - null
 */
public class JavaBuildingBlocks {
	
	int number = 4;
	
	{
		number = 5;
	}
	
	
	public JavaBuildingBlocks() {
		super();
		number = 2;
	}


	public static void main(String... args) {
		JavaBuildingBlocks jbb = new JavaBuildingBlocks();
		System.out.println(jbb.number);
		
		int oct = 0317; 
		int hex = 0X2AB5;
		int hexf = 0X2AB5;
		int bin = 0B1_1001101;
		float f = 33.3f;
		int u = 0_123_456;
		
		u++;
		
		// UNDERSCORE in Numerics
		//double notAtStart = _1000.00;
		//double notAtEnd = 1000.00_;
		//double notByDecimal = 1000_.00;
		double annoyingButLegal = 1_00_0.0_0; // this one compiles
		
		String allowNull = null;
		//int notAllowNull = null;
		
		int i1 = 1, i2 = i1,
				i3 = i1;
		
		int $dollar = 1;
		int $dollar$ = 1;
		int _under = 1;
		int _under_ = 1;
		int _____ = 0;
		int $$$$ = 4;
		int _1$;
		if (_____ == 0) {
			
		}
		
		System.out.println("I1: " + i1 + " -- I2: " + i2 + " -- I3:" + i3);
		System.out.println("Oct: " + oct + " -- Hex: " + hex + " -- Bin:" + bin);
	}
}
