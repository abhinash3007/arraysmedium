package ARRAYSpart2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class LongestComsecutiveSubsequence {
    public static void longest(int[] arr) {
        int max = 0;
        HashMap<Integer, Boolean> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], false);
        }
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == false) {
                int currentLength = 1;
                int nextNum = arr[i] + 1;
                while (map.containsKey(nextNum) && map.get(nextNum) == false) {
                    currentLength++;
                    map.put(nextNum, true);
                    nextNum++;
                }
                int prev = arr[i] - 1;
                while (map.containsKey(prev) && map.get(prev) == false) {
                    currentLength++;
                    map.put(prev, true);
                    prev--;
                }
                max = Math.max(max, currentLength);
            }
        } System.out.println(max);
    }

    public static void brute(int[] arr) {
        Arrays.sort(arr);
        int count = 1;
        int max = 1;
        for (int i = 1; i < arr.length ; i++) {
            if ( arr[i] == arr[i - 1]+1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        System.out.println(max);
    }

    public static void main(String[] args) {
        int[] arr = { 102, 4, 100, 101, 3, 2, 1 };
        longest(arr);
        brute(arr);
    }
}
