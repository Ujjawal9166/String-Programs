package PracticeString;

public class RemoveSplCH {

	public static void main(String[] args) {
		String str="!@#UJJ$#*WA#@L";
		String remStr = str.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(remStr);
	}

}
