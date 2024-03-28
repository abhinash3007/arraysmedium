package ARRAYSpart2;

import java.util.ArrayList;

public class Rearrange2 {
    public static void rearrange2(int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        ArrayList<Integer>temp2=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                temp.add(arr[i]);
            }else{
                temp2.add(arr[i]);
            }
        }int pos=0;
        int neg=0;
        for(int i=0;i<arr.length;i++){
            if(i%2==0 && pos<temp.size()){
                arr[i]=temp.get(pos++);
            }else if(neg<temp2.size()){
                arr[i]=temp2.get(neg++);
            }
        }
    }public static void optimal(int[]arr){
        int pos=0;int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[pos]=arr[i];
                pos+=2;
            }else{
                arr[neg]=arr[i];
                neg+=2;
            }
        }while (pos < arr.length && neg * 2 < arr.length) {
            arr[neg * 2] = arr[pos];
            pos++;
        }
        while (neg < arr.length && pos * 2 < arr.length) {
            arr[pos * 2] = arr[neg];
            neg++;
        }
        //System.out.println(arr);
    }
    public static void main(String[] args) {
        int[] arr = {3, -1, -2, -5, 2, -4, 6, 7, -8, 9,-1,-5,-9};
        rearrange2(arr);
        for(int num:arr){
            System.out.print(num);
        }System.out.println(" ");
        optimal(arr);
        for(int num1:arr){
            System.out.println(num1);
        }
    }
}

