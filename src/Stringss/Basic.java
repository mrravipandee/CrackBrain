package Stringss;

public class Basic {

    // Count length of integer without using loop use string function
    static int countLength(int num) {

        String str = String.valueOf(num);

        return str.length();
    }

    // String is Palindrome
    static boolean isPalindrome(String s) {

        // 1. lowercase + remove non-alphanumeric
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        // 2. two pointer comparison
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    // Q2. Count Vowels (Easy)
    static void vowels(String str) {
        int count = 0;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                count++;
            }
        }

        System.out.println(count);
    }

    // Q1. Reverse a String (Easy)
    static void reverseStr(String s) {
        String reverse = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }

        System.out.println(reverse);
    }

    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");


    }
}
