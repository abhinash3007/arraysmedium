package ARRAYSpart2;

public class Rotate90Deg {
    public static void rotate(int[][]arr){
        int[][]swapped=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                swapped[j][arr.length-1-i]=arr[i][j];
            }
        }for (int i = 0; i < swapped.length; i++) {
            for (int j = 0; j < swapped[0].length; j++) {
                System.out.print(swapped[i][j] + " ");
            }
            System.out.println();
        }
    }public static void optimal(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<arr[0].length;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }int start=0;int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length/2;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[i][end];
                arr[i][end]=temp;
            }
        }   
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 0, 6},
            {7, 8, 0}
        };
        rotate(matrix);
        optimal(matrix);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }System.out.println(" ");
        }
    }
}
