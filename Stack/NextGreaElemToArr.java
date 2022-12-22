package Stack;

import java.util.Scanner;
import java.util.Stack;

public class NextGreaElemToArr {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArr = in.nextInt();
        int[] arr = new int[sizeOfArr];
        for(int i=0; i<arr.length; i++){
            arr[i] = in.nextInt();
        }
        int[] nge = NextGreaElemToArr.getNexGreaElemToArr(arr);
        for(int val : nge){
            System.out.println(val);
        }
    }
    public static int[] getNexGreaElemToArr(int[] arr) {
        int[] nge = new int[arr.length];
        Stack<Integer> st = new Stack<>();
        st.push(arr[arr.length-1]);
        nge[arr.length-1] = -1;
        for(int i = arr.length-2; i>=0; i--){
            while(st.size()>0&&arr[i]>=st.peek()){
                st.pop();
            }
                if(st.size()==0){
                    nge[i] = -1;
                }
                else{
                    nge[i] = st.peek();
                }
                st.push(arr[i]);
            }
        return nge;        
    }
}
