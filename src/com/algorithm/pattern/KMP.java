package com.algorithm.pattern;

public class KMP {

	public static void main(String[] args) {
		KMP kmp = new KMP();
		String main = "a";
		String pt = "a";
		int[] data = kmp.buildTemp(pt.toCharArray());
		System.out.println();
		System.out.println(kmp.search(main, pt, data));
	}

	public int[] buildTemp(char[] in) {
		int[] op = new int[in.length];
		op[0] = 0;
		int j = 0;
		for (int i = j + 1; i < in.length; i++) {
			if (in[j] == in[i]) {
				op[i] = j + 1;
				j++;
			} else {
				System.out.println(j+" "+i);
				if (j > 0) {
					j = op[j - 1];
					i--;
				} else {
					op[i] = 0;
				}
			}
		}
		for (int i : op) {
			System.out.print(" " + i);
		}
		return op;
	}

	public boolean search(String in, String pt, int[] data) {
		int j = 0;
		int i=0;
		for (; i < pt.length() && j < in.length();) {
			if (in.charAt(j) == pt.charAt(i)) {
				i++;
				j++;
			} else {
				if (i > 0) {
					i = data[i];
				} else {
					j++;
				}
			}
		}
		System.out.println(" --> "+(j-i));
		if (i == pt.length())
			return true;
		return false;
	}
}