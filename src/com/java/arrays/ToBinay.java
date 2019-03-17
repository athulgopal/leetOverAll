package com.java.arrays;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class ToBinay {

	public void toBinay(String[] subnets) throws UnknownHostException {
		String[] binaryArray = new String[subnets.length];
		int i=0;
		int len=0;
		String supernet="";
		for (String net : subnets) {
			InetAddress inetAddress = InetAddress.getByName(net.substring(0, net.indexOf("/")));
			String[] bin;
			if (net.contains(":")) {
				bin = inetAddress.getHostAddress().split(":");
				len=16;
			} else {
				bin = inetAddress.getHostAddress().split("\\.");
				len=8;
			}
			StringBuffer buffer=new StringBuffer();
			for (String val : bin) {
				String temp=Integer.toString(new Integer(val),2);
				if(temp.length() < len) {
					String tempVal="";
					for(int j=0;j<len - temp.length();j++) tempVal="0"+tempVal;
					temp=tempVal+temp;
				}
				buffer.append(temp);
			}
			binaryArray[i++]=buffer.toString();
			buffer=null;
		}
		
		i=0;
		while(i<(len * (len/2))) {
			int sum=0;
			for(int j=0;j<subnets.length;j++) {
				sum+=(binaryArray[j].charAt(i) - '0');
			}
			if(sum !=0 && sum != subnets.length) break;
			i++;
		}
		int j=i;
		i=0;
		StringBuffer binary=new StringBuffer();
		for(char c:binaryArray[0].toCharArray()) {
			if(i<j)
				binary.append(c);
			else
				binary.append("0");
			i++;
			if(i%len==0) {
				supernet+=Integer.parseInt(binary.toString(), 2)+".";
				binary=new StringBuffer();
			}
		}
		System.out.println(supernet.substring(0, supernet.length()-1)+"/"+j);
	}

	public static void main(String[] args) {
		try {
			ToBinay binay = new ToBinay();
			long star=System.nanoTime();
			binay.toBinay(new String[] { "192.168.1.0/22", "192.168.2.0/22","192.168.3.0/22","192.168.4.0/22" });
			binay.toBinay(new String[] { "2404:0160:0000:0000:0000:0000:1000:0000/32", "2404:0160::/32" });
			binay.toBinay(new String[] { "123.123.120.0/24", "123.123.121.0/24","123.123.122.0/24","123.123.123.0/24", "123.123.124.0/24","123.123.125.0/24","123.123.126.0/24","123.123.127.0/24","123.123.128.0/24","123.123.129.0/24"});
			long end=System.nanoTime();
			System.out.println(end - star);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
