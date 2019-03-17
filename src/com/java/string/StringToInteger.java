package com.java.string;

public class StringToInteger {
	public int myAtoi(String str) {
		boolean isNegative = false;
		long result = 0;
		if (str != null && !str.trim().equals("")) {
			str = str.trim();
			if (str.startsWith("-")) {
				isNegative = true;
				str = str.substring(1, str.length());
			} else if (str.startsWith("+")) {
				str = str.substring(1, str.length());
			}
			for (char c : str.toCharArray()) {
				if (c == ' ' ||  c > 'A' && c < 'z') break;
                if( (result*10)+ (c-'0') <= Integer.MAX_VALUE )
                     result=(result*10)+ (c-'0');
                else return Integer.MIN_VALUE;;
			}

		}
		if (isNegative)
			return Integer.parseInt((result * -1)+"");

		return Integer.parseInt((result)+"");
	}
	
	public static void main(String[] args) {
		StringToInteger integer=new StringToInteger();
		System.out.println(integer.myAtoi("-91283472332"));
		System.out.println(Integer.MIN_VALUE);
	}
}
