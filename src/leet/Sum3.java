package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sum3 {
	
	public static void main(String[] args) {
		Sum3 sum3=new Sum3();
		sum3.thressSum(new int[] {0,0,0});
	}
	
	private List<List<Integer>> thressSum(int[] nums){
		List<List<Integer>> lists=new ArrayList<>();
		List<Integer> list;
		Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++) {
			if(i>0 && nums[i]==nums[i-1]) 
				continue;
			int low=i+1;
			int high=nums.length -1;
			int sum= 0-nums[i];
			while(low<high) {
				if(nums[low]+nums[high] == sum && i !=low && i!=high) {
					System.out.println(nums[i]+"  "+nums[low]+" "+nums[high]);
					list=new ArrayList<>();
					list.add(i);
					list.add(low);
					list.add(high);
					while(low <nums.length-1 && nums[low]==nums[low+1])low++;
					while(high > 0 && nums[high]==nums[high-1])high--;
					low++;
					high--;
				}else if(nums[low]+nums[high] < sum) low++;
				else high--;
			}
			
		}
		return lists;
	}
}
