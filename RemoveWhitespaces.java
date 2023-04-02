package PracticeString;

public class RemoveWhitespaces {

	public static void main(String[] args) {
		String str="U J J A  W   A L";
		
		String trimStr=str.replaceAll("\\s", "");
		System.out.println(trimStr);
	}

}
