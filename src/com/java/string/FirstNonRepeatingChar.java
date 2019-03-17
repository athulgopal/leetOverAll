package com.java.string;

import java.util.LinkedHashMap;

public class FirstNonRepeatingChar {
	public int firstUniqChar(String s) {
		if(s==null||s.length()==0) return -1;
		int index = -1;
		for (char c : s.toCharArray()) {
			if (s.indexOf(c + "") == s.lastIndexOf(c))
				return s.lastIndexOf(c);
		}
		return index;
	}
	
	public int firstUniqCharArr(String s) {
		int[] arr=new int[26];
		int index = -1;
		char[] temp=s.toCharArray();
		for(char c:temp) {
			arr[c - 'a'] ++;
		}
		for (char c:temp) {
			index++;
			if(arr[c - 'a']==1) return index;
		}
		return index;
	}
	
	public int firstUniqCharMap(String s) {
		int index = -1;
		LinkedHashMap<Character, Integer> map=new LinkedHashMap<>();
		for(char c:s.toCharArray()) {
			int count=0;
			if(map.get(c)!=null)count=map.get(c);
			map.put(c, ++count);
		}
		for (char c : s.toCharArray()) {
			index++;
			if(map.get(c)==1) return index;
		}
		return -1;
	}
	
	public int firstUniqCharRes(String s) {
        if(s==null||s.length()==0) return -1;
        
        int result = s.length();

        for(char c ='a'; c <= 'z' ; c++ ) {
        	int index = s.indexOf(c);
        	if(index !=-1 && index == s.lastIndexOf(c))
        		result = Math.min(result, index);
        }
        
        return result==s.length()?-1:result;
    }

	public static void main(String[] args) {
		FirstNonRepeatingChar char1 = new FirstNonRepeatingChar();
		long s1=System.nanoTime();
		System.out.println(char1.firstUniqChar("leetcode"));
		long s2=System.nanoTime();
		
		long s3=System.nanoTime();
		System.out.println(char1.firstUniqCharArr("leetcode"));
		long s4=System.nanoTime();
		

		long s5=System.nanoTime();
		System.out.println(char1.firstUniqCharRes("leetcode"));
		long s6=System.nanoTime();
		
		System.out.println(s2-s1);
		System.out.println(s4-s3);
		System.out.println(s6-s5);
	}
}
