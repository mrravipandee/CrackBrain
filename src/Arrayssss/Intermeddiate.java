package Arrayssss;

public class Intermeddiate {
    
    // ware-form for cols
    static void wareFormCols(int[][] arrs) {
        int m = arrs.length, n = arrs[0].length;
        int k = n- 1;
        for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (j % 2 == 0) {
                        System.out.print(arrs[j][i]+" ");
                    } else {
                        System.out.print(arrs[j][k]+" ");
                        k--;
                    }
                }

            System.out.println();
        }
    }

    // wave-form for rows reverse
    static void wareFormRowsRev(int[][] arrs) {
        int m = arrs.length, n = arrs[0].length;

        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arrs[i][j]+" ");
                }
            } else {
                for (int j = 0; j < n; j++) {
                    System.out.print(arrs[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    // wave-form
    static void wareformRows(int[][] arrs) {
        int m = arrs.length, n = arrs[0].length;

        // print hole matrix, on it odd no index i change it mean reverse the row
        for (int i = 0; i < m; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arrs[i][j]+" ");
                }
            } else {
                for (int j = n - 1; j >= 0; j--) {
                    System.out.print(arrs[i][j]+" ");
                }
            }
            System.out.println();
        }
    }

    static void reverse(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int l = 0, r = m - 1;

                while (l < r) {
                    int temp = arr[i][l];
                    arr[i][l] = arr[i][r];
                    arr[i][r] = temp;
                    l++;
                    r--;
                }
            }
        }
    }

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
        int[][] arr2d = {{1,2,3}, {4,5,6}, {7,8,9}};
        wareFormCols(arr2d);

//        for(int ele: plusOne(arr)) {
//            System.out.println(ele);
//        }
    }

}
