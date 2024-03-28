package ARRAYSpart2;

public class Leaders {
    public static void leaders(int[]arr){
        for(int i=0;i<arr.length;i=i+2){
            if(arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }else{
                System.out.print(arr[i+1]+" ");
            }
        }
    }public static void approach(int[]arr){
        int max=Integer.MIN_VALUE;
        for(int i=arr.length-1;i>0;i--){
            if(arr[i]>max){
                max=arr[i];
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={10,22,12,3,0,6};
        leaders(arr);
        approach(arr);
    }
}
