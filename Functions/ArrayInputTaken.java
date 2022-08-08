import java.util.Scanner;

public class ArrayInputTaken {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
    }
    public static int[] arrayInputSet(int num) {
        int[] arr = new int[num];
        Scanner in = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
