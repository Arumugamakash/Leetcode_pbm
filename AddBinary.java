package com;

public class AddBinary {
	public static String addBinary(String a, String b) {
		StringBuilder sb = new StringBuilder();
		int y = a.length() - 1;
		int z = b.length() - 1;
		int sum = 0;
		while (y >= 0 || z >= 0 || sum == 1) {
			if (y >= 0) {
				sum += a.charAt(y--) - '0';
			}
			if (z >= 0) {
				sum += b.charAt(z--) - '0';
			}
			sb.append(sum % 2);
			sum /= 2;
		}
		return sb.reverse().toString();

	}
}
