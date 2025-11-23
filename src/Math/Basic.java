package Math;

public class Basic {

    // 7. GCD -


    // 6. Print all divisions
    static void allDivision(int num) {

        for (int i = 1; i <= Math.sqrt(num); i++) {
            if (num % i == 0) { // 36 % 1 = 0, 36 % 2 = 0 ...
                System.out.println(i);
            }
        }
    }

    // 5. Check for Prime
    static boolean isPrime(int num) {
        // Prime numbers start from 2 (0 and 1 are not prime)
        if (num <= 1) return false;
        // Loop from 2 to sqrt(num)
        // Because any factor > sqrt(num) will have a pair < sqrt(num)
        for (int i = 2; i * i <= num; i++) { // start from 2 means prime numbers, only those numbers that divide by 1 and themselves, so here
            // eg. 25 -> 2 to 24 loop
            // If num is divisible by any number in this range, it's not prime
            if (num % i == 0) return false;
        }

        return true;
    }

    // 4. Armstrong Numbers
    static void armstrong(int num) {
        int n = countDigit(num);
        int sum = 0;
        // eg. 153
        while (num > 0) {
            int digit = num % 10; // giving me digit
            num = num / 10; // reduce the last number
            sum += Math.pow(digit, n); // now here i want to implement sum = 1^3 + 5^3 + 3^3;
        }

        if(num == sum) System.out.println("Armstrong number");
        else System.out.println("Its not Armstrong number"+sum);
    }

    // 3. Check Palindrome
    static boolean isPalindrome(int num) {
        int oldNum = num;
        int revNum = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            revNum = revNum * 10 + digit;
        }

        if (oldNum == revNum) return true;

        return false;
    }

    // 2. Reverse a Number
    static void reverse(int num) {
        int rev = 0;

        while (num > 0) {
            int digit = num % 10;
            num = num / 10;
            rev = rev * 10 + digit;
        }

        System.out.println("reverse no. is "+rev);
    }

    // 1. Count Digits
    static int countDigit(int num) {
        int count = 0;

        while (num > 0) {
            // 123
            int digit = num % 10; // last digit
            num = num / 10; // reduce the number from last
            count++;
        }

        return count;
    }

    public static void main(String[] args) {
        allDivision(36);
    }
}
