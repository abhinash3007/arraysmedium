package ARRAYSpart2;

public class KadeansAlgorithm {
    public static void kadeans(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                max = Math.max(max, sum);
            } // max=Math.max(max, sum);
        }
        System.out.println(max);
    }

    public static void optimal(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int start=0,end=0;
        for (int i = 0; i < arr.length; i++) {
            if(sum==0){
                start=i;
            }
            sum += arr[i];
            max = Math.max(max, sum);

                start=start;
                end=i;
            //}
            if(sum<0){
                sum=0;
            }
            max = Math.max(max, sum);
        }
        System.out.println(max);
        System.out.print(start+" "+end);
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        kadeans(arr);
        optimal(arr);
    }
}
