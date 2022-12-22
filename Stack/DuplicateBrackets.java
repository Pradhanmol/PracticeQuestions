package Stack;

import java.util.Scanner;
import java.util.Stack;

public class DuplicateBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        //stack declaration
        Stack<Character> st = new Stack<>();
        //traversing the str on single char 
        for(int i = 0; i<str.length(); i++){
            // traversing char one by one 
            char ch = str.charAt(i);
            //checking the ch is opening bracket 
            if(ch == ')'){
                //if top of the stack char is opening bracket
                if(st.peek() == '('){
                    //then print the true return from here 
                    System.out.println("true");
                    return;
                }else{
                    //if top of the stack is not opening bracket then check again top of the stack is not opening bracket then pop the item till you get the opening bracket 
                    while(st.peek()!='('){
                        st.pop();
                    }
                    // this for poping the last one ?
                    st.pop();
                }

            }else{
                // if first charcter is not closing bracket then till push that item in stack
                st.push(ch);
            }
            
        }
        System.out.println("false");
    }
}
