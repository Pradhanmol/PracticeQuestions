import java.util.Scanner;

public class IntroToFun{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int r = in.nextInt();
        int npr = fact(num)/fact(num-r);
        System.out.println(npr);
    }
    public static int fact(int num){
        int fact =1;
        for(int i=1;i<=num;i++){
            fact*=i;
        }
        return fact;
    }
}