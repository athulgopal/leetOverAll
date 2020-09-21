package fb.leet;

//Input: s = "abcabcbb"
//Output: 3
//Explanation: The answer is "abc", with the length of 3.
//Input: s = "bbbbb"
//Output: 1
//Explanation: The answer is "b", with the length of 1.

public class LongestSubstringWithoutRepeatingCharacters
{
	public int lengthOfLongestSubstring(String s)
	{
		int[] map = new int[128];
		int start = 0, end = 0, count = 0, maxLen = 0;
		while (end < s.length())
		{
			char c1 = s.charAt(end);
			if (map[c1] > 0)
				count++;
			map[c1]++;
			end++;
			while (count > 0)
			{
				char c2 = s.charAt(start);
				if (map[c2] > 1)
					count--;
				map[c2]--;
				start++;
			}
			maxLen = Math.max(maxLen, end - start);
		}
		return maxLen;
	}

	public static void main(String[] args)
	{
		String val = "abcabcbb";
		LongestSubstringWithoutRepeatingCharacters characters = new LongestSubstringWithoutRepeatingCharacters();
		System.out.println("The longest value is: " + characters.lengthOfLongestSubstring(val));
		val = "bbbbb";
		System.out.println("The longest value is: " + characters.lengthOfLongestSubstring(val));
		val = "pwwkew";
		System.out.println("The longest value is: " + characters.lengthOfLongestSubstring(val));
		val = "";
		System.out.println("The longest value is: " + characters.lengthOfLongestSubstring(val));
	}
}
