package ARRAYSpart2;

import java.util.Scanner;

public class BuyAndSellStock {
    public static void sell(int[] arr) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] - arr[j] > 0) {
                    System.out.println("Buy on day " + (i + 1) + " and sell on day " + (j + 1) + " for a profit.");
                } else {
                    System.out.println("Buy on day " + (i + 1) + " and sell on day " + (j + 1) + " for a loss.");
                }
            }
        }
    }public static void optimal(int[]arr){
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int i=0;i<arr.length;i++){
            min=Math.min(min, i);
            profit=Math.max(profit, arr[i]-min);
        }System.out.println(profit);
    }
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 3, 6, 4 };
        sell(arr);
        optimal(arr);
    }
}
