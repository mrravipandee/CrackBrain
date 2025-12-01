package Hashing;

import java.util.HashSet;

public class Basic {

    //

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
