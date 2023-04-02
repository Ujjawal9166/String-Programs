package PracticeString;

public class ReplaceCharWithItsOccurance {

	public static void main(String[] args) {

		String str="rajamauli";
		char chToReplace='a';
		
		if(str.indexOf(chToReplace)==-1) {
			System.out.println("Given character is not available");
			System.exit(0);
		}
		//logic to replace char occurence in string
		
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			
			char ch = str.charAt(i);
			if(ch==chToReplace) {
				str=str.replaceFirst(String.valueOf(chToReplace), String.valueOf(count));
				count++;
			}
		}
		
		System.out.println(str);
	}

}






//logic to replace char occurence in string but not possible for bigger string
//char[] arr = str.toCharArray();
//int count = 1;
//for (int i = 0; i < arr.length; i++) {
//	
//	if(arr[i]==chToReplace) {
//		arr[i]=String.valueOf(count).charAt(0);
//		count++;
//	}
//	
//}
//System.out.println(arr);