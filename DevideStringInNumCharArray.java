package PracticeString;

public class DevideStringInNumCharArray {

	public static void main(String[] args) {
		String str="a1b2c3";
		System.out.println(str);
		char[] arr1 = str.replaceAll("[^a-zA-Z]", "").toCharArray();
		char[] arr2 = str.replaceAll("[^0-9]", "").toCharArray();
		
		for (char c : arr1) {
			System.out.print(c+" ");
			
		}
		System.out.println();
		for (char c : arr2) {
			System.out.print(c+" ");
			
		}
	}
}
