import java.util.Scanner;

public class FindElementInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int data=0; data<arr.length; data++){
            arr[data] = in.nextInt();
        }
        int element = in.nextInt();
        System.out.println(FindElementInArray.findIndexOfArray(arr, element));

    }
    public static int findIndexOfArray(int arr[],int element) {
        int index =-1;
        for(int data = 0; data<arr.length; data++){
            if(arr[data]==element){
                index = data;
                break;   
            }
        }
        return index;

    }
}
