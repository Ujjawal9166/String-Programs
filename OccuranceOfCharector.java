 package PracticeString;


import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceOfCharector {

	public static void main(String[] args) {
		String str = "UjJawal";
		String str1=str.toLowerCase();
		char[] chars= str1.toCharArray();
		Map<Character, Integer> map=new LinkedHashMap<>();
		

		for (char c : chars) {

			if(!map.containsKey(c)) {
				map.put(c, 1);
			}
			else {
				int value=map.get(c);
				map.put(c, value+1);
			}

		}
		System.out.println(map);
	}

}
