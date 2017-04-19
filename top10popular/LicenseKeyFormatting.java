package com.problems.top10popular;

import java.util.Scanner;

/**
 * * Problem 482: License Key Formatting
 * Now you are given a string S, which represents a software license key which we would like to format. 
 * The string S is composed of alphanumerical characters and dashes. 
 * The dashes split the alphanumerical characters within the string into groups.
 *  (i.e. if there are M dashes, the string is split into M+1 groups). 
 * The dashes in the given string are possibly misplaced.

We want each group of characters to be of length K 
(except for possibly the first group, which could be shorter, but still must contain at least one character).
 To satisfy this requirement, we will reinsert dashes. Additionally, all the lower case letters in the string must be converted to upper case.
 So, you are given a non-empty string S, representing a license key to format, and an integer K. 
And you need to return the license key formatted according to the description above.
 
 Note:
The length of string S will not exceed 12,000, and K is a positive integer.
String S consists only of alphanumerical characters (a-z and/or A-Z and/or 0-9) and dashes(-).
String S is non-empty.
 
 * @author Ankita Patil
 *
 */

class LicenseKey {
	public static String formatLicenseKey(String s, int k){
		s = s.replaceAll("-", "").toUpperCase();
		StringBuilder sb = new StringBuilder(s);
		 
		//starting from end and going backwards
		int i = sb.length() - k;
		
		while (i > 0){
			sb.insert(i, '-');
			i -= k;
		}
		return sb.toString();
	}
}
public class LicenseKeyFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner src = new Scanner(System.in);
		
		System.out.println("Enter a license key");
		String s = src.nextLine();
		if (s == "") {
			System.out.println("License key cannot be empty");
		}
		if (s.length() > 12000) {
			System.out.println("License key cannot exceed 12000");
		}
		
		System.out.println("Enter K");
		int k = src.nextInt();
		if (k < 0) {
			System.out.println("The length of the group cannot be empty");
		}
		
		System.out.println("License Key: "+s);
		
       if(s != "" && s.length() < 12000 && k > 0 ) {
    	   System.out.println("Formatted License key: "+LicenseKey.formatLicenseKey(s, k));
		}
       
       
	}

}
