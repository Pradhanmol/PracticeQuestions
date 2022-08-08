import java.util.Scanner;

public class AnyBaseToAnyBaseMul{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        System.out.println(getAnyBaseToAnyBaseMul(num1, num2, base));
    }
    public static int getAnyBaseToAnyBaseMul( int num1, int num2, int base){
        int res = 0;
        while(num2>0){
            int temp1 = num1%10;
            int temp2 = num2%10;
            num1/=10;
            num2/=10;
            int mulTemp1ToTemp2 = temp1*temp2
        }
        return ;
    }
}