package PracticeString;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FirstNonRepeatedCh {

	public static void main(String[] args) {
		String input="AABCBDECD";

		for (int i = 0; i < input.length(); i++) {

			boolean unique = true;

			for(int j=0; j<input.length(); j++) {

				if(i!=j && input.charAt(i)==input.charAt(j)) {
					unique=false;

				}

			}
			if(unique) {
				System.out.println(input.charAt(i));
				break;
			}
		}

		//by using map

		Map<Character, Integer>map=new HashMap<>();
		for(int i=0; i<input.length(); i++) {
			char ch= input.charAt(i);

			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}
			else {
				map.put(ch, 1);
			}
		}
		System.out.println(map);
		for ( Entry<Character, Integer> entryset: map.entrySet()) {
			if(entryset.getValue()==1) {
				System.out.println(entryset.getKey());
				break;
			}


		}


	}

}
