package com.algorithm.search;

public class BinarySearch {
	public int search(int[] arr, int val) {
		int small = 0;
		int max = arr.length - 1;
		int mid = -1;
		while (small <= max) {
			mid = (small + max) / 2;
			
			if (max > arr.length - 1 || small < 0)	return -1;
			if (arr[mid] == val) return mid;
			else if (arr[mid] > val)	max = mid - 1;
			else small = mid + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		System.out.println(binarySearch.search(arr, 10));
	}
}
