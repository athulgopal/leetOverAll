package com.java.arrays;

public class RotateArray {
	public int[] rotate(int[] nums, int k) {
		int[] temp=new int[nums.length];
		for(int i=0;i<nums.length;i++) {
			//System.out.print(((i+k)%nums.length));
			temp[(i+k)%nums.length] = nums[i];
		}
		return temp;
	}
	public static void main(String[] args) {
		RotateArray array=new RotateArray();
		for(int i:array.rotate(new int[] {1,2,3,4,5,6,7}, 11)) {
			System.out.print(i);
		}
	}
}
