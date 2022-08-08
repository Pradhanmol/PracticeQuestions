import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int kTimesRotate = in.nextInt();
        int[] arr =  ArrayInputTaken.arrayInputSet(sizeOfArray);
        rotateArrayFun(arr, kTimesRotate);

    }
    public static void rotateArrayFun(int[] arr, int num) {
        int kTimesRotate = num = num%arr.length;
        if(kTimesRotate<0){
            kTimesRotate+=arr.length;
        }
        System.out.println(ReverseArray.reverseArray(arr, 0, arr.length - kTimesRotate - 1));
        System.out.println(ReverseArray.reverseArray(arr, arr.length-kTimesRotate, arr.length-1));
        System.out.println(ReverseArray.reverseArray(arr, 0, arr.length-1));

}
}
