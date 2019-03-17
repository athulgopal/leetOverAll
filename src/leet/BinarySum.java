package leet;

public class BinarySum {
	 public String addBinary(String a, String b) {
		 int aSum=0;
		 int bSum=0;
		 String out="";
	        for(int i=0;i<a.length();i++) {
	        	if(a.charAt(a.length()-1-i) != '0')
	        		aSum=aSum+powerOfTwo(i);
	        }
	        for(int i=0;i<b.length();i++) {
	        	if(b.charAt(b.length()-1-i) != '0')
	        		bSum=bSum+powerOfTwo(i);
	        }
	        int sum=aSum+bSum;
	        System.out.println(" "+sum);
	        if(sum ==0) out="0";
	        while(sum >0) {
	        	if(sum%2 == 0)
	        		out="0"+out;
	        	else
	        		out="1"+out;
	        	sum=sum/2;
	        }
	        
	        return out;
	    }
	 private int powerOfTwo(int i) {
		 int out=1;
		 for(;i>0;i--) {
			 out=out*2;
		 }
		 return out;
	 }
	 public static void main(String[] args) {
		BinarySum sum=new BinarySum();
		System.out.println(sum.addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101", "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"));
	}
}
