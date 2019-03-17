package leet;

import java.util.Arrays;

public class MinSUmSUbArray {
	/*public int minSubArrayLen(int s, int[] nums) {
		Arrays.sort(nums);
		int count=0;
		 int lessCOunt=0;
		int tempVal=0;
		for(int i=0;i<nums.length;i++) {
			tempVal=s-nums[i];
			if(tempVal==0) return 1;
			int secTemp=tempVal;
			for(int j=i+1;j<nums.length;j++) {
				int inTemp=secTemp;
				int k=j;
				int inCOunt=0;
				while(inTemp >0 && k < nums.length) {
					inTemp=inTemp-nums[k];
					if(inTemp == 0 && (count >(inCOunt+2) || count ==0)) count =inCOunt+2;
					inCOunt++;
					k++;
					 if(lessCOunt ==0) lessCOunt=2;
				}

			}
		}
		 if(count ==0 && lessCOunt!=0)
	            return lessCOunt;
			return count;
	}*/
	 public int minSubArrayLen(int s, int[] nums) {
	        // sliding window solution
	        if (nums == null || nums.length == 0) {
	            return 0;
	        }
	        int p = 0;
	        int currSum = 0;
	        int res = Integer.MAX_VALUE;
	        for (int i = 0; i < nums.length; i++) {
	            while (p < nums.length && currSum < s) {
	                currSum += nums[p++];
	            }
	            if (currSum >= s) {
	                res = Math.min(res, p - i);
	            }
	            currSum -= nums[i];
	        }
	        return res == Integer.MAX_VALUE ? 0 : res;
	    }
	public static void main(String[] args) {
		MinSUmSUbArray ubArray=new MinSUmSUbArray();
		System.out.println(ubArray.minSubArrayLen(50, new int[] {12,28,83,4,25,26,25,2,25,25,25,12}));
	}

}
