package Arrayssss;

import java.util.Arrays;

public class Begineer {

    // 2️⃣0️⃣ Find the first repeating element

    // 1️⃣9️⃣ Check if array is a palindrome


    // 1️⃣8️⃣ Find the difference between the max and min elements
    static int findMaxMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
            max = Math.max(max, nums[i]);
        }

        return max - min;
    }

    // 1️⃣7️⃣ Move all zeros to the end (order doesn’t matter)
    static void zeroMove(int[] nums) {
        int zero = 0;
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            if (nums[left] == 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            } else if (nums[right] != 0) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            left++;
            right--;
        }

        System.out.println(Arrays.toString(nums));
    }

    // 1️⃣6️⃣ Find the smallest element greater than a given number
    static int findGreater(int[] nums, int x) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > x) {
                return nums[i];
            }
        }

        return -1;
    }

    // 1️⃣5️⃣ Replace all negative numbers with 0
    static void replaceZero(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < 0) {
                nums[i] = 0;
            }
        }

        System.out.println(Arrays.toString(nums));
    }

    // 1️⃣4️⃣ Find the sum of elements at even indexes
    static int evenIndexSum(int nums[]) {
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                sum += nums[i];
            }
        }

        return sum;
    }

    // 1️⃣3️⃣ Check if array is sorted (ascending)
    static boolean isSorted(int[] nums) {

        for (int i = 0; i < nums.length - 1; i++) {
            // check previous number greater than next num
            if (nums[i] > nums[i+1]) {
                return false;
            }
        }

        return true;
    }

    // 1️⃣2️⃣ Reverse the array (no extra array)
    static void reverseArray(int[] nums) {

        int left = 0, right = nums.length - 1;

        while (left < right) {
            // swap the elements
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            right--;
            left++;
        }

        System.out.println(Arrays.toString(nums));
    }

    // 1️⃣1️⃣ Find the largest and the second largest element
    static int secondLargest(int[] nums) {

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > largest) { // find largest element
                secondLargest = largest;
                largest = nums[i];
            } else if (nums[i] < largest && nums[i] > secondLargest) {
                secondLargest = nums[i];
            }
        }

        return secondLargest;
    }

    // 🔟 Count how many times a number appears
    static int numAppears(int[] nums, int target) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) count++;
        }

        return count;
    }

    // 9️⃣ Find index of a given element
    static int findIndex(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return i;
        }

        return -1;
    }

    // 8️⃣ Check if a given number exists in the array
    static boolean isPresent(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == target) return true;
        }

        return false;
    }

    // 7️⃣ Find minimum element in array
    static int findMin(int[] nums) {
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return min;
    }

    // 6️⃣ Find maximum element in array
    static int findMax(int[] nums) {
        int max = nums[0];

        for (int i = 0; i < nums.length; i++) {
            // check each element if bigges to the max, then assign it to the max
            if (nums[i] > max) {
                max = nums[i];
            }
        }

        return max;
    }

    // 5️⃣ Count even numbers in the array
    static int countEven(int[] arr) {
        int even = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even++;
            }
        }

        return even;
    }

    // 4️⃣ Count total number of elements
    static int countArrElement(int[] arr) {
        return arr.length;
    }

    // 3️⃣ Find the sum of all elements
    static int arrSum(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        return sum;
    }

    // 2️⃣ Print array elements in reverse order
    static void reverseArr(int[] arr) {
        int n = arr.length;

        for (int i = n-1; i >= 0 ; i--) {
            System.out.print(i+" ");
        }
    }

    // 1️⃣ Print all elements of an array
    static void printArray(int[] arr) {

        // using for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i);
        }

        // for each loop
        for (int ele: arr) {
            System.out.println(ele);
        }

        //inbuilt function
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr1d = {10, 3, 7, 20};
        int[] arr1dNeg = {1,-2,3,-9,8,-5};

        System.out.println(findMaxMin(arr1d));;


    }
}
