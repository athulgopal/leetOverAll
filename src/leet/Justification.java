package leet;

import java.util.ArrayList;
import java.util.List;

public class Justification {
	public List<String> fullJustify(String[] words, int maxWidth) {
		List<String> temp = new ArrayList<>();
		StringBuffer buffer = new StringBuffer();
		List<String> list = new ArrayList<>();
		String calcSt="";
		int space = 0;
		int target = 0;
		int count=0;
		for (String st : words) {
			calcSt=calcSt+st;
			target += (st.length()+1);
			if (target > maxWidth  || count == words.length -1) {
				target -= st.length();
				int dif = maxWidth - (calcSt.length()-st.length());
				calcSt=st;
				int[] sp = new int[space - 1];
				for (int i = 0; i < dif; i++) {
					sp[i % (space - 1)]++;
				}
				int i = 0;
				for (String str : temp) {
					buffer.append(str);
					if(i <space -1)
					while (sp[i] > 0) {
						buffer.append(" ");
						sp[i]--;
					}
					i++;
				}
				list.add(buffer.toString());
				buffer = new StringBuffer();
				temp = new ArrayList<>();
				target = 0;
				space=0;
			}
			temp.add(st);
			space++;
			count++;

		}
		for(String st:list)System.out.println(st);
		return list;
	}
	public static void main(String[] args) {
		Justification justification=new Justification();
		justification.fullJustify(new String[] {"This", "is", "an", "example", "of", "text", "justification."}, 16);
	}
}
