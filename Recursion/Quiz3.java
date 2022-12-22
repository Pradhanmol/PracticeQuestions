package Recursion;

public class Quiz3 {
    public static void main(String[] args) 
    {
        int p = 5;
       int value =  Quiz3.fun(p,5);
    }

    private static int fun(int &x, int c) 
    {
        c = c -1;
        if(c==0){
            return 1;
        }
        x = x+1;
        return fun(x, i)*x;
    }
}
