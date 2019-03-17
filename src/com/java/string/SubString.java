package com.java.string;

public class SubString {
	
	public int isSubString(String s1,String s2) {
		if(s1.length() < s2.length()) return -1;
		for(char r:s2.toCharArray()) {
			if(s1.indexOf(r) ==-1)	return -1;
		}
		return s1.length() - s2.length();
	}
	public static void main(String[] args) {
		SubString string=new SubString();
		if(string.isSubString("apple", "pleap") == 0)
			System.out.println(" These Strings are  substrings ");
		else
			System.out.println(" These Strings are not substrings ");
	}
}
