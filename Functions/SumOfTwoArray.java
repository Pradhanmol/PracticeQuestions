import java.util.Scanner;
//solve Again
public class SumOfTwoArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray1 = in.nextInt();
        int[] arr1 = new int[sizeOfArray1];
        for(int i=0; i<arr1.length; i++){
            arr1[i]= in.nextInt();
        }
        int sizeOfArray2 = in.nextInt();
        int[] arr2 = new int[sizeOfArray2];
        for(int j=0; j<arr2.length; j++){
            arr2[j]= in.nextInt();
        }
        int[] SumOfTwoArray = new int[sizeOfArray1 > sizeOfArray2? sizeOfArray1: sizeOfArray2];
        int carry = 0;
        int i = sizeOfArray1 -1;
        int j = sizeOfArray2 -1;
        int k = SumOfTwoArray.length-1;
        while(k>=0){
            int d = carry;
            if(i>=0){
                d+=arr1[i];
            }
            if(j>=0){
                d=d+arr2[j];
            }
            carry=d/10;
            d%=10;
            SumOfTwoArray[k] = d;
            i--;
            j--;
            k--;
        }
            if(carry!=0){
                System.out.println(carry);
            }
            for(int val:SumOfTwoArray){
                System.out.println(val);
            }
        }
}
