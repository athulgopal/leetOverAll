package com.syntax.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ListIteration {
	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>(Arrays.asList(new Integer[] { 1, 2, 3, 4, 5 }));
		ArrayList<Integer> arrayListNew = new ArrayList<Integer>(Arrays.asList(new Integer[] { 3, 4, 5 }));
		arrayList = arrayList.stream().filter(c -> arrayListNew.contains(c)).collect(Collectors.toList());
		/*
		 * for (int i : arrayList) { System.out.println(i); }
		 */
		ListIteration iteration = new ListIteration();
		long s1=System.nanoTime();
		//int i=iteration.consecutive(15000000L);
		long s2=System.nanoTime();
		long s3=System.nanoTime();
		//int j=iteration.printSums(15000000L);
		long s4=System.nanoTime();
		long s5=System.nanoTime();
		int k=iteration.countConsecutive(1500000000L);
		long s6=System.nanoTime();
		
		//System.out.println(i+" "+(s2-s1));
		//System.out.println(j+" "+(s4-s3));
		System.out.println(k+" "+(s6-s5));
	}

	int printSums(long num) {
		int result = 0;
		int start = 1, end = 1;
		int sum = 1;

		while (start <= num / 2) {
			if (sum < num) {
				end += 1;
				sum += end;
			} else if (sum > num) {
				sum -= start;
				start += 1;
			} else if (sum == num) {
				result++;
				sum -= start;
				start += 1;
			}
		}
		return result;
	}
	
	int countConsecutive(long num) 
    { 
        // constraint on values of L gives us the  
        // time Complexity as O(N^0.5) 
        int count = 0; 
        for (int L = 1; L * (L + 1) < 2*  num; L++) 
        { 
        	float a = (float) ((1.0 * num-(L * (L + 1)) / 2) / (L + 1));
            if (a-(int)a == 0.0)  
                count++;         
        } 
        return count; 
    } 

	public int consecutive(long num) {
		int result = 0;
		Set<Long> sumMap = new HashSet();
		long sum = 0;
		int j = 0;
		for (long i = 1; i < (num / 2) + 2; i++) {
			sum += i;
			sumMap.add(sum);
			if (sum == num)
				result++;
			else if (sum > num) {
				if (sumMap.contains(sum - num))
					result++;
			}
		}
		return result;
	}

}