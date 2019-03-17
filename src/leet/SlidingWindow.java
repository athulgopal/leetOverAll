package leet;

public class SlidingWindow {
	public int[] maxSlidingWindow(int[] nums, int k) {
		int[] out = new int[(nums.length-k)+1];
		int inCOunt = 0;
		int j=0;
		if (nums.length == 0 || k == 0)
			return new int[0];
		for (int i = 0; i < nums.length-(k-1); i++) {
			int temp = nums[i];
			inCOunt = 1;
			while (inCOunt < k) {
				if (temp < nums[i + inCOunt])
					temp = nums[i + inCOunt];
				inCOunt++;
			}
			out[j]=temp;
			j++;
		}
		return out;
	}

	public static void main(String[] args) {
		SlidingWindow window = new SlidingWindow();
		for (int i : window.maxSlidingWindow(new int[] { -7,-8,7,5,7,1,6,0 }, 4)) {
			System.out.println(i);
		}
	}
}
