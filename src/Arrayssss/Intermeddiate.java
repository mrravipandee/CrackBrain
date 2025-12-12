package Arrayssss;

public class Intermeddiate {

    // q. plus one [66. leetcode]
        static int[] plusOne(int[] digits) {

            // Start from last digit
            for (int i = digits.length - 1; i >= 0; i--) {

                // If digit is less than 9, simply increment and return
                if (digits[i] < 9) {
                    digits[i]++;
                    return digits;
                }

                // If digit is 9, it becomes 0 and we carry 1 to next left digit
                digits[i] = 0;
            }

            // If we reach here, all digits were 9 (example: 999 → 1000)
            int[] result = new int[digits.length + 1];
            result[0] = 1;  // first digit becomes 1, rest are 0 by default

            return result;
        }


    public static void main(String[] args) {
        int[] arr = {1,9,9,9};

        for(int ele: plusOne(arr)) {
            System.out.println(ele);
        }
    }

}
