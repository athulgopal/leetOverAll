package com.java.string;

public class CountAndSay {
	public String countAndSay(int n) {
		StringBuilder string = new StringBuilder();
		if (n == 1) return "1";
		String val = "1";
		int count = 0;
		char prev = '1';
		while (n > 1) {
			char[] ar = val.toCharArray();
			for (int j = 0; j < ar.length; j++) {
				if (j == 0) {
					prev = ar[j];
					count = 1;
				} else if (ar[j] == prev)
					count++;
				else {
					string.append(count + "" + prev);
					prev = ar[j];
					count = 1;
				}
			}
			string.append(count + "" + prev);
			val = string.toString();
			string = new StringBuilder();
			count = 0;
			n--;
		}
		return val;
	}

	public static void main(String[] args) {
		CountAndSay andSay = new CountAndSay();
		System.out.println(andSay.countAndSay(3));
	}
}
