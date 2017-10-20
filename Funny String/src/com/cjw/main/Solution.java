package com.cjw.main;

public class Solution {

	public static void main(String[] args) {
		String s = "acxz";
		System.out.println(solution(s));
		;
	}

	private static String solution(String s) {
		char[] cArray = s.toCharArray();
		String result = "Funny";
		int len = cArray.length;
		for (int i = 0; i < len - 1; i++) {
			if (!(Math.abs(cArray[i + 1] - cArray[i]) == Math.abs(cArray[len - i-1] - cArray[len - i - 2]))) {
				result = "Not Funny";
				break;
			}
		}
		return result;
	}
}
