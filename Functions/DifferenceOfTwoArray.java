import java.util.Scanner;

public class DifferenceOfTwoArray {
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
        int[] diffOfTwoArray = new int[sizeOfArray2];
        int carry = 0; // for taking borrow
        int i = arr1.length-1; //for decreasing the length of i till >=0;
        int j = arr2.length-1; //for decreasing the length of j till >=0;
        int k = diffOfTwoArray.length -1; //for decreasing the length of k till >=0;
        while(k>=0){
            int a1v = i>=0?arr1[i]:0;
            int digit = 0; // digit variable is intialize with zero & storing the final result also;
            if(arr2[j]+carry>=a1v){ // for checking the value at arr2>arr1 or not
                digit = arr2[j]+carry-a1v; // if it is greater than we will minus the value from arr2(val)-arr1(val)
                carry = 0; //& again the carrya value is zero for that condition
            }else{
                digit = arr2[j]+carry+10-arr1[i]; //if it is not greater than we add the carry & 10 with arr2(val) than we will minus the value of arr1(val)
                carry = -1; // & taking carry as -1 because the ten is come from that place value i.e give borroe to this no.
            }
            diffOfTwoArray[k] = digit;
            i--;
            j--;
            k--;
        }
        int idx = 0; //intialize new variable idx for skipping the value if zero is in starting;
        while(idx<diffOfTwoArray.length){ // here we check the idx value < the length of resultant array;
            if(diffOfTwoArray[idx]==0){ //then check if any index the value of rexultant array is zero then increase the index re check the condition
                idx++;
            }else{
                break;// if the value of resultanat at any idx is non zero then break & fall two next statement in this we skip the zero value if got in resultant array
            }
        }
        while(idx<diffOfTwoArray.length){
            System.out.println(diffOfTwoArray[idx]); // here we print the non zero value of resultant 
            idx++;
        }

    }
}
