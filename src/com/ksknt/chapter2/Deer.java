package com.ksknt.chapter2;

public class Deer {
	
	public Deer() {
		System.out.println("Deer");
	}
	
	public Deer(int age) {
		System.out.println("DeerAge");
	}
	
	private boolean hasHorns() {
		return false;
	}
	
	public static void main(String[] args) {
		Deer deer = new Reindeer(5);
		String abc;
		System.out.println(""+deer.hasHorns());
		//System.out.println(abc);
	}	
}

class Reindeer extends Deer {
	public Reindeer(int age) {
		System.out.println("Reindeer");
	} 
}