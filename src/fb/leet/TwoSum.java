package fb.leet;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

//Two Sum

//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.

//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Output: Because nums[0] + nums[1] == 9, we return [0, 1].

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<nums.length;i++) {
			int comp = Math.abs(target-nums[i]);
			if(map.containsKey(comp))
				return new int[] {map.get(comp),i};
			map.put(nums[i], i);
		}
		return new int[0];
	}
	
	public static void main(String[] args) {
		int[] nums = {3,3}; 
		TwoSum sum=new TwoSum();
		Arrays.stream(sum.twoSum(nums, 6)).boxed().collect(Collectors.toList()).forEach( x -> System.out.println(x));
	}

}
