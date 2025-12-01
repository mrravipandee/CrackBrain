package Famous;

import java.util.Arrays;

public class Beginner {

    // date previous
    static void previousDate(int[] currentDate) {
        int dd = currentDate[0];
        int mm = currentDate[1];
        int yy = currentDate[2];

        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check leap year (for February)
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        // Step 1: If dd > 1, just decrement day
        if (dd > 1) {
            dd--;
        } else {
            // Step 2: Go to previous month
            mm--;
            if (mm == 0) {
                mm = 12; // Go to December of previous year
                yy--;
            }
            dd = daysInMonth[mm - 1]; // Set last day of new month
        }

        System.out.println("Previous Date: " + dd + "/" + mm + "/" + yy);
    }

    // date next
    static void nextDate(int[] currentDate) {
        int dd = currentDate[0];
        int mm = currentDate[1];
        int yy = currentDate[2];

        // Days in each month
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Check leap year (for February)
        if ((yy % 4 == 0 && yy % 100 != 0) || (yy % 400 == 0)) {
            daysInMonth[1] = 29;
        }

        // Increase day
        dd++;

        // If day exceeds month max days
        if (dd > daysInMonth[mm - 1]) {
            dd = 1;  // reset day
            mm++;   // go to next month
        }

        // If month exceeds December
        if (mm > 12) {
            mm = 1;
            yy++;
        }

        System.out.println("Next Date: " + dd + "/" + mm + "/" + yy);
    }

    // 3. Date calculate
    static int[] formatDate(int date) {
        String str = String.valueOf(date);

        if (str.length() != 8) {
            System.out.println("Invalid date format");
            return null;
        }

        String day = str.substring(0, 2);
        String month = str.substring(2, 4);
        String year = str.substring(4, 8);

        int d = Integer.parseInt(day);
        int m = Integer.parseInt(month);
        int y = Integer.parseInt(year);

        int[] result = {d, m, y};
        //System.out.println(Arrays.toString(result));
        return result;
    }

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
        int[] date = formatDate(31122025);
        nextDate(date);
        previousDate(date);
    }
}
