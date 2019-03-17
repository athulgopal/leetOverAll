package com.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Intersection {
	public int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer,Integer> valueMap=new HashMap<>();
		ArrayList<Integer> inteList=new ArrayList<>();
		for(int i:nums1) {
			int count=0;
			if(valueMap.get(i)!=null) {
				count=valueMap.get(i);
			}
			valueMap.put(i, ++count);
		}
		System.out.println(valueMap.toString());
		for(int i:nums2) {
			if(valueMap.get(i)!=null) {
				int count=valueMap.get(i);
				if(count==1) {
					valueMap.remove(i);
				}else {
					valueMap.put(i, count--);
				}
				inteList.add(i);
			}
		}
		int[] arr=new int[inteList.size()];
		for(int i=0;i<inteList.size();i++) {
			System.out.print(inteList.get(i)+" ");
			arr[i]=inteList.get(i);
		}
		return arr;
	}
	public static void main(String[] args) {
		Intersection intersection=new Intersection();
		intersection.intersect(new int[] {54,93,21,73,84,60,18,62,59,89,83,89,25,39,41,55,78,27,65,82,94,61,12,38,76,5,35,6,51,48,61,0,47,60,84,9,13,28,38,21,55,37,4,67,64,86,45,33,41}, new int[] {17,17,87,98,18,53,2,69,74,73,20,85,59,89,84,91,84,34,44,48,20,42,68,84,8,54,66,62,69,52,67,27,87,49,92,14,92,53,22,90,60,14,8,71,0,61,94,1,22,84,10,55,55,60,98,76,27,35,84,28,4,2,9,44,86,12,17,89,35,68,17,41,21,65,59,86,42,53,0,33,80,20});
	}
}
