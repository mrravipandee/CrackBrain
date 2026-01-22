package SlidingWindow;

public class Easy {

    // Number of Sub-arrays of Size K and Average Greater than or Equal to Threshold
    static int numOfSubarrays(int[] arr, int k, int threshold) {

        int n = arr.length;
        int maxSum = 0;
        int windowSum = 0;
        int thresResult = 0;

        // first window sum
        for (int i = 0; i < k; i++) {
            windowSum += arr[i];
        }

        // System.out.println(windowSum);

        maxSum = windowSum;

        // sliding window
        for (int j = k; j < n; j++) {
            windowSum = windowSum + arr[j] - arr[j - k];

            System.out.println(windowSum);

            if (windowSum >= k * threshold) {
                thresResult++;
            }
        }

        return thresResult;
    }

    public static void main(String[] args) {
        int[] nums = {11,13,17,23,29,31,7,5,2,3};
        int k = 3;
        System.out.println(numOfSubarrays(nums, k, 5));
    }
}
