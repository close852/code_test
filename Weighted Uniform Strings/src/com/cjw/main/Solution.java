package com.cjw.main;

import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {

		String s = "abccddde";
		List<Integer> iLists = chgToNum(solution(s));
		System.out.println(iLists);
	}

	private static List<Integer>chgToNum(List<String> lists){
		List<Integer> iLists = new ArrayList<>();
		for(String str : lists){
			char[] cArray = str.toCharArray();
			int value=0;
			for(int i=0;i<cArray.length;i++){
				value+=cArray[i]-96;
			}
			iLists.add(value);
		}
		return iLists;
	}
	private static List<String> solution(String s) {
		List<String> lists = new ArrayList<>();
		int len = s.length();
		char[] cArray = s.toCharArray();
		int srt = 0;
		for (int i = 0; i < len; i++) {
			if(cArray[srt]==cArray[i]){
				lists.add(s.substring(srt,i+1));
			}else{
				srt=i;
				i--;
			}
		}
		return lists;
	}
}
