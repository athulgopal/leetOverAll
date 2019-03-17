package com.java.arrays;

public class RotateImage {
	public void rotate(int[][] matrix) {
		int len=matrix.length;
		int[][] mat=new int[len][len];
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.println(i+","+j+" -> "+j+","+(len-i-1));
				mat[j][len-i-1]=matrix[i][j];
			}
		}
		
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				System.out.print(mat[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		RotateImage image=new RotateImage();
		int[][] mat=new int[3][3];
		int k=0;
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				mat[i][j]=++k;
			}
		}
		
		image.rotate(mat);
	}
}
