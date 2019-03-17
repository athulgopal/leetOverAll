package com.problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class AliceRanking {

	static int[] climbingLeaderboard(int[] scores, int[] alice) {
		int[] op = new int[alice.length];

		Map<Integer, Integer> map = new LinkedHashMap<>();
		Arrays.sort(scores);
		int[] temp=new int[scores.length];
		int len = 1;
		int rank =0;
		for (int i : scores) {
			if (!map.containsKey(i)) {
				temp[rank++]=i;
				map.put(i, rank);
			}
		}
		
		len=rank;
		for (int i = 0; i < alice.length; i++) {
			if (map.containsKey(alice[i]))
				op[i] = len + 1 - map.get(alice[i]);
			else if(temp[0] > alice[i])
				op[i]=rank+1;
			else if(temp[rank-1] < alice[i])
				op[i]=1;
			else {			
				int min=0;
				int max=rank-1;
				
				while(min+1 < max) {
					int mid=(min+max)/2;
					if(temp[mid] > alice[i]) {
						max=mid-1;
					}else {
						min =mid+1;
					}
				}
				if(min == max) {
					if(temp[min] > alice[i]) op[i]=rank - min -1;
					else op[i]=rank -min;
					
				}else {
					if(temp[max] < alice[i] ) op[i]=rank - max;
					else op[i]=rank - min +1;
				}
			}
		}
		return op;
	}
	
	static int climbingLeaderboardds(int[] scores, int[] alice) {
		
		 Arrays.sort(scores);
		 Arrays.sort(alice);
		 int j=-0;
		 int k=0;
		 int count =0;
		 for(int i=0;i<scores.length + alice.length;i++) {
			 
			 if(j < scores.length && k < alice.length) {
				 if(scores[j] == alice[k] ) {
					 count++;
					 j++;
					 k++;
				 }
				 else if(scores[j] < alice[k]) j++;
				 else k++;
			 }
		 }
		 System.out.println(count);
		 return count;
	}
	
	static int[] climbingLeaderboardd(int[] scores, int[] alice) {
		 int[] op = new int[alice.length];
		 ArrayList<Integer> list=new ArrayList<>();
		 Collections.addAll(list, Arrays.stream(alice).boxed().toArray(Integer[]::new));
		 Set<Integer> set=new HashSet<>();
		 for(int i:scores){
			 set.add(i);
		 }
		 int len =set.size();
		 for(int i:alice) {
			 set.add(i);
		 }
		 
		 int i=0;
		 for(int j:set) {
			 if(list.contains(j)) {
				 op[list.indexOf(j)]=len - ++i;
			 }
		 }
		 return op;
	}
	
	static int[] climbingLeaderboards(int[] scores, int[] alice) {
        int[] op = new int[alice.length];
        
        Map<Integer, Integer> map=new LinkedHashMap<>();
        Arrays.sort(scores);
        int prev=-1;
        int len=1;
        for(int i: scores) {
            if(prev !=-1 && prev != i)len++;
            prev=i;
        }
        int rank=len;
        for(int i:scores) {
            if(!map.containsKey(i)) map.put(i, rank--);
        }
        for(int i=0;i<alice.length;i++) {
            if(map.containsKey(alice[i])) op[i] =map.get(alice[i]);
            else if(alice[i] > scores[scores.length-1]) op[i]=1;
            else if(alice[i] < scores[0])op[i]=map.size()+1;
            else {
                rank=len;
                for(int j:map.keySet()) {
                    if(alice[i] < j) {
                        op[i]=rank+1;
                        break;
                    }
                    rank --;
                }
                if(op[i] ==0 ) op[i]=1;
            }
        }
        return op;
    }

	public static void main(String[] args) {
		/*for(int i:AliceRanking.climbingLeaderboard(new int[] {295,294,291,287,287,285,285,284,283,279,277,274,274,271,270,268,268,268,264,260,259,258,257,255,252,250,244,241,240,237,236,236,231,227,227,227,226,225,224,223,216,212,200,197,196,194,193,189,188,187,183,182,178,177,173,171,169,165,143,140,137,135,133,130,130,130,128,127,122,120,116,114,113,109,106,103,99,92,85,81,69,68,63,63,63,61,57,51,47,46,38,30,28,25,22,15,14,12,6,4,
				200}, new int[] {5,5,6,14,19,20,23,25,29,29,30,30,32,37,38,38,38,41,41,44,45,45,47,59,59,62,63,65,67,69,70,72,72,76,79,82,83,90,91,92,93,98,98,100,100,102,103,105,106,107,109,112,115,118,118,121,122,122,123,125,125,125,127,128,131,131,133,134,139,140,141,143,144,144,144,144,147,150,152,155,156,160,164,164,165,165,166,168,169,170,171,172,173,174,174,180,184,187,187,188,194,197,197,197,198,201,202,202,207,208,211,212,212,214,217,219,219,220,220,223,225,227,228,229,229,233,235,235,236,242,242,245,246,252,253,253,257,257,260,261,266,266,268,269,271,271,275,276,281,282,283,284,285,287,289,289,295,296,298,300,300,301,304,306,308,309,310,316,318,318,324,326,329,329,329,330,330,332,337,337,341,341,349,351,351,354,356,357,366,369,377,379,380,382,391,391,394,396,396,400})) {
			System.out.print(" "+i);
		}*/
		
		AliceRanking.climbingLeaderboardds(new int[] {295,294,291,287,287,285,285,284,283,279,277,274,274,271,270,268,268,268,264,260,259,258,257,255,252,250,244,241,240,237,236,236,231,227,227,227,226,225,224,223,216,212,200,197,196,194,193,189,188,187,183,182,178,177,173,171,169,165,143,140,137,135,133,130,130,130,128,127,122,120,116,114,113,109,106,103,99,92,85,81,69,68,63,63,63,61,57,51,47,46,38,30,28,25,22,15,14,12,6,4,
				200}, new int[] {5,5,6,14,19,20,23,25,29,29,30,30,32,37,38,38,38,41,41,44,45,45,47,59,59,62,63,65,67,69,70,72,72,76,79,82,83,90,91,92,93,98,98,100,100,102,103,105,106,107,109,112,115,118,118,121,122,122,123,125,125,125,127,128,131,131,133,134,139,140,141,143,144,144,144,144,147,150,152,155,156,160,164,164,165,165,166,168,169,170,171,172,173,174,174,180,184,187,187,188,194,197,197,197,198,201,202,202,207,208,211,212,212,214,217,219,219,220,220,223,225,227,228,229,229,233,235,235,236,242,242,245,246,252,253,253,257,257,260,261,266,266,268,269,271,271,275,276,281,282,283,284,285,287,289,289,295,296,298,300,300,301,304,306,308,309,310,316,318,318,324,326,329,329,329,330,330,332,337,337,341,341,349,351,351,354,356,357,366,369,377,379,380,382,391,391,394,396,396,400});
		
		System.out.println();
		for(int i:AliceRanking.climbingLeaderboard(new int[] { 100, 90, 90, 80, 75, 60 }, new int[] { 50, 65, 77, 90, 102 })) {
			System.out.print(" "+i);
		}
	}
}
