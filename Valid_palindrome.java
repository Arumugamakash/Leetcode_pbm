package com;

public class Valid_palindrome {
	public  boolean isPalindrome(String s) {
		StringBuilder sb = new StringBuilder();
		s = s.toLowerCase();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z' || s.charAt(i) >= '0' && s.charAt(i) <= '9') {
				sb.append(s.charAt(i));
			}
		}
		String str=sb.toString();
		StringBuilder rev = sb.reverse();
		String res=rev.toString();
		if (str.equals(res)) {
			return true;
		}

		return false;

	}
}
