package com.java.string;

import java.util.HashMap;
import java.util.Map;

public class PatternMatchingWords {
	
	public boolean isMatch(String pattern,String data) {
		String[] words=data.split(" ");
		if(pattern.length() != words.length) return false;
		Map<String, Integer> map=new HashMap<>();
		int pat=0;
		int dat=0;
		for(int j=0;j<pattern.toCharArray().length;j++) {
			if(!map.containsKey(pattern.toCharArray()[j]+"")) {
				map.put(pattern.toCharArray()[j]+"", j);
			}
			pat=pat*10 + map.get(pattern.toCharArray()[j]+"");
			
			if(!map.containsKey(words[j]+"")) {
				map.put(words[j]+"", j);
			}
			dat=dat*10 + map.get(words[j]+"");
		}
		return pat==dat;
	}
	
	public static void main(String[] args) {
		PatternMatchingWords words=new PatternMatchingWords();
		System.out.println(words.isMatch("ab", "cat cat"));
	}
}
