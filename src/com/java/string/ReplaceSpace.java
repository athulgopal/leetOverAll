package com.java.string;

public class ReplaceSpace {
	
	public String replace(String inp) {
		String result=new String();
		for(char r :inp.toCharArray()) {
			if(r==' ') result=result+"%20";
			else result=result+r;
		}
		return result;
	}
	public static void main(String[] args) {
		ReplaceSpace space=new ReplaceSpace();
		System.out.println(space.replace("A Thu L"));
	}
}
