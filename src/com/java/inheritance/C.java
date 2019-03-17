package com.java.inheritance;

public class C extends B implements D {
	public static void main(String[] args) {
		C c = new C();
		c.print();
		c.printAll(); 
	}
	
	public void printAll() {
		System.out.println(" From all C ");
	}
}
