package com.java.matrix;

public class ReplaceZero {
	
	public void replace(int[][]inp,int n) {
		int[][] temp=new int[n][n];
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				temp[i][j]=inp[i][j];
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				if(inp[i][j]==0) {
					putZero(temp,i,j,n);
				}
			}
		}
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(temp[i][j]+" ");
			}
			System.out.println();
		}
	}
	public void putZero(int[][]inp,int i,int j,int n) {
		for(int k=0;k<n;k++) {
			inp[i][k]=0;
			inp[k][j]=0;
		}
	}
	public static void main(String[] args) {
		ReplaceZero replaceZero=new ReplaceZero();
		int[][] inp= {{1,2,3,4},{5,0,7,8},{9,10,0,12},{13,14,15,16}};
		replaceZero.replace(inp, 4);
		
	}
}
