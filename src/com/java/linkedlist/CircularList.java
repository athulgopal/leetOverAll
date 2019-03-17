package com.java.linkedlist;

public class CircularList {

	public static void main(String[] args) {
		int[] arr = new int[] { 6, 1, 2, 3, 4, 5 };
		CircularList list = new CircularList();
		int i = list.search(arr, 6, 0, arr.length - 1);
		if (i >= 0)
			System.out.println(i + " " + arr[i]);
		else
			System.out.println(" Not found in the array ");
	}

	public int search(int[] arr, int val, int i, int j) {
		while (i < j) {
			int mid = (i + (j - i)) / 2;
			if (arr[i] < arr[mid]) {
				if (arr[i] <= val && arr[mid] >= val) {
					j = mid;
				} else {
					i = mid;
				}
			} else if (arr[i] > arr[mid]) {
				if (arr[mid] <= val && arr[j] >= val) {
					i = mid;
				} else {
					j = mid;
				}
			} else {
				i++;
			}
			if (arr[i] == val)
				return i;
			if (arr[j] == val)
				return j;
		}
		return -1;
	}
}