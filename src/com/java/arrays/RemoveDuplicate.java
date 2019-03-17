package com.java.arrays;

public class RemoveDuplicate {
	public int[] removeDuplicates(int[] nums) {
		if (nums.length == 0 || nums.length==1)
			return nums;
		int j=1;
		int index=0;
		for(int i =0;i<nums.length;i++) {
			if(nums[j]== nums[i]) {
				int k=i+1;
				while(nums[k] == nums[j]) k++;
				nums[index] = nums[k-1];
				i=k;
				j=k+1;
				
			}else {
				nums[index]=nums[i];
			}
			index++;
		}
		int[] op=new int[index];
		for(int i=0;i<index;i++) {
			op[i]=nums[i];
		}
		 return op;
		
	}

	public static void main(String[] args) {
		RemoveDuplicate duplicate = new RemoveDuplicate();
		duplicate.removeDuplicates(new int[] { 0,0,1,1,1,2,2,3,3,4 });
	}
}
