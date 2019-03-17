package com.java.string;

public class ReverseCharArray {
	public void reverseString(char[] s) {
		int len = s.length;
		for (int i = 0; i < len / 2; i++) {
			char t = s[i];
			s[i] = s[len - i - 1];
			s[len - i - 1] = t;
		}
	}

	public String reverseString(String s) {
		int n = s.length();
		char[] reversed = s.toCharArray();
		for (int i = 0; i < reversed.length / 2; i++) {
			char c = reversed[i];
			reversed[i] = reversed[n - i - 1];
			reversed[n - i - 1] = c;
		}
		return String.valueOf(reversed);
	}

	public static void main(String[] args) {
		ReverseCharArray array = new ReverseCharArray();
		char[] arr = "Athul".toCharArray();
		String s;
		long s1 = System.nanoTime();
		s=array.reverseString("Athul");
		long s2 = System.nanoTime();
		System.out.println(s2 - s1);
		System.out.println(s);
	}
}
