package com.syntax.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public static List<String> doesCircleExist(List<String> commands) {
		String currentDirection = "N";
		int x = 0, y = 0;
		List<String> outPut = new LinkedList<>();
		for (String command : commands) {
			x=0;
			y=0;
			for (int i = 0; i < 4; i++) {
				for (char c : command.toCharArray()) {
					switch (currentDirection) {
					case "N": {
						if (c == 'G') {
							y = y + 1;
						} else if (c == 'R') {
							x = x - 1;
							currentDirection = "W";
						} else if (c == 'L') {
							x = x + 1;
							currentDirection = "E";
						}
						break;
					}
					case "S": {
						if (c == 'G') {
							y = y - 1;
						} else if (c == 'R') {
							x = x + 1;
							currentDirection = "E";
						} else if (c == 'L') {
							x = x - 1;
							currentDirection = "W";
						}
						break;
					}
					case "E": {
						if (c == 'G') {
							x = x + 1;
						} else if (c == 'R') {
							y = y + 1;
							currentDirection = "N";
						} else if (c == 'L') {
							y = y - 1;
							currentDirection = "S";
						}
						break;
					}
					case "W": {
						if (c == 'G') {
							x = x - 1;
						} else if (c == 'R') {
							y = y - 1;
							currentDirection = "S";
						} else if (c == 'L') {
							y = y + 1;
							currentDirection = "N";
						}
						break;
					}
					}
				}

			}
			
			if(x==0 && y==0) outPut.add("YES");
			else outPut.add("NO");
		}
		return outPut;
	}
	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("GGLLL");
		list.add("L");
		
		System.out.println(Solution.doesCircleExist(list).toString());
		
		
	}
}
