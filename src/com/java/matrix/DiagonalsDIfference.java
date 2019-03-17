package com.java.matrix;

public class DiagonalsDIfference {
	
	static int diagonalDifference(int[][] arr) {
        int leftSum=0;
        int rightSum=0;

        for(int i=0;i<arr.length;i++){
            leftSum+=arr[i][i];
            rightSum+=arr[arr.length -i][i];
        }
        if(rightSum > leftSum) return rightSum-leftSum;
        else  return leftSum-rightSum;

    }
	
	public static void main(String[] args) {
		float i=0;
		i++;
		String s="";
		System.out.println(i);
		System.out.println(1f/6f);
	}

}
