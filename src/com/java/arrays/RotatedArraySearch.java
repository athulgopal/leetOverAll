package com.java.arrays;

public class RotatedArraySearch {

	public void search(int[] arr, int val, int i, int j) {
		int mid = (i + j) / 2;
		if (i >= j) {
			System.out.println(val + " is not fount in the array ");
			return;
		}
		if (arr[mid] == val) {
			System.out.println(" The index is  " + mid);
			return;
		}else if(arr.length>= mid+1 && arr[mid+1] == val) {
			System.out.println(" The index is  " + (mid+1));
			return;
		}else if(0<= mid-11 && arr[mid+1] == val) {
			System.out.println(" The index is  " + (mid-1));
			return;
		}
		if (val >= arr[mid])
			search(arr, val, mid, j);
		else
			search(arr, val, i, mid);
	}

	public int pivot(int[] arr, int i, int j) {
		int mid = (i + j) / 2;
		if(mid -1 <0)return 0;
		if(mid + 1 > arr.length) return arr.length;
		if (arr[mid - 1] > arr[mid] && arr[mid + 1] > arr[mid]) {
			return mid;
		} else if (arr[i] > arr[mid] && arr[mid] > arr[j]) {
			mid = pivot(arr, mid, j);
		} else if (arr[i] < arr[mid] && arr[mid] < arr[j]) {
			mid = pivot(arr, i, mid);
		} else if (arr[i] > arr[mid] && arr[mid] < arr[j]) {
			if (arr[i] > arr[j]) {
				mid =pivot(arr, i, mid);
			} else {
				mid =pivot(arr, mid, j);
			}
		} else if (arr[i] < arr[mid] && arr[mid] > arr[j]) {
			if (arr[i] > arr[j]) {
				mid =pivot(arr, mid, j);
			} else {
				mid =pivot(arr, i, mid);
			}
		}
		return mid;
	}

	public static void main(String[] args) {
		RotatedArraySearch search = new RotatedArraySearch();
		int[] arr = new int[] { 1,2,3,4,5,6 };
		int val = 0;
		int mid = search.pivot(arr, 0, arr.length - 1);
		if (val >= arr[mid] && val <= arr[arr.length ]) {
			search.search(arr, val, mid, arr.length);
		} else {
			search.search(arr, val, 0, mid);
		}

	}
}
