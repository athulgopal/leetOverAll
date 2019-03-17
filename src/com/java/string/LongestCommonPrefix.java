package com.java.string;

import java.util.ArrayList;

public class LongestCommonPrefix {
	public String longestCommonPrefix(String[] strs) {
		int i = 0;
		int len = Integer.MAX_VALUE;
		int temp = 0;
		for (String s : strs)
			if (s.length() < len)
				len = s.length();
		if(len == 0) return "";
		StringBuilder builder=new StringBuilder();
		while (i < len) {
			temp = 0;
			char c='a';
			for (String st : strs) {
				if(temp==0) c=st.charAt(i);
				else if( (c ^ (st.charAt(i))) !=0 ) break;
				temp++;
			}
			if (temp != strs.length) {
				break;
			}
			builder.append(c);
			i++;
		}
		return builder.toString();
	}
	public static void main(String[] args) {
		LongestCommonPrefix commonPrefix=new LongestCommonPrefix();
		System.out.println(commonPrefix.longestCommonPrefix(new String[] {"a","a","a"}));
		char c1='a';
		char c2='b';
		char c3='c';
		System.out.println(c1^c2^c3);
		
		ArrayList<Object> arrayList=new ArrayList<>();
		arrayList.add(c1);
		arrayList.add(c2);
		arrayList.add(c3);
		
		System.out.println(arrayList.toString());
		
		
	}
}
