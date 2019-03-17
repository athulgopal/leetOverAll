package com.algorithm.pattern;

public class Palindrome {
	
	public static void main(String[] args) {
		Palindrome palindrome=new Palindrome();
		palindrome.allPali("MALAYALAM");
	}
	
	private void allPali(String value) {
		int count=0;
		for(int i=0;i<value.length();i++) {
			for(int j=i+1;j<value.length();j++) {
				if(isPali(value.substring(i, j+1))) {
					System.out.println(value.substring(i,j+1));
					count++;
				}
			}
		}
		System.out.println("Total we have "+count+" number of Palindrome ");
	}
	
	private boolean isPali(String value) {
		for(int i=0;i< (value.length());i++) {
			if(value.charAt(i)!=value.charAt(value.length() - i -1))
				return false;
		}
		return true;
	}
}
