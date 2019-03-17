package leet;

public class MinWindow {
	public String minWindow(String s, String t) {
		int[] freq=new int[128];
		for(char c:t.toCharArray()) freq[c]++;
		
		 int anchor=0; //start index for valid substring
		 int cnt=t.length(); //number of characters in t
		 int minLen=Integer.MAX_VALUE; //min length of valid substring
		 int start=0; //start index of min length substring
	        for(int i=0;i<s.length();i++){
	            if(freq[s.charAt(i)]>0) cnt--;
				freq[s.charAt(i)]--;
				//if cnt==0 means window anchor to i is valid
	            while(cnt==0){
	                if(minLen>i-anchor+1){
	                    minLen=i-anchor+1;
	                    start=anchor;
	                }
	                if(freq[s.charAt(anchor)]==0) cnt++; 
					freq[s.charAt(anchor)]++;
	                anchor++;
	            }
	        }
	        return minLen==Integer.MAX_VALUE?"":s.substring(start,start+minLen);
	}
	public static void main(String[] args) {
		MinWindow minWindow=new MinWindow();
		System.out.println(minWindow.minWindow("DOBECODEBANC", "ABC"));
	}
}
