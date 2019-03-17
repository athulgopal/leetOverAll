package com.syntax.test;

public class ArrowOperator {
	public static void main(String[] args) {
		int n=3;
		System.out.println((2<<3));
		for(int i=0;i < (2<<n); i++) {
			System.out.println(i);
		}
	}
}
