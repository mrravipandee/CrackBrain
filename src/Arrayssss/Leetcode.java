package Arrayssss;

public class Leetcode {

    // 2. Richest Customer Wealth
    // You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
    static int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int n = accounts[0].length;
        int max = 0;

        for (int i = 0; i < m; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += accounts[i][j];
            }
            // System.out.println("Row " + i + " sum: " + rowSum);
            max = Math.max(max, rowSum);
        }

        return max;
    }

    public static void main(String[] args) {
        int[][] arr2d = {{1,2,3}, {4,5,0}, {0,2,1}, {2,3,1}};
        int ans = maximumWealth(arr2d);
        System.out.println(ans);
    }
}
