package com.java.arrays;

public class SmallestINRotatedArray {
	public  int smallest(int[]arr, int min, int max) {

		if(min> max) return arr[0];
		if(min== max) return arr[min];
		
		int mid=(min+max)/2;
		
		if(mid > min && arr[mid] < arr[mid-1]) return mid;
		if(mid < max && arr[mid] > arr[mid+1]) return mid+1;
		
		if(arr[max] > arr[mid]) return smallest(arr, min, mid-1);
		else return smallest(arr, mid+1, max);
	}
	public int largest(int[] arr, int min, int max) {
		if(min> max) return arr[arr.length-1];
		if(min==max) return arr[min];
		
		int mid = (min+max) /2;
		
		if(mid > min && arr[mid] < arr[mid-1]) return mid-1;
		if(mid < max && arr[mid] > arr[mid+1]) return mid;
		
		if(arr[min] < arr[mid]) return largest(arr, mid+1, max);
		return largest(arr, min, mid-1);
	}
	public static void main(String[] args) {
		SmallestINRotatedArray rotatedArray=new SmallestINRotatedArray();
		int[] arr= {1,2,3,4,5,0};
		System.out.println(" Smallest is  "+rotatedArray.smallest(arr,0,arr.length-1));
		System.out.println(" Largest is   "+rotatedArray.largest(arr,0,arr.length-1));
	}
}
