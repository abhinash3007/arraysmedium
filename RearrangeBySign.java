package ARRAYSpart2;

import java.util.ArrayList;
import java.util.Arrays;

public class RearrangeBySign {
    public static void rearrange(int[]arr){
        ArrayList<Integer>temp=new ArrayList<>();
        ArrayList<Integer>temp2=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0){
                temp.add(arr[i]);
            }else{
                temp2.add(arr[i]);
            }
        }
        //System.out.println(temp);
        for(int i=0;i<arr.length/2;i++){
            arr[2*i]=temp.get(i);
            arr[2*i+1]=temp2.get(i);
        }System.out.println(arr);
    }
    public static void optimal(int[]arr){
        int pos=0;
        int neg=1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                arr[pos]=arr[i];
                pos+=2;
            }else{
                arr[neg]=arr[i];
                neg+=2;
            }
        }System.out.println(arr+" ");
    }
    public static void main(String[] args) {
        int[]arr={3,-1,-2,-5,2,-4,6};
        rearrange(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
        optimal(arr);
        for(int num:arr){
            System.out.print(num+" ");
        }
    }
}
