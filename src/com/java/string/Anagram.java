package com.java.string;

public class Anagram {
	public static boolean isAnagram(String inp, String test) {
		int sum1 = 0,sum2 = 0;
		if (inp.length() != test.length())return false;
		for(int i=0 ;i<inp.length();i++) {
			sum1 = sum1 + inp.toCharArray()[i];
			sum2 = sum2 + test.toCharArray()[i];
		}
		if (sum1 != sum2) return false;
		return true;
	}
	
	public boolean isAnagramRes(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr=new int[26];
        for(char c:s.toCharArray()) arr[c - 'a']++;
        for(char c:t.toCharArray()) arr[c - 'a']--;
        for(int i:arr) {
        	if(i !=0) return false;
        }
        return true;
        
    }
	public static void main(String[] args) {
		Anagram anagram=new Anagram();
		System.out.println(anagram.isAnagramRes("ac", "bb"));
	}
}
