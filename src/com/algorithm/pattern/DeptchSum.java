package com.algorithm.pattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;

public class DeptchSum {
	public int sum(String pattern) {
		int maxDep = 1;
		int depth = 0;
		int sum = 0;
		ArrayList<Integer> keys = new ArrayList<>();
		Map<Integer, ArrayList<Integer>> map = new TreeMap<>();
		if (pattern == null || pattern.contentEquals(""))
			return sum;

		for (char r : pattern.toCharArray()) {
			if (r == '(') {
				depth++;
				if (depth > maxDep)
					maxDep = depth;
			} else if (r == ')') {
				if (depth > 0)
					depth--;
				else
					return -1;
			} else if (r == ',') {
			} else {
				if (map.get(depth) == null) {
					map.put(depth, new ArrayList<>());
					keys.add(depth);
				}
				map.get(depth).add(Integer.parseInt(r + ""));
			}
		}
		Collections.sort(keys);
		int count = 1;
		for (Integer key : map.keySet()) {
			for (Integer val : map.get(key)) {
				sum = sum + (maxDep * val);
			}
			if (keys.size() - 1 - count >= 0)
				maxDep = keys.get(keys.size() - 1 - count);
			count++;
		}

		return sum;
	}

	public static void main(String[] args) {
		DeptchSum sum = new DeptchSum();
		System.out.println(sum.sum("((1,((((1))))),2,(1,1))"));
		System.out.println(sum.sum("((1,1),2,(1,1))"));
	}
}
