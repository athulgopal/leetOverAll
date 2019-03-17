package com.algorithm.pattern;

public class LargestCommonChar {

	Integer maxLeft = 0;
	Integer maxRight = 0;

	public void UpdateMax(int left, int right) {
		if (left+right-2 > maxLeft+maxRight ) {
			maxLeft = left-1;
			maxRight = right-1;
		}
	}

	public void searchVal(int[] arr, int min, int max) {
		int mid = 0;
		int maxLeft = 0;
		int maxRight = 0;
		int i;
		mid = (min + max) / 2;
		i = 0;
		while (true) {
			i++;
			if (!((mid - i) >= 0 && arr[mid] == arr[mid - i])) {
				maxLeft = i;
				break;
			}
		}
		i = 0;
		while (true) {
			i++;
			if (!((mid + i) < arr.length && arr[mid] == arr[mid + i])) {
				maxRight = i;
				break;
			}

		}
		UpdateMax(maxLeft, maxRight);
		if(max > min) {
		searchVal(arr, min, mid - maxLeft);
		searchVal(arr, mid + maxRight, max);
		}else return;
	}

	public static void main(String[] args) {
		LargestCommonChar commonChar = new LargestCommonChar();
		int[] arr = { 1,1,1,2,2,2,2 };
		commonChar.searchVal(arr, 0, arr.length - 1);
		System.out.println(" The max repetation is  "+(commonChar.maxLeft + commonChar.maxRight+1));
	}

}
