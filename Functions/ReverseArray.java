import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = ArrayInputTaken.arrayInputSet(sizeOfArray); // call the array input function from arrayInputTaken Class
        reverseArray(arr);
        for(int val:arr){
            System.out.println(val+" ");
        }
    }
    public static void reverseArray(int[] arr) {
        int i = 0;
        int j = arr.length-1;
        while(i<j){
            int temp;
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }
        public static int[] reverseArray(int[] arr, int li, int ri) {
            while(li<ri){
                int temp;
                temp = arr[li];
                arr[li] = arr[ri];
                arr[ri] = temp;
                li++;
                ri--;
            }
            return arr;
    }
}

