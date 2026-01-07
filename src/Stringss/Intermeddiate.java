package Stringss;

import java.util.HashMap;
import java.util.Map;

public class Intermeddiate {

    // 79. Word Search
    public static void exist(char[][] board, String word) {
        char[] words = word.toCharArray();
        int k = 0;

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == words[k]) {
                    k++;
                }
            }
        }

        if (k == words.length - 1) {
            System.out.println(k);
        }

        System.out.println(k+" Out side"+word.length());
    }

    // 1. Roman to int
    static void romanToInt(String s) {

        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int total = 0;

        for(int i = 0; i < s.length() - 1; i++) {
            int curr = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));

            // if currrent value is smaller then next, substact it
            if (curr < next) {
                total -= curr;
            }

            else {
                total += curr;
            }

            total += map.get(s.charAt(s.length() - 1));

            System.out.println(total);
        }

    }

    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        exist(board, word);
    }
}
