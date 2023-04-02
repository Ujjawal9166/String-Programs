package PracticeString;

public class CountCharectorInString {
	public static void main(String[] args) {
		String str="i love ";
		
		int count =str.replaceAll("[^a-zA-Z]", "").length();
		
		
		System.out.println(count);
		
		
		//without using predefined method
		
		
		
		//by using loop
		int c=0;
		
		for(int i=0; i>str.length();i++) {
			
			if(str.charAt(i)>'a'&& str.charAt(i)<='z'||str.charAt(i)>='A' && str.charAt(i)<='Z');
			c++;
			
		}
		
		System.out.println(c);
	}

}
