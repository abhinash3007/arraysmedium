package ARRAYSpart2;

import java.util.Arrays;

public class NextPermutataion {
    public static void permutation(int[]arr){
        int index=-1;
        for(int i=arr.length-2;i>0;i--){
            if(arr[i]<arr[i+1]){
                index=i;
                break;
            }
        }if(index==-1){
            for(int i=0;i<arr.length/2;i++){
                int temp=arr[i];
                arr[i]=arr[arr.length-1-i];
                arr[arr.length-1-i]=temp;
            }
        }else{
            for(int i=arr.length-1;i>index;i--){
                if(arr[i]>arr[index]){
                    int temp=arr[i];
                    arr[i]=arr[index];
                    arr[index]=temp;
                    break;
                }
            }int start=index+1,end=arr.length-1;
            while (start < end) {
                int tempSwap = arr[start];
                arr[start] = arr[end];
                arr[end] = tempSwap;
                start++;
                end--;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 1, 5, 4, 3, 0, 0 };
        permutation(arr);
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }
}
