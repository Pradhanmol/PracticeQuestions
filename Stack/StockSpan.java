package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StockSpan {
    public static void main(String[] args) throws NumberFormatException, IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        System.out.println("Enter the size of arr : ");
        int sizeOfArr = Integer.parseInt(br.readLine());
        System.out.println("Setting the size of arr");
        int[] arr = new int[sizeOfArr];
        System.out.println(arr.length);
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        int[] span = getStockSpan(arr); 
        for(int val : span){
            System.out.print(val);
            System.out.print("");
        }
        
    }

    private static int[] getStockSpan(int[] arr) {
        int[] span = new int[arr.length];
        Stack<Integer> st = new Stack<>();    
        st.push(0);
        span[0] = 1;
        for(int i=0; i<arr.length; i++){
            while(st.size()>0&&arr[i]>=88arr[st.peek()]){
                st.pop();
            }
            if(st.size()==0){
                span[i] = i+1;
            }else{
                span[i] = i-st.peek();
            }
            st.push(i);
        }
        return span;
        
    }
}
