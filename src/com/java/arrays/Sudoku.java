package com.java.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Sudoku {
	public boolean isValidSudoku(char[][] board) {
		Map<Integer, List<String>> iMap = new HashMap<>();
		Map<Integer, List<String>> jMap = new HashMap<>();
		Map<String, List<String>> clMap = new HashMap<>();

		for (int i = 0; i < board.length; i++) {
			if (iMap.get(i) == null)
				iMap.put(i, new ArrayList<>());
			List<String> iList = iMap.get(i);
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] != '.') {
					String col=(i/3)+","+(j/3);
					if(clMap.get(col) == null) clMap.put(col, new ArrayList<>());
					List<String> clList= clMap.get(col);
					if (jMap.get(j) == null)jMap.put(j, new ArrayList<>());
					List<String> jList = jMap.get(j);
					if (iList.contains(board[i][j] + "") || jList.contains(board[i][j] + "") || clList.contains(board[i][j] + ""))
						return false;
					else {
						iList.add(board[i][j] + "");
						jList.add(board[i][j] + "");
						clList.add(board[i][j] + "");
					}
				}
			}
		}
		return true;
	}
}
