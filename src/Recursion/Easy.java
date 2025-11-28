package Recursion;

public class Easy {

    // 8. recursion
    static boolean isPalindromeRec(String str, int start, int end) {
        if (start >= end) { // base case
            return true;
        }

        if(str.charAt(start) != str.charAt(end)) return false;

        return isPalindromeRec(str, start+1, end-1);
    }

    // 7. Reverse an array
    static void reverse(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, start + 1, end - 1);
    }

    // 6. Factorial of N numbers
    static int factorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }

        // multiply the value and num - 1 to go way decrision order
        return num * factorial(num-1);
    }

    // 5. Sum of first N numbers eg. n is 3 then ans is 6.... 1 + 2 + 3 = 6
    static int sumofN(int n) {
        if (n == 0) {
            return 0;
        }

        n = n + sumofN(n - 1);
        return n;
    }

    // 4. print 1 to n using backtracking
    static void print1toN(int i, int n) {
        if (n < 1) {
            return;
        }

        print1toN(i, n-1);
        System.out.println(n);
    }

    // 3. print in terms of n to 1
    static void printNto1(int n) {
        if (n < 1) {
            return;
        }

        System.out.println(n);
        n--;
        printNto1(n);
    }

    // 2. print name n times
    static void printName(int n) {
        if (n < 1) {
            return;
        }

        System.out.println("Ravii");
        n--;
        printName(n);
    }

     // 1. print 1 to 5
    static void printNum(int num) {
        if (num > 5) {
            return;
        }

        System.out.println(num);
        num++;
        printNum(num);
    }

    public static void main(String[] args) {
        System.out.println(isPalindromeRec("rar", 0, "rar".length() - 1));
    }
}
