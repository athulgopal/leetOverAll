package leet;

public class MakePalindrome {
	public boolean validPalindrome(String s) {
		int lo=0;
		int removalCount=0;
		int hi=s.length()-1;
		s=s.toLowerCase();
		while(lo < hi) {
			while(lo < hi && !isAcceptedChar(s.charAt(lo)))lo++;
			while(hi > lo && !isAcceptedChar(s.charAt(hi)))hi--;
			if(s.charAt(lo) != s.charAt(hi)) {
				System.out.println(lo+" "+hi);
				System.out.println(s.charAt(lo)+" "+s.charAt(hi));
				int count=1;
				while(lo < hi) {
					System.out.println(s.charAt(lo+count)+" "+s.charAt(hi));
					if(s.charAt(lo+count) == s.charAt(hi) && s.charAt(lo) != s.charAt(hi-count)) {
						lo=lo+count;
						break;
					}else if(s.charAt(lo) == s.charAt(hi-count) && s.charAt(lo+count) != s.charAt(hi)) {
						hi=hi-count;
						break;
					}
					count++;
				}
				if(removalCount !=0)
					return false;
				else {
					removalCount=removalCount+1;
				}
			}else {
				lo++;
				hi--;
			}
		}
		if(removalCount ==0 || removalCount ==1)
			return true;
		else 
			return false;
	}
	private boolean isAcceptedChar(char c) {
		if(new String(c+"").matches("[A-Za-z0-9]*"))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		MakePalindrome palindrome=new MakePalindrome();
		System.out.println(palindrome.validPalindrome("aguokepatgbnvfqmgmlcupuufxoohdfpgjdmysgvhmvffcnqxjjxqncffvmhvgsymdjgpfdhooxfuupuculmgmqfvnbgtapekouga"));
	}
}
