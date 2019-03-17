package com.java.arrays;

public class SmallestAndLargestInRotatedArray {
	public static int search(int[] nums, int target) {
		if (nums.length == 0) return -1;
		if (nums.length == 1 && nums[0] != target) return -1;
		if (nums.length == 1 && nums[0] == target) return 0;
		int index = findMinIndex(nums);
		// int[] nums = { 4,5,6,7,0,1,2 }; 1 ind=4 val 0
		if (index != -1) {
			if (nums[index] == target) return index;
			if (nums[index] < target && target > nums[nums.length - 1]) return binarySearch(nums, target, 0, index - 1);
			if (nums[index] < target && target <= nums[nums.length - 1]) return binarySearch(nums, target, index + 1, nums.length - 1);
		} else return binarySearch(nums, target, 0, nums.length - 1);
		return -1;
	}
	public static int findMinIndex(int[] nums) {
		int min = 0;
		int max = nums.length - 1;
		while (min <= max) {
			int mid = (min + max) / 2;
			if (mid != 0 && nums[mid] < nums[mid - 1]) return mid;
			if (nums[mid] < nums[max]) 	max = mid - 1;
			else min = mid + 1;
		}
		return -1;
	}
	private static int binarySearch(int[] nums, int b, int min, int max) {
		while (min <= max) {
			int mid = (min + max) / 2;
			if (nums[mid] == b) return mid;
			if (nums[mid] < b) min = mid + 1;
			else max = mid - 1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] nums = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println(search(nums, 6));
	}
}