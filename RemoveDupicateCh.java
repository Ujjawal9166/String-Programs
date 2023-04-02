package PracticeString;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupicateCh {

	public static void main(String[] args) {

		// by using set interface
		String str = "Ujjawal";

		StringBuilder sb = new StringBuilder();
		Set<Character> s = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			s.add(str.charAt(i));
		}

		for (Character ch : s) {
			sb.append(ch);
		}
		System.out.println(sb);

		
		
		// by using inner and outer for loop

		char[] arr = str.toCharArray();
		StringBuilder sb1 = new StringBuilder();

		for (int i = 0; i < arr.length; i++) {

			boolean repeat = false;
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] == arr[j]) {
					repeat = true;
					break;
				}
			}
			if (!repeat) {
				sb1.append(arr[i]);
			}
		}
		System.out.println(sb1);

	}

}
