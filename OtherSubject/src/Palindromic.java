import java.util.Scanner;

public class Palindromic {
    static boolean isPalindrome(String str) {
        String reverse = "";
        for (int i=str.length()-1; i >= 0; i--) {
            reverse += str.charAt(i);
        }

        return str.equals(reverse);
    }

    public static void main(String[] args) {
        System.out.print("Enter a Word : ");
        Scanner word = new Scanner(System.in);
        String str = word.nextLine();

        System.out.println(isPalindrome(str));
    }
}
