package Arrayssss;
import java.util.ArrayList;

public class ArrayList2D {

    // Q2. Count Even Numbers


    // Q1. Sum of Each Row (2D ArrayList)
    static ArrayList<Integer> rowSum(ArrayList<ArrayList<Integer>> matrix) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < matrix.size(); i++) {
            int sum = 0;
            for (int j = 0; j < matrix.get(i).size(); j++) {
                sum += matrix.get(i).get(j);
            }
            result.add(sum);
        }

        return result;
    }

    public static void main(String[] args) {

    }
}
