package Arrayssss;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays2D {

    static void rotate90deg(int[][] arr) {

        int m = arr.length, n = arr[0].length;

        print2D(arr);

        // transpose matrix first then reverse the rows
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }

        print2D(arr);

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                reverse(arr);
            }
        }

        print2D(arr);

    }

    // 6. transpose 3by3 matrix on the same array
    static void transpose3by3(int[][] arr) {

        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                swap(arr, i, j);
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void print2D(int[][] arr) {
        int m = arr.length, n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }

    static void swap(int[][] arr, int i, int j) {
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }

    static void reverse(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int l = 0, r = m - 1;

                while (l < r) {
                    int temp = arr[i][l];
                    arr[i][l] = arr[i][r];
                    arr[i][r] = temp;
                    l++;
                    r--;
                }
            }
        }
    }

    // 5. transpose of array
    static void transpose(int[][] arr1) {

        // leng of cols and rows
        int n = arr1.length, m = arr1[0].length;
        // new array to store transpose
        int[][] arrTrans = new int[m][n];

        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                // System.out.print(arr1[i][j]+" ");
                arrTrans[j][i] = arr1[i][j];
            }
            // System.out.println();
        }

        for (int[] oneD: arrTrans) {
            for (int ele: oneD) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

    // 4. add 2 matrix
    static void additionMatrix(int[][] mat1, int[][] mat2) {
        int[][] res = new int[mat1.length][mat2[0].length];

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat2[0].length; j++) {
                res[i][j] = mat1[i][j] + mat2[i][j];
            }
        }

        // print res matrix
        for(int[] oneD: res) {
            for(int ele: oneD) {
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }

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
        int[][] arr2d = {{1,2,7},{3,4,8},{5,6,9}};
        int[][] arr2d2 = {{1,12},{3,4},{5,6}};
        rotate90deg(arr2d);
    }
}
