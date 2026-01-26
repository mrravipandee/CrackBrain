package Recursion;

import java.util.Arrays;

public class Easy {

    // 8. Fibonacci series
    static int fibonacciNum(int n) {
        if (n <= 1) return n;

        return fibonacciNum(n-1) + fibonacciNum(n-2);
    }

    // 7. check string is a palindrome
    static boolean isPalindrome(String str, int left, int right) {
        if (left >= right) return true;

        // string to character array
        char[] charArr = str.toCharArray();

        char temp = charArr[left];
        charArr[left] = charArr[right];
        charArr[right] = temp;

        String modified = new String(charArr);

        if (!modified.equals(str)) return false;

        return true;
    }

    // 6. reverse an array
    static void reverseArray(int[] arr, int l, int r) {
        if (l >= r) return;

        // swap elements
        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArray(arr, l+1, r-1);
    }

    // 5. Factorial of N numbers
    static int factN(int n) {
        if (n == 0 || n == 1) return 1;
        if (n <= 0) return 0;

        return n * factN(n-1);
    }

    // 4. sum of first n numbers
    static int sumN(int n) {
        if (n == 0) return 0;

        return n + sumN(n-1);
    }

    // 3. print n to 1
    static void numNto1(int n) {
        if (n <= 0) return;

        System.out.println(n);

        numNto1(n-1);
    }

    // 2. print 1 to n
    static void num1toN(int n) {
        if (n <= 0) return;

        num1toN(n-1);
        System.out.println(n);
    }

    // 1. print name n times
    static void names(int n) {
        if (n <= 0) return; // base case

        System.out.println("Ravi");

        names(n-1);
    }

    public static void main(String[] args) {

        int n = 5;

        for (int i = 0; i < n; i++) {
            System.out.println(fibonacciNum(i));
        }


    }
}
