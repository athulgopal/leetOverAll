package com.algorithm.pattern;

import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.util.CIDRUtils;

public class IPBinary {
	public static void main(String[] args) throws UnknownHostException {
		
		String subNet="2404:0160:0000:0000:0000:0000:1000:0000/112";
		CIDRUtils cidrUtils = new CIDRUtils(subNet);
		/*SubnetUtils subnet = new SubnetUtils(subNet);
		System.out.println(subnet.getInfo().getNetworkAddress().equals(subNet));*/
		
		System.out.println(cidrUtils.getNetworkAddress());
		System.out.println(cidrUtils.getBroadcastAddress());
		
		
		
		String ip = Integer.toBinaryString(202) + "." + Integer.toBinaryString(153) + "." + Integer.toBinaryString(79) + "." + Integer.toBinaryString(0);
		List<String> list = Arrays.asList(ip.split("\\."));
		List<String> listOut = new ArrayList<>();
		int sig = 22;
		StringBuilder builder = new StringBuilder();
		for (String s : list) {
			for (char c : s.toCharArray()) {
				if (sig > 0) {
					sig--;
					builder.append(c);
				} else {
					builder.append('0');
				}
			}
			listOut.add(builder.toString());
			builder = new StringBuilder();
		}
		for (String s : list) {
			System.out.print(s + " ");
		}
		System.out.println();

		for (String s : listOut) {
			System.out.print(s + " ");
		}
	}
}
