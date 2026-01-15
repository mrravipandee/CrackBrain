package TwoPointer;

import java.util.Arrays;

public class Easy {

    // Reverse String


    // Zero moves
    static void zeroMoves(int[] arr) {
        int insertPosition = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[insertPosition] = arr[i];
                insertPosition++;
            }
        }

        while (insertPosition < arr.length) {
            arr[insertPosition] = 0;
            insertPosition++;
        }

        System.out.println(Arrays.toString(arr));
    }


    // Remove Duplicates from Sorted Array and return length of it
    static void removeDuplicate(int[] arr) {
        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            // compare the values
            if(arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];

            }
        }

        System.out.println(j+1);
    }

    // rotate the array
    static void rotateArray(int[] nums, int k) {

        int left = k;
        int right = nums.length - 1;


        for (int i = k; i < nums.length; i++) {
            while (left <= right) {
                // swap the number
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(nums));

    }

    // Reverse the array
    static void reverseArray(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        for (int i = 1; i < nums.length -1; i++) {
            while (left <= right) {
                // swap the number
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
        }

        System.out.println(Arrays.toString(nums));

    }


    public static void main(String[] args) {
        int[] nums = {1,0,2,3,5,0,10};
        zeroMoves(nums);
    }
}
