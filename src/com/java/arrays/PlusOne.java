package com.java.arrays;

public class PlusOne {
	public int[] plusOne(int[] digits) {
		int rem=1;
		for(int i=digits.length-1;i>=0;i--) {
			int sum = rem + digits[i];
			if(sum >= 10) {
				rem=sum /10;
				sum=sum%10;
			}else {
				rem=0;
			}
			digits[i]=sum;
		}
		if(rem > 0) {
			int[] arr=new int[digits.length+1];
			for(int i=0;i<=digits.length;i++) {
				if(i==0) arr[i]=rem;
				else arr[i]=digits[i-1];
			}
			return arr;
		}
		return digits;
	}
	public static void main(String[] args) {
		PlusOne one=new PlusOne();
		for(int i: one.plusOne(new int[] {9})) {
			System.out.print(i+"  ");
		}
	}
}
