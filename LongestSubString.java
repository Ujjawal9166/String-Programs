package PracticeString;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubString {

	/*write a java program to find longest substring length which doesen't contain 
	repeating character in given string*/
	
	public static void main(String[] args) {
		lengthOfLongestSubString("aabbabcddabcdeefab");
		
	}

	private static void lengthOfLongestSubString(String s) {
		
		String longestSubString = null;
		int longestSubStringLength = 0;
		Map<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		
		char[] arr=s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			char ch=arr[i];
			if(!map.containsKey(ch)) {
				map.put(ch, i);
			}
			else {
				i=map.get(ch);
				map.clear();
			}
			
			if(map.size()>longestSubStringLength) {
				longestSubStringLength=map.size();
				longestSubString=map.keySet().toString();
			}
		}
		System.out.println("The longest substring->"+longestSubString);
		System.out.println("the longest substring length->"+longestSubStringLength);
		
	}

}
