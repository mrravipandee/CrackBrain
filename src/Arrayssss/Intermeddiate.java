package Arrayssss;

public class Intermeddiate {

    // print matrix in spiral form
    static void spiralForm(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int minRow = 0, maxRow = m-1;
        int minCol = 0, maxCol = n-1;

        while (minRow <= maxRow && minCol <= maxCol) {
            // left to right
            for (int j = minCol; j <= maxCol; j++) {
                System.out.print(arr[minRow][j]+" ");
            }
            minRow++;

            // top to bottom
            for (int i = minRow; i <= maxRow; i++) {
                System.out.print(arr[i][maxCol]+" ");
            }
            maxCol--;

            // right to left
            if (minRow <= maxRow) {
                for (int j = maxCol; j >= minCol; j--) {
                    System.out.print(arr[maxRow][j] + " ");
                }
                maxRow--;
            }

            // bottom to up
            if (minCol <= maxCol) {
                for (int i = maxRow; i >= minRow; i--) {
                    System.out.print(arr[i][minCol] + " ");
                }
                minCol++;
            }
        }

    }
    
    // wave-form for cols
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
        int[][] arr2 = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12}, {13,14,15,16}};
        spiralForm(arr2);

//        for(int ele: plusOne(arr)) {
//            System.out.println(ele);
//        }
    }

}
