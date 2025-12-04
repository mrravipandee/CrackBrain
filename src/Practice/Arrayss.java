package Practice;

import java.util.Arrays;

public class Arrayss {

    // 4. Remove duplicates from Sorted array
    static void removeDuplicate(int[] nums) {
        if (nums.length == 0) return;

        if(isSorted(nums)) {
            int k = 1; // write value
            for (int i = 1; i < nums.length; i++) { // i only for read
                if (nums[i] != nums[i-1]) {
                    nums[k] = nums[i];
                    k++;
                }
            }
            System.out.println(Arrays.toString(nums));
        } else {
            System.out.println("Its not sorted");
        }


    }

    // 3. Check if the array is sorted
    static boolean isSorted(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < nums[i-1]) {
                return false;
            }
        }

        return true;
    }

    // 2. Second Largest Element in an Array without sorting
    static int secondLargest(int[] nums) {
        int max = Integer.MIN_VALUE;
        int maxSecond = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                maxSecond = max;
                max = nums[i];
            }
            else if (nums[i] > maxSecond && nums[i] != max) {
                maxSecond = nums[i];
            }
        }

        return maxSecond;
    }

    // 1. Largest Element in an Array
    static int largestEle(int[] nums) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
        }
        return max;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,3,4,5};
        removeDuplicate(arr);
    }
}
