package leet;

public class Intersect {
	public int[] intersect(int[] nums1, int[] nums2) {
		int len1 = nums1.length;
		int len2 = nums2.length;
		String out="";
		for (int i=0;i<len1;i++) {
			for (int j=0;j<len2;j++) {
				System.out.println(nums1[i]+"  "+nums2[j]);
				if (nums1[i] == nums2[j]) {
					out=out+nums1[i]+",";
					nums2[j]=-1;
					break;
				}
			}
		}
		int[] arr;
		if(out !=null && !out.equalsIgnoreCase("")) {
			arr=new int[out.split(",").length];
			int count=0;
			for(String s:out.split(",")) {
				if(s!=null && !s.equalsIgnoreCase("")) {
					arr[count]=Integer.parseInt(s);
					count++;
				}
			}
			return arr;
		}else {
			return new int[0];
		}
	}
	public static void main(String[] args) {
		Intersect intersect=new Intersect();
		for(int i:intersect.intersect(new int[]{}, new int[]{})) {
			System.out.println(" -- "+i);
		}
	}
}
