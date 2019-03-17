package com.java.string;

public class ReverseInteger {
	public int reverse(int x) {
		long y = 0;
		boolean isNeg = false;
		if (x < 0) {
			isNeg = true;
			x = x * -1;
		}
		while (x > 0) {
			if( Integer.MAX_VALUE <= ((y * 10) + (x % 10))) return 0;
			y = (y * 10) + (x % 10);
			x = x / 10;
		}
		if (isNeg)
			y = y * -1;

		return Integer.parseInt(y+"");
	}

	public static void main(String[] args) {
		ReverseInteger integer = new ReverseInteger();
		System.out.println(Integer.MAX_VALUE);
		long s1 = System.nanoTime();
		System.out.println(integer.reverse(1534236469));
		long s2 = System.nanoTime();
		System.out.println(s2 - s1);
	}
}
