package com.algorithm.pattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IPAdressValidation {
	
	private static Pattern VALID_IPV4_PATTERN = null;
	  private static Pattern VALID_IPV6_PATTERN = null;
	
	public static void main(String[] args) {
		String reg="\\b(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\b";
		String ip="202.153.81.0";
		String[] ips=ip.split("\\.");
		long val=Long.parseLong(ips[0])*16777216 + Long.parseLong(ips[1]) * 65536 + Long.parseLong(ips[2]) * 256 + Long.parseLong(ips[3]) * 1 ;
		//335544320 + 10027008 + 20480 //3399045376
		
		System.out.println(val);
		
		long vals=-895922176 >>>24;
		
		System.out.println(vals);
		
		 String ipv4Pattern = "(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])";
		 String ipv6Pattern = "([0-9a-f]{1,4}:){7}([0-9a-f]){1,4}";
		 
		  VALID_IPV4_PATTERN = Pattern.compile(ipv4Pattern, Pattern.CASE_INSENSITIVE);
	      VALID_IPV6_PATTERN = Pattern.compile(ipv6Pattern, Pattern.CASE_INSENSITIVE);

		
		System.out.println(ip.matches(reg));
	}
	
	public static boolean isIpAddress(String ipAddress) {

	    Matcher m1 = VALID_IPV4_PATTERN.matcher(ipAddress);
	    if (m1.matches()) {
	      return true;
	    }
	    Matcher m2 = VALID_IPV6_PATTERN.matcher(ipAddress);
	    return m2.matches();
	  }
}
