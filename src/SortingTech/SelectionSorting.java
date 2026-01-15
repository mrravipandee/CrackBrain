package SortingTech;

import java.util.Arrays;

public class SelectionSorting {


    // 1. sort array
    static void basic(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            // find min element from the pass
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            // swap min value to index 0 of the pass's
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = arr[i];
        }

        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, -7, 9, 11, -2, 12, -9};

        basic(arr);
    }
}
