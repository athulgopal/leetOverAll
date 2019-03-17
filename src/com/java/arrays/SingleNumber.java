package com.java.arrays;

public class SingleNumber {
	public int singleNumber(int[] nums) {
		if(nums.length == 0) return -1;
		if(nums.length == 1) return nums[0];
		int val=0;
		for(int i:nums) val=val^i;
		return val;
	}
	public static void main(String[] args) {
		SingleNumber number=new SingleNumber();
		System.out.println(number.singleNumber(new int[] {4,1,2,1,2}));
	}
}
