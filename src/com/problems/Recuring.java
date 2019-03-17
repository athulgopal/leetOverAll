package com.problems;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class Recuring {
	public static void main(String[] args) {
		Recuring.pickingNumbers(Arrays.asList(new Integer[]{4,2,3,4,4,9,98,98,3,3,3,4,2,98,1,98,98,1,1,4,98,2,98,3,9,9,3,1,4,1,98,9,9,2,9,4,2,2,9,98,4,98,1,3,4,9,1,98,98,4,2,3,98,98,1,99,9,98,98,3,98,98,4,98,2,98,4,2,1,1,9,2,4}));
	}

	public static int pickingNumbers(List<Integer> a) {

		Map<Integer, Integer> map = new LinkedHashMap<>();
		int count = 0;
		int prev = -1;
		int max = 0;
		Collections.sort(a);
		for (int i : a) {
			count = 0;
			if (map.containsKey(i))
				count = map.get(i);
			map.put(i, ++count);
		}
		Set<Integer> set=new TreeSet<>(Arrays.asList(new Integer[] {100, 90, 90, 80, 75, 60}));
		count = 0;
		/*for (int i : map.keySet()) {
			if (prev == -1) {
				count += map.get(i);
				prev = i;
				tempPrev = i;
			} else if (i - prev <= 1) {
				count += map.get(i);
				tempPrev = i;
			} else {
				if (i - tempPrev <= 1) {
					prev = tempPrev;
					tempPrev=i;
				}
				else
					prev = i;
				count = map.get(i);
			}
			if (max < count)
				max = count;
		}*/
		
		for(int i:map.keySet()) {
			if(prev== -1) {
				count=map.get(i);
				prev=i;
			}else if(i - prev <= 1) {
				count = map.get(i) + map.get(prev);
			}else {
				count =map.get(i);
			}
			
			if (max < count)	max = count;
			prev=i;
			
		}
		System.out.println(max);
		return max;

	}
}