package SortingTech;

import java.util.Arrays;

public class BubbleSorting {




    // basic one
    static void BubbleSort(int[] arr) {
        int n = arr.length;

        // bubble sort, passes are run n - 1, mean if array worst case is element have on the last so it worst part..
//        for (int i = 0; i < n - 1; i++) {
//            if (arr[i] > arr[i+1]) {
//                int temp = arr[i];
//                arr[i] = arr[i+1];
//                arr[i+1] = temp;
//            }
//        }

        for (int i = 1; i <= n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("After sorted: ");
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = {5,1,3,2,4};
        BubbleSort(arr);
    }
}
