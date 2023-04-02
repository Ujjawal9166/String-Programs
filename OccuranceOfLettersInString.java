package PracticeString;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class OccuranceOfLettersInString {

	public static void main(String[] args) {
		String str="Ujjawal";
		String str1=str.toLowerCase();
		char[] chArr=str1.toCharArray();
		
		HashMap<Character, Integer> count= new LinkedHashMap<Character, Integer>();
		
		for(int i=0; i<str1.length(); i++) {
			count.putIfAbsent(chArr[i], 0);
		}
		for(int i=0; i<str1.length(); i++) {
			char ch=chArr[i];
			
			if(count.containsKey(chArr[i])) {
				count.put(ch,(count.get(ch)+1));
			}
		}
		//TreeMap<Character, Integer> countsort =new TreeMap<Character, Integer>(count);
		System.out.println(count);

		
		
	}


}
