package ARRAYSpart2;

import java.util.ArrayList;

public class SpiralMatrix {
    public static void spiral(int[][] arr) {
        ArrayList<Integer> temp = new ArrayList<>();
        int top = 0, bottom = arr.length - 1, left = 0, right = arr[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                temp.add(arr[top][i]);

            }
            top++;
            for (int i = top; i <= bottom; i++) {
                temp.add(arr[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    temp.add(arr[bottom][i]);

                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    temp.add(arr[i][left]);
                }
                left++;
            }
        }
        for (int i = 0; i < temp.size(); i++) {
           
            System.out.print(temp.get(i) + " ");
        }System.out.println();
    }

    public static void main(String[] args) {
        int[][] arr = { { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 },
                { 11, 12, 13, 14, 15 },
                { 16, 17, 18, 19, 20 },
                { 21, 22, 23, 24, 25 }, };
        spiral(arr);
    }
}
