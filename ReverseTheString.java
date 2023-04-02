package PracticeString;

public class ReverseTheString {

	public static void main(String[] args) {
		String str="Ujjawal singh";
		
		//char[] ch= str.toCharArray();
		//for (int i = ch.length-1; i >=0 ; i--) {
			//System.out.print(ch[i]);
			
		//}
		
		//System.out.println("");
		
		//2nd approach
		for(int i=str.length()-1; i>=0;i--) {
			
			System.out.print(str.charAt(i));
		}
			
		System.out.println("");
		
		//3rd approach
		
		StringBuffer s=new StringBuffer(str);
		System.out.println(s.reverse());
		
		
		//4th approach
		
		StringBuilder sb=new StringBuilder(str);
		System.out.println(sb.reverse());
	}
	

}
