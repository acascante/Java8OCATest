package com.ksknt.chapter4;

import static com.ksknt.general.X.LOG;

public class StaticExample {

	public static int count = 0;
	protected static int sum = 0;
	private static int total = 0;
	
	static {
		//throw new NullPointerException();
	}
	
	public static void main(String[] args) {
		System.out.println(LOG);
		
		Long l = new Long(0L);			//	long	String
		Float f = new Float(0);			//	float	String	double
		Double d = new Double(0);		//	double	String
		Integer i = new Integer(0);		//	int		String
		Boolean b = new Boolean(false);	//	boolean	String
		
		Long.valueOf(0);
		Float.valueOf(0);
		Double.valueOf(0);
		Integer.valueOf(i);
		Boolean.valueOf(false);
		
		Long.parseLong("0");
		
	}
	
	Object m1() {
		return new Object();
	}
	
	void m2() {
		String s = (String)m1();
	}
}
