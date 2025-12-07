package Arrayssss;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {

    // 4. index 210

    // 3. some of all elements
    static void sumElements(int[][] arr2d) {
        int sum = 0;

        for (int i = 0; i < arr2d.length; i++) {
            for (int j = 0; j < arr2d[0].length; j++) {
                sum += arr2d[i][j];
            }
        }

        System.out.println("Ans is: "+sum);
    }

    // 2. Program to find the largest element in a 2D array
    static void largestElement2d(int[][] arr2d) {
        int max = Integer.MIN_VALUE;

        for(int[] oneD: arr2d) {
            for(int ele: oneD) {
//                if (ele > max) {
//                    max = ele;
//                }
                max = Math.max(max, ele);
            }
        }

        System.out.println(max);
    }

    // 1. wap to store roll no and marks obtained by students in 2d array
    static void students() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // clear buffer

        String[] names = new String[n];
        int[][] data = new int[n][2];   // [roll, marks]

        // Taking input from user
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details of student " + (i + 1));

            System.out.print("Enter Name: ");
            names[i] = sc.nextLine();

            System.out.print("Enter Roll Number: ");
            data[i][0] = sc.nextInt();

            System.out.print("Enter Marks: ");
            data[i][1] = sc.nextInt();

            sc.nextLine(); // clear buffer
        }

        // Printing output
        System.out.println("\nName\tRoll\tMarks");
        System.out.println("-------------------------");
        for (int i = 0; i < n; i++) {
            System.out.println(names[i] + "\t" + data[i][0] + "\t" + data[i][1]);
        }
    }

    // Declaration and syntax
    static void arrays2d() {
        Scanner sc = new Scanner(System.in);
        int[][] grid = new int[3][3];


        System.out.println("Enter elements: ");
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[1].length; j++) {
                System.out.print("Elements ["+i+","+j+"]: ");
                grid[i][j] = sc.nextInt();
            }
        }

        for (int[] oneD : grid) {
            for (int elements: oneD) {
                System.out.print(elements+" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr2d = {{1,12},{3,4},{5,6}};
        sumElements(arr2d);
    }
}
