package leet;

public class PerfectPalindrome {
	public boolean isPalindrome(String s) {
		int lo=0;
		int hi=s.length()-1;
		s=s.toLowerCase();
		while(lo < hi) {
			while(lo < hi && !isAcceptedChar(s.charAt(lo)))lo++;
			while(hi > lo && !isAcceptedChar(s.charAt(hi)))hi--;
			if(s.charAt(lo) != s.charAt(hi)) return false;
			lo++;
			hi--;
		}
		return true;
	}
	private boolean isAcceptedChar(char c) {
		if(new String(c+"").matches("[A-Za-z0-9]*"))
			return true;
		else return false;
	}
	public static void main(String[] args) {
		PerfectPalindrome palindrome = new PerfectPalindrome();
		System.out.println(palindrome.isPalindrome(".;"));
	}
}
