package leet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubSet {
	List<List<Integer>> list = new ArrayList<>();
	public List<List<Integer>> subsets(int[] nums) {
		Arrays.sort(nums);
		backtrack(new ArrayList<>(), nums, 0);
		return list;
	}

	private void backtrack(List<Integer> tempList, int[] nums, int start) {
		list.add(new ArrayList<>(tempList));
		for (int i = start; i < nums.length; i++) {
			tempList.add(nums[i]);
			backtrack(tempList, nums, i + 1);
			tempList.remove(tempList.size() - 1);
		}
	}
	public static void main(String[] args) {
		SubSet set=new SubSet();
		for(List<Integer> list: set.subsets(new int[] {1,2,3})) {
			for(Integer i : list) {
				System.out.print(i+" ");
			}
			System.out.println(" ");
		}
	}
}
