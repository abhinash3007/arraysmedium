package ARRAYSpart2;

public class GreaterBYNdiv2 {
    public static void greater(int[]arr){
        int max=0;
        for(int i=0;i<arr.length-1;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                }
            }if(arr.length/2<count){
                System.out.println(arr[i]);
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[]arr={2,2,3,3,1,2,2};
        greater(arr);
    }
}
