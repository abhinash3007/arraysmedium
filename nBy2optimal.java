package ARRAYSpart2;

public class nBy2optimal {
    public static void optimal(int[] arr) {
        int element = 0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (count == 0) {
                count = 1;
                element = arr[i];
            } else if (arr[i] == element) {
                count++;
            } else {
                count--;
            }
        }
        int count1 = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == element) {
                count1++;
            }
        }
        if (count1 > arr.length / 2) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 2, 2, 1, 1, 2, 2, 3 };
        optimal(arr);
    }
}
