package Famous;

public class Beginner {

    // 2. fibonacci number
    static int fab(int n) {
        // F(0) = 0, F(1) = 1
        //F(n) = F(n - 1) + F(n - 2), for n > 1.

        if (n == 1 || n == 0) {
            return 1;
        }


        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }

        return b;
    }

    // 1. String is palindrome
    static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        // use 2 pointer tecnies
        int start = 0, end = str.length() - 1;

        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }


    public static void main(String[] args) {
        System.out.println(fab(4));
    }
}
