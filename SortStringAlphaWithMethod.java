package PracticeString;

import java.util.Arrays;

public class SortStringAlphaWithMethod {

	public static void main(String[] args) {

		String s="adbfcgeh";
		char[] ch = s.toCharArray();
		Arrays.sort(ch);
		System.out.println(new String(ch));
		
		
	}

}
