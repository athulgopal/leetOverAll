package com.algorithm.pattern;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.util.Interval;

public class MergeIntervals {
	 public List<Interval> merge(List<Interval> intervals) {
		 ComparatorByStart byStart=new ComparatorByStart();
		 Collections.sort(intervals, byStart);
		 int i=0;
		 while(i<intervals.size()) {
			 if(i+1 ==intervals.size()) break;
			 Interval interval=intervals.get(i);
			 Interval nextInt=intervals.get(i+1);
			 if(interval.end >= nextInt.start) {
				 Interval temp=new Interval(interval.start,Math.max(interval.end, nextInt.end));
				 intervals.remove(interval);
				 intervals.remove(nextInt);
				 intervals.add(i, temp);
			 }
		 }
		 return intervals;
	 }
	 
	 public class ComparatorByStart implements Comparator<Interval> { 
	        @Override
	        public int compare(Interval x, Interval y) {
	             return x.start < y.start ? -1 : x.start == y.start ? 0 : 1;
	        }
	    } 
}
