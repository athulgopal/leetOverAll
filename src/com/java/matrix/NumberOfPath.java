package com.java.matrix;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberOfPath {
	public static int numberOfPaths(List<List<Integer>> a) {
        int path=0;
        int j=0;
        int i=0;
        int[][] arr=new int [a.get(0).size()][a.size()];
        for(List<Integer> list:a){
            i=0;
            for(int k:list){
                arr[i][j]=k;
                i++;
            }  
            j++; 
        }
        
        for(i=0;i<a.get(0).size();i++) {
        	for(j=0;j<a.size();j++) {
        		
        	}
        	System.out.println(" ");
        }
        return path;
    }
	public static void main(String[] args) {
		NumberOfPath path=new NumberOfPath();
		
		List<List<Integer>> a=new ArrayList<>();
		
		List<Integer> b=Arrays.asList(new Integer[] {1,1});
		List<Integer> c=Arrays.asList(new Integer[] {1,1});
		
		a.add(b);
		a.add(c);
		
		path.numberOfPaths(a);
		
	}
}
