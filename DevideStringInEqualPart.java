package PracticeString;
import java.util.Scanner;
public class DevideStringInEqualPart {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        
        System.out.print("Enter the number of parts: ");
        int n = scanner.nextInt();
        
        int len = str.length();

        // Check if string can be divided into n equal parts
        if (len % n != 0) {
            System.out.println("Error: The string cannot be divided into " + n + " equal parts.");
            return;
        }

        int partSize = len / n;
        System.out.println("Divided String Parts:");
        
        // Loop through and print each part
        for (int i = 0; i < len; i += partSize) {
            System.out.println(str.substring(i, i + partSize));
        }

        scanner.close();
    }

}
