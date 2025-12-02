package Hashing;

import java.util.HashMap;
import java.util.HashSet;

public class Basic {

    // count the frequency of number
    public static void countFrequency(int[] arr) {
        // arr = [1, 2, 2, 3, 3, 3]
        //1 → 1 time
        //2 → 2 times
        //3 → 3 times

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

        }
    }

    // two sum
    public static int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];

            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }

            map.put(arr[i], i);
        }
        return new int[]{};
    }

    // 1. contains duplicate if have return true else false
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> hash = new HashSet<>();

        for (int num : nums) {
            if (hash.contains(num)) {
                return true;
            }
            hash.add(num);
        }

        return false;
    }
    public static void main(String[] args) {
        // ref of class
        Basic res = new Basic();
        System.out.println(res.containsDuplicate(new int[]{1,2,3,1}));
    }
}
