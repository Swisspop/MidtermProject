package string.problems;

public class Palindrome {
    public static void main(String[] args) {
        String str = "MADAM";
        boolean isPalindrome = true;

        // Check if the string is a palindrome
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println(str + " is a palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }
    }
}
