package Arrayssss;

import java.util.Arrays;

public class Basic {

    // 4. sort the array of 0's and 1's
    static void sort0and1(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] == 0) {
                start++;
            }
            if (arr[end] == 1) {
                end--;
            }
            if (arr[start] == 1 && arr[end] == 0) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
    }

    // 3. Rotate the array by k element
    static void rotateByK(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverseArr(arr, 0, n-k-1);
        reverseArr(arr, n-k, n-1);
        reverseArr(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));

    }

    public static void reverseArr(int[] arr, int startInx, int endInx) {
        while (startInx < endInx) {
            int temp = arr[startInx];
            arr[startInx] = arr[endInx];
            arr[endInx] = temp;
            startInx++;
            endInx--;
        }
    }

    // 2. reverse the array without using extra array
    static void reverseArray(int[] arr) {
        // two pointers
        int n = arr.length;
//        int start = 0, end = n - 1;
//
//        while (start < end) {
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
        // one-pointer

        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }

    // two sum
    static int[] twoSum(int[] arr, int x) {
        int n = arr.length;
//        int res[] = new int[2];

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] + arr[j] == x) {
                    return new int[]{i,j};
                }
            }
        }

        return new int[]{};
    }

    public static void main(String[] args) {
        int[] arr = {1,0,0,1,0,1,0,0,1,0};
        sort0and1(arr);
        System.out.println(Arrays.toString(arr));
    }
}
