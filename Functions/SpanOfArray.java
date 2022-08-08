import java.util.Scanner;

public class SpanOfArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int data = 0; data<arr.length; data++){
            arr[data] = in.nextInt();
        }
        System.out.println("Span Of Array : "+SpanOfArray.diffOfArray(arr));        
    }
public static int maxArr(int[] arr){
    int max = arr[0];
    for(int data = 0; data<arr.length; data++){
        if(arr[data]>max){
            max = arr[data];
        }
    }
    return max;
}
public static int minArr(int[] arr){
    int min = arr[0];
    for(int data = 0; data<arr.length; data++){
        if(arr[data]<min){
            min = arr[data];
        }
    }
    return min;
}
public static int diffOfArray(int arr[]){
    int diffOfArray = SpanOfArray.maxArr(arr) - SpanOfArray.minArr(arr);
    return diffOfArray;
}
}
