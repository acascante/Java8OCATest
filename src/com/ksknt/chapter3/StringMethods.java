package com.ksknt.chapter3;

public class StringMethods {
	
	public static void main(String[] args) {
		example();
	}
	
	public static void example() {
		String sp = "string in the pool";
		String sp1 = "string in the pool";
		String so = new String("string in an object");
		
		System.out.println("sp: " + (sp));
		System.out.println("sp1: " + (sp1));
		System.out.println("so: " + (so));
		System.out.println("sp == sp1: " + (sp == sp1));
		System.out.println("sp == so: " + (sp == so));
		System.out.println("sp.equals(sp1): "  + sp.equals(sp1));
		System.out.println("sp.equals(so): "  + sp.equals(so));
		System.out.println("sp.substring(0): " + sp.substring(0));
		System.out.println("sp.substring(sp.length()): "+ sp.substring(sp.length()));
		System.out.println("sp.substring(sp.length()-1): "+ sp.substring(sp.length()-1));
		System.out.println("sp.substring(sp.length()-2): "+ sp.substring(sp.length()-2));
		System.out.println("sp.substring(-1): Runtime error");//" + sp.substring(-1)); Runtime error
		System.out.println("sp.substring(25): Runtime error");//" + sp.substring(25)); Runtime error
		
		System.out.println("substring");
		System.out.println("sp.substring(0, 0): " + sp.substring(0, 0));
		System.out.println("sp.substring(0, 1): " + sp.substring(0, 1));
		System.out.println("sp.substring(0, 2): " + sp.substring(0, 2));
		System.out.println("sp.substring(0, -1): Runtime error");//" + sp.substring(0, -1)); Runtime error
		System.out.println("sp.substring(0, 25): Runtime error");//" + sp.substring(0, 25)); Runtime error
		System.out.println("sp.substring(1, 0): Runtime error");//" + sp.substring(1, 0)); Runtime error
		
		System.out.println("concatenation");
		System.out.println("sp + 1: " + sp + 1);
		System.out.println("sp + false: " + sp + false);
		System.out.println("sp + 0.5F: " + sp + 0.5F);
		System.out.println("sp + 5.5: " + sp + 5.5D);
		System.out.println("sp.concat(0.5): Compile error, just string is allow");// + sp.concat(0.5)); Just strings
		
		System.out.println("charAt");
		System.out.println("sp.charAt(0): " + sp.charAt(0));
		System.out.println("sp.charAt(3): " + sp.charAt(3));
		System.out.println("sp.charAt(-1): Runtime error");// + sp.charAt(-1)); Runtime error
		System.out.println("sp.charAt(25): Runtime error");// + sp.charAt(25)); Runtime error

		System.out.println("indexOf");
		System.out.println("sp.indexOf(\"p\"): " + sp.indexOf("p"));
		System.out.println("sp.indexOf('p'): " + sp.indexOf('p'));
		System.out.println("sp.indexOf(5): " + sp.indexOf(5));
		System.out.println("sp.indexOf(\"p\", 30): " + sp.indexOf("p", 30));
		
	}
	
	
}


class ParentNewString {
	
}
abstract class NewString extends ParentNewString {
	
}
