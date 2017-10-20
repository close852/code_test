package com.cjw.main;

public class LoveLetter {

	public static void main(String[] args) {
		String s = "abcd";
		System.out.println(theLoveLetterMystery(s));
	}

	private static int theLoveLetterMystery(String s) {
		int rst = 0;
		char[] cArr = s.toCharArray();
		int srt=0;
		int len = s.length();
		int end=len-1;
		int i=0;
		while(true){
			if(srt+i>=end-i){
				break;
			}
			rst += Math.abs(cArr[srt+i]-cArr[end-i]);
			i++;
		}
		
		
		return rst;
	}

}
