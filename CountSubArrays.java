package ARRAYSpart2;

import java.util.HashMap;

public class CountSubArrays {
    public static void sub(int[] arr, int k) {
        int c = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if (sum == k) {
                    c++;
                    System.out.println(i + " " + j);
                }
            }
        }
        System.out.println(c);
    }public static void countSub(int[]arr,int k){
        int count=0;
        int max=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        int prefix=0;
        for (int i = 0; i < arr.length; i++) {
            prefix+=arr[i];
            if(prefix==k){
                max=Math.max(max, i+1);
            }
            if(map.containsKey(prefix-k)){
                count+=map.get(prefix-k);
                int len=i-map.get(prefix-k);
                max=Math.max(max, len);
            }map.put(prefix, map.getOrDefault(prefix, 0)+1);
        }System.out.println(count);
        System.out.println(max);
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, -3, 1, 1, 1, 4, 2, -3 };
        sub(arr, 3);
        countSub(arr, 3);
    }
}
