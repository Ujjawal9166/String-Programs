package PracticeString;

import java.util.HashSet;

public class CountDuplicateChar {

	public static void main(String[] args) {
		String s = "ujjawal";

		HashSet<Character> set = new HashSet<Character>();

		for (int i = 0; i < s.length(); i++) {
			set.add(s.charAt(i));
		}
		System.out.println(set);

		for (Character c : set) {
			int count = 0;
			for (int i = 0; i < s.length(); i++) {
				if (c == s.charAt(i)) {
					count++;
				}

			}
			if (count >= 2) {
				System.out.println(c + "=" + count);
			}

		}

	}

}
