package PracticeString;



public class ReverseString {

	public static void main(String[] args) {
		
		String str = "Banglore is a capital of karnatka";
		System.out.println(str);
		String[] word = str.split(" ");
		str = "";

		for (String w : word) {
			String reverseWord = "";
			for (int i = w.length() - 1; i >= 0; i--) {
				reverseWord = reverseWord + w.charAt(i);
			}
			str = str + reverseWord + " ";
		}
		System.out.println(str);
//-----------------------------------------------------------------------------
		//by using predefined method

		String reverseWord="";
		for(String w:word) {
			StringBuilder sb= new StringBuilder(w);
			sb.reverse();
			reverseWord = reverseWord+sb.toString()+" ";

		}
		System.out.println(reverseWord);
	}
}
