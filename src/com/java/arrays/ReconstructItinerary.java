package com.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItinerary {
	@SuppressWarnings("null")
	public List<String> findItinerarys(String[][] tickets) {
		Map<String, PriorityQueue<String>> map = new HashMap<>();
		List<String> op = new ArrayList<>();
		PriorityQueue<String> temp = null;
		for (String[] strs : tickets) {
			temp = new PriorityQueue<>();
			if (map.containsKey(strs[0]))
				temp = map.get(strs[0]);
			temp.add(strs[1]);
			map.put(strs[0], temp);
		}
		boolean hasNext = map.containsKey("JFK") ? true : false;
		String from = "JFK";
		op.add(from);
		while (hasNext) {
			String justremoved=null;
			if (!map.containsKey(from)) {
				if (op != null || op.size() > 0) {
					if (op.size() >1 && map.containsKey(op.get(op.size() - 2))) {
						justremoved=from;
						from = op.get(op.size() - 2);
						op.remove(op.size() - 1);
					}else {
						hasNext = false;
						continue;
					}
				} else {
					hasNext = false;
					continue;
				}
			}
			temp = map.get(from);
			if (temp.size() <= 0) {
				if (op != null || op.size() > 0) {
					if (map.containsKey(op.get(op.size() - 1))) {
						from = op.get(op.size() - 1);
					}
				} else {
					hasNext = false;
					continue;
				}

			} else {
				String tmp= temp.poll();
				if(justremoved!=null)
					temp.add(justremoved);
				if(temp.isEmpty()) map.remove(from);
				else map.put(from, temp);
				from =tmp;
				
				op.add(from);
			}

		}
		System.out.println(op.toString());
		return op;
	}
	
	
	public List<String> findItinerary(String[][] tickets) {
	    Map<String, PriorityQueue<String>> targets = new HashMap<>();
	    for (String[] ticket : tickets)
	        targets.computeIfAbsent(ticket[0], k -> new PriorityQueue()).add(ticket[1]);
	    List<String> route = new LinkedList();
	    Stack<String> stack = new Stack<>();
	    stack.push("JFK");
	    while (!stack.empty()) {
	        while (targets.containsKey(stack.peek()) && !targets.get(stack.peek()).isEmpty())
	            stack.push(targets.get(stack.peek()).poll());
	        route.add(0, stack.pop());
	    }
	    System.out.println(route.toString());
	    return route;
	}
	public static void main(String[] args) {
		ReconstructItinerary itinerary=new ReconstructItinerary();
		String[][] ar=new String [] [] {{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};
		itinerary.findItinerary(ar);
		ar=new String [] [] {{"MUC", "LHR"}, {"JFK", "MUC"}, {"SFO", "SJC"}, {"LHR", "SFO"}};
		itinerary.findItinerary(ar);
		 ar=new String [] [] {{"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"}};
		itinerary.findItinerary(ar);
		ar=new String[][] {{"EZE","TIA"},{"EZE","HBA"},{"AXA","TIA"},{"JFK","AXA"},{"ANU","JFK"},{"ADL","ANU"},{"TIA","AUA"},{"ANU","AUA"},{"ADL","EZE"},{"ADL","EZE"},{"EZE","ADL"},{"AXA","EZE"},{"AUA","AXA"},{"JFK","AXA"},{"AXA","AUA"},{"AUA","ADL"},{"ANU","EZE"},{"TIA","ADL"},{"EZE","ANU"},{"AUA","ANU"}};
		itinerary.findItinerary(ar);		
		
		
	}
}
