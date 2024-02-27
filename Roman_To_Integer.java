package com;

public class Roman_To_Integer {
	public int romanToInt(String s) {
		int sum = 0;
		for (int i = 0; i < s.length(); i++) {
			int a = m1(s.charAt(i));// 1000
			if (i + 1 < s.length()) {
				int b = m1(s.charAt(i + 1));// 100

				if (a >= b) {
					sum = sum + a;// 1000

				} else {
					sum = sum - a;// 1989
				}
			} else {
				sum += a;
			}
		}
		return sum;

	}

	public static int m1(char ch) {
		switch (ch) {
		case 'I':
			return 1;
		case 'V':
			return 5;
		case 'X':
			return 10;
		case 'L':
			return 50;
		case 'C':
			return 100;
		case 'D':
			return 500;
		case 'M':
			return 1000;
		}
		return -1;

	}

}
