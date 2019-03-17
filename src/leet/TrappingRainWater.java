package leet;

public class TrappingRainWater {
	public int trap(int a[]) {
		int vol=0;
		int left=0;
		int right=a.length-1;
		int maxLeft=0;
		int maxRight=0;
		while(left <= right) {
			if(a[left] <= a[right]) {
				if(a[left] >= maxLeft) maxLeft = a[left];
				else vol=vol + (maxLeft-a[left]);
				left++;
			}else {
				if(a[right]>=maxRight) maxRight=a[right];
				else vol=vol+(maxRight-a[right]);
				right--;
			}
		}
		return vol;
	}
	
	public static void main(String[] args) {
		TrappingRainWater water=new TrappingRainWater();
		System.out.println(	water.trap(new int[] {0,1,0,2,1,0,1,3,2,1,2,1}));
	}
}
