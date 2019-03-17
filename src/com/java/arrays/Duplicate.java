package com.java.arrays;

import java.util.HashSet;

public class Duplicate {
	public boolean containsDuplicate(int[] nums) {
		HashSet<Integer> set=new HashSet<>();
		for(int i:nums) {
			if(set.contains(i))return true;
			set.add(i);
		}
		return false;
	}
	public static void main(String[] args) {
		Duplicate duplicate=new Duplicate();
		System.out.println(duplicate.containsDuplicate(new int[] {1,2,3,1}));
	}
}
