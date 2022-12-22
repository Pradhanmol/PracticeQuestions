package Stack;

import java.util.Stack;
import java.util.logging.Logger;

public class IntroStack {
    public static void main(String[] args) {
        //stack declaration in java
        Stack<Integer> st = new Stack<>();
        //push using for add the item in stack 
        st.push(10);
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.push(20);
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.push(30);
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.push(40);
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        //How to get index no. of any stack?
        //System.out.println("Find 20 on which index : "+ st.search(st, 20));
        // pop is using for removing the top item 
        st.pop();
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + "-->"+st.peek()+" "+st.size());
        st.pop();
        System.out.println(st + "-->"+st.size());

    }
}
