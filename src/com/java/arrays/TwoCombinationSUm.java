package com.java.arrays;

import java.util.Arrays;
import java.util.LinkedHashMap;

public class TwoCombinationSUm {
	public int[] twoSum(int[] nums, int target) {
		if(nums == null || nums.length <2) return new int[2];
		int temp=0;
		for(int i=0;i<nums.length;i++) {
			temp=target - nums[i];
			for(int j=i+1;j<nums.length;j++) {
				if(temp == nums[j]) return new int[] {i,j};
			}
		}
		
		return new int[2];
	}
	public static void main(String[] args) {
		TwoCombinationSUm sUm=new TwoCombinationSUm();
		for(int i:sUm.twoSum(new int[] {2,7,11,15}, 26))
			System.out.print(i+" ");
		char[] c1="ate".toCharArray();
		char[] c2="eat".toCharArray();
		Arrays.sort(c1);
		Arrays.sort(c2);
		System.out.println(new String(c1).hashCode());
		System.out.println(new String(c2).hashCode());
	}
}
