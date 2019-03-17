package com.java.linkedlist;

public class SmallInCircularList {
	public static void main(String[] args) {
		int[] arr = new int[] { 3, 4, 5, 6, 1, 2 };
		int small =0;
		for(int i=0;i<arr.length;i++) {
			if( i==0) {
				if(arr[i] < arr[arr.length-1] && arr[i] < arr[i+1]) {
					small=arr[i];
					break;
				}
			}else if(i == arr.length-1) {
				if(arr[i] < arr[0] && arr[i] < arr[arr.length-2]) {
					small=arr[i];
					break;
				}
			}else {
				if(arr[i] < arr[i-1] && arr[i] < arr[i+1]) {
					small=arr[i];
					break;
				}
			}
		}
		System.out.println(" Smallest val is  "+small);
	}

}
