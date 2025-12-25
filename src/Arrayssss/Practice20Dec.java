package Arrayssss;

import java.util.Arrays;

public class Practice20Dec {

    // 10. Print Boundary elements
    static void boundaryEle(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (i == 0 || i == row-1 || j == 0 || j == col-1) {
                    System.out.print(arr[i][j]+" ");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    // 9. Diagonal sum
    static void diagonalSum(int[][] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            // Nested loop ki zarurat nahi 👇
            // for (int j = 0; j < arr[0].length; j++) {
                //if (i == j) {
                    sum+= arr[i][i];
                //}
            //}
        }

        System.out.println("Even number count is: "+sum);
    }

    // 8. Count even num in matrix
    static void countEven(int[][] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    count++;
                }
            }
        }

        System.out.println("Even number count is: "+count);
    }

    // 7. Row ka sum
    static void sumRow(int[][] arr) {
        int[] rowsum = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                rowsum[i] += arr[i][j];
            }
        }

        System.out.println(Arrays.toString(rowsum));
    }

    // 6. Matrix ko column-wise print karo
    static void columnWise(int[][] arr) {

        for (int i = 0; i < arr[0].length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[j][i]);
            }
            System.out.println();
        }
    }

    // 5. Reverse the Array
    static void reverseArr(int[] arr) {
        // 2 pointer
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // swap
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }

        System.out.println(Arrays.toString(arr));
    }

    // 4. Second Largest Element
    static void secondLargest(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            // Update second largest if the current element is greater
            // than second largest and not equal to the largest
            if (arr[i] > secMax && arr[i] != max) {
                secMax = arr[i];
            }
        }

        System.out.println(secMax);
    }

    // 3. Count odd num
    static void countOdd(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                count++;
            }
        }

        System.out.print("Odd numbers on array are: "+count);
    }

    // 2. Find maximum element
    static void maxElem(int[] arr) {
        if (arr.length == 0) return;

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Max element is: "+max);
    }

    // 1. Even num ka sum
    static void sumEven(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.print("Answer is: "+sum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[][] arr2d = {{1,2,3}, {4,5,6}, {7,8,9}};
        boundaryEle(arr2d);
    }
}
