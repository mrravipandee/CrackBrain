package Arrayssss;

import java.util.Arrays;

public class Basic {


    // 34. Find First and Last Position of Element in Sorted Array
    static int[] searchRange(int[] nums, int target) {
        int n = nums.length;
        int[] ans = {-1,-1};

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                // first occurrer
                if (ans[0] == -1) {
                    ans[0] = i;
                }
                ans[1] = i; // last occurres
            }
        }

        return ans;
    }

    // 268. missing number from array
    static int missingNumber(int[] nums) {

        // find total sum then sum of number then subtract it return which one is missing
        int n = nums.length;
        int total = n * (n + 1) / 2;

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
        }

        return total - sum;

        // time is O(n)
    }

    // 8. Next greatest element
    static  void greatestElement(int[] nums) {
        int[] ans = new int [nums.length];
        int n = nums.length;


        int k = 0;
        ans[nums.length - 1] = -1;

        // Method 1: brute force approach
//        for (int i = 0; i < nums.length - 1; i++) {
//            int max = Integer.MIN_VALUE;
//
//            for (int j = i+1; j < nums.length; j++) {
//                max = Math.max(max, nums[j]);
//            }
//            ans[i] = max;
//        }

        // Method 2: Optimised
        int nge = nums[n-1];
        for (int i = n-2; i >= 0; i--) {
            ans[i] = nge;
            nge = Math.max(nge, nums[i]);
        }

        System.out.println(Arrays.toString(ans));
    }

    // 7. merge two sorted array in single array
    static void mergeSort3pointer() {
        int[] a = {1,3,4,7}, b = {2,5,6,8};
        int n = a.length + b.length;
        int[] c = new int[n];

        // pointers
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }

        // remaining copy from a
        while (i < a.length) {
            c[k++] = a[i++];
        }
        // remaining copy from b
        while (j < b.length) {
            c[k++] = b[j++];
        }

        System.out.println(Arrays.toString(c));

        // copy all element from a array
//        while (i < a.length) {
//            c[k] = a[i];
//            i++;
//            k++;
//        }

        // copy all element from b array
//        while (j < b.length) {
//            c[k] = b[j];
//            j++;
//            k++;
//        }

    }

    // 6. sort colors using 3 pointers (dutch flag algo)
    static void sortColorDutch(int[] nums) {
        int n = nums.length;
        int low = 0, mid = 0, hi = n - 1;

        while (mid <= hi) {
            if (nums[mid] == 0) {
                swapArr(nums, low, mid);
                low++;
                mid++;
            }
            else if (nums[mid] == 1) mid++;
            else {
                // if nums[mid] value is 2
                swapArr(nums, mid, hi);
                hi--;
            }
        }

        System.out.println("Sorted Array: "+Arrays.toString(nums));
    }

    public static void swapArr(int[] arr, int from, int to) {
        int temp = arr[from];
        arr[from] = arr[to];
        arr[to] = temp;
    }

    // 5. sort colors
    static void sortColor(int[] nums) {
        int n = nums.length;

        int zero = 0, one = 0, two = 0;

        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) zero++;
            else if (nums[i] == 1) one++;
            else two++;
        }
        int index  = 0; // track index;

        while (zero-- > 0) {
            nums[index++] = 0;
        }
        while (one-- > 0) {
            nums[index++] = 1;
        }
        while (two-- > 0) {
            nums[index++] = 2;
        }
    }

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

    // 1. two sum
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
        int[] arr = {0,1,2,0,1,2,1,2,0,0};
        int[] arr2 = {12, 8, 41, 37, 2, 49, 16, 28, 21};
        int[] nums = {1,2,5,3,5};

        for(int ele: searchRange(nums, 5)) {
            System.out.println(ele);
        }
    }
}
