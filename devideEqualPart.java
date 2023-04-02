package PracticeString;

public class devideEqualPart {

	public static void main(String[] args) {
		String s = "QWERTYUIOP";
		int len = s.length();
		int nd = 5
				,t = 0;
		int chars = len/nd;
		String[] s1 = new String[nd];
		
		if(len%nd != 0) {
			System.out.println("Unable.");
		}
		else {
			for(int i = 0;i<len;i=i+chars) {
				s1[t] = s.substring(i, i+chars);
				t++;
			}
			for(String p : s1) {
				System.out.println(p);
			}
		}
	}

}
