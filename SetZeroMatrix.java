package ARRAYSpart2;

import java.util.ArrayList;

public class SetZeroMatrix {
    public static void zero(int[][] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<Integer> temp2 = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    temp.add(i);
                    temp2.add(j);
                }
            }
        }
        for (int i = 0; i < temp.size(); i++) {
            int index = temp.get(i);
            for (int j = 0; j < arr[0].length; j++) {
                arr[index][j] = 0;
            }
        }
        for (int i = 0; i < temp2.size(); i++) {
            int index = temp2.get(i);
            for (int j = 0; j < arr.length; j++) {
                arr[j][index] = 0;
            }
        }
    }
    public static void approach2(int[][] arr) {
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] == 0) {
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (row[i] == 1 || col[j] == 1) {
                    row[i] = 0;
                    col[j] = 0;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 0}
        };
        zero(matrix);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }System.out.println(" ");
        }
        System.out.println(" second 1");
        approach2(matrix);
        for (int[] col : matrix) {
            for (int num : col) {
                System.out.print(num + " ");
            }System.out.println(" ");
        }
    }
}
