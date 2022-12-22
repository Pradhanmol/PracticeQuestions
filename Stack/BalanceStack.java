package Stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.Stack;

public class BalanceStack {

    public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);
        String str = br.readLine();
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch== '(' ||ch=='{'||ch=='[' ){
                st.push(ch);
            }else if(ch == ')') {
                boolean val = handleClosing(st,')');
                if(val==false){
                    System.out.println(val);
                    return;
                }                
            }else if(ch == '}') {
                boolean val = handleClosing(st,'}');
                if(val==false){
                    System.out.println(val);
                    return;
                }                
            }else if(ch == ']') {
                boolean val = handleClosing(st,']');
                if(val==false){
                    System.out.println(val);
                    return;
                }                
            }else {if (st.size() == 0)
                
                {
                  System.out.println(true);
                  return;
                }
                else
                {
                  System.out.println(false);
                  return;
                }
                
            }
        }
        System.out.println(true);
    }

    private static boolean handleClosing(Stack<Character> st, char c) {
        if(st.size()==0){
            return false;
        }else if(st.peek()==c){
            return false;
        }else{
            st.pop();
            return true ;
        }
    }
}
