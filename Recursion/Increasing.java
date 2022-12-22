package Recursion;

public class Increasing {
    public static void main(String[] args) {
        int a = 2048;
        int sum = 0;
        Increasing.printIncreasing(a, sum);
        System.out.println(sum);
        
    }
    public static void printIncreasing(int n, int sum) {
        int k =0, j =0;
    
        if(n==0){
            return;
        }
        k = n%10;
        j =n/10;
        sum = sum + k;
        printIncreasing(j, sum);
        System.out.println(k);
        
    }
}
