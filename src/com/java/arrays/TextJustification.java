package com.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class TextJustification {
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> op = new ArrayList<>();
		List<String> temp = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();

		int space = 0;
		int target = 0;
		for (String st : words) {
			target += st.length();
			if (target >= maxWidth) {
				target -= st.length();
				int dif = maxWidth - target;
				int[] sp = new int[space - 1];
				for (int i = 0; i < dif; i++) {
					sp[i % (space - 1)]++;
				}
				int i = 0;
				for (String str : temp) {
					buffer.append(str);
					if (i < space - 1)
						while (sp[i] > 0) {
							buffer.append(" ");
							sp[i]--;
						}
				}
			}
			temp.add(st);
			space++;

		}

		return op;
	}
}
