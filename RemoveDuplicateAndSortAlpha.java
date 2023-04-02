package PracticeString;

public class RemoveDuplicateAndSortAlpha {

	public static void main(String[] args) {
		String str = "hgghdcbbaaef";

		// without using sort method remove duplicate ch also
		String str1 = str.toLowerCase();
		char[] ch = str1.toCharArray();
		StringBuilder sb = new StringBuilder();
		char temp;
		for (int i = 0; i < ch.length; i++) {
			boolean repeat = false;
			for (int j = i + 1; j < ch.length; j++) {

				if (ch[i] > ch[j]) {
					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;

				}
				if (ch[i] == ch[j]) {
					repeat = true;
					break;
				}
			}
			if (!repeat) {
				sb.append(ch[i]);
			}
		}
		//String sb1 = new String(ch);
		System.out.println(sb);

	}

}
