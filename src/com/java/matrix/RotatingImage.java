package com.java.matrix;

public class RotatingImage {
	public void rotate(int[][] image,int n) {
		int[][] op=new int[n][n];
		for(int i=0;i<n;i++) 
			for(int j=0;j<n;j++) 
					op[j][(n-1)-i]=image[i][j];
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<n;j++) {
				System.out.print(op[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RotatingImage images=new RotatingImage();
		int[][] image =new int[4][4];
		int count=0;
		for (int row = 0; row < 4; row ++)
		    for (int col = 0; col < 4; col++)
		    	image[row][col] = ++count;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(image[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		images.rotate(image, 4);
	}
}