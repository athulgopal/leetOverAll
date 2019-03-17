package com.java.string;

public class RemoveDuplicate {

	public String removeDupl(String inp) {
		String op=new String();
		for(int i=0;i<inp.length();i++) {
			if(inp.indexOf(inp.charAt(i))!=inp.lastIndexOf(inp.charAt(i))){
				if(!op.contains(inp.charAt(i)+"")) {
					op=op+inp.charAt(i);
				}
			}
			else op=op+inp.charAt(i);
		}
		return op;
	}
	public static void main(String[] args) {
		RemoveDuplicate duplicate=new RemoveDuplicate();
		System.out.println(duplicate.removeDupl("athulalutttt"));
	}
}
