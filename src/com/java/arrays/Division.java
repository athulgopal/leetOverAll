package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class Division {
	public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
		double[] op=new double[queries.length];
		List<String[]> list=new ArrayList<>();
		String[] temp;
		int count=0;
		for(String [] st:equations) {
			temp=new String[3];
			int i=0;
			for(String s:st) {
				temp[i++]=s;
			}
			temp[i]=values[count++]+"";
			list.add(temp);
		}
		for(int i=0;i<queries.length;i++) {
			String a=queries[i][0];
			String b=queries[i][1];
			String numerator=null;
			String denominator=null;
			for(String[] st:list) {
				for(int j=0;j<2;j++) {
					if(st[j].equals(a)) {
						numerator=st[0]+st[1]+st[2];
					}
					if(st[j].equals(b)) {
						denominator=st[0]+st[1]+st[2];
					}
				}
				if(numerator!=null && denominator!=null) {
					if(a.equals(b)) {
						op[i] =1d;
						break;
					}
					if(numerator.equals(denominator)) {
						op[i] =Double.parseDouble(numerator.charAt(2)+"");
						break;
					}
					Double p;
					Double q;
					if(numerator.charAt(0) ==a.charAt(0) ) {
						p=Double.parseDouble(numerator.charAt(2)+"");
					}else {
						p=(1d/Double.parseDouble(numerator.charAt(2)+""));
					}
					if(denominator.charAt(0) ==b.charAt(0) ) {
						q=Double.parseDouble(denominator.charAt(2)+"");
					}else {
						q=(1d/Double.parseDouble(denominator.charAt(2)+""));
					}
					op[i]=p/q;
				}
				if(op[i] == 0.0d) {
					op[i] =-1d;
				}
			}
		}
		return op;
	}
	
	public static void main(String[] args) {
		Division division=new Division();
		String[][] equations= new String [][]{ {"a", "b"}, {"b", "c"} };
		double[] values=new double[]{2.0, 3.0};
		String[][] queries=new String[][]{ {"a", "c"}, {"b", "c"}, {"a", "e"}, {"a", "a"}, {"x", "x"} };
		
		for(double d:division.calcEquation(equations, values, queries)) {
			System.out.println(d);
		}
	}
}
