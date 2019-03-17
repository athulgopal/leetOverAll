package com.java.arrays;

public class UniqueChar {

	public boolean isUnique(String inpVal) {
		int[] vals = new int[256];
		for (char r : inpVal.toLowerCase().toCharArray()) {
			if (vals[r] != 0) return false;
			vals[r] = 1;
		}
		return true;
	}
	public static void main(String[] args) {
		UniqueChar char1 = new UniqueChar();
		System.out.println(char1.isUnique("Athula"));
	}
}
