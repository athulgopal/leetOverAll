package com.java.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class BusRoutes {
	public int numBusesToDestination(int[][] routes, int S, int T) {
		Map<Integer, Set<Integer>> routMap = new HashMap<>();
		Set<Integer> visitedList = new HashSet<>();
		int i = 0;
		int numberOfBusses = 0;
		Set<Integer> list = null;
		for (int[] ar : routes) {
			for (int j : ar) {
				list = new HashSet<>();
				if (routMap.containsKey(j))
					list = routMap.get(j);
				list.add(i);
				routMap.put(j, list);
			}
			i++;
		}

		Queue<Integer> pq = new LinkedList<>();
		pq.add(S);
		while(!pq.isEmpty()) {
			for(int j=0;j<pq.size();j++) {
				int currentStep=pq.poll();
				if(currentStep == T)return numberOfBusses-1;
				else {
					Set<Integer> bus=routMap.get(currentStep);
					for(int b:bus) {
						if(visitedList.add(b)) {
							for(int k:routes[b]) {
								pq.add(k);
							}
						}
					}
				}
			}
			
			++numberOfBusses;
		}
		return numberOfBusses-1;
	}
	public static void main(String[] args) {
		BusRoutes busRoutes=new BusRoutes();
		System.out.println(	busRoutes.numBusesToDestination(new int[][]{{7,12},{4,5,15},{6},{15,19},{9,12,13}}, 15, 12));
		
		
	}
}
