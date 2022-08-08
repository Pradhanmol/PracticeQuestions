import java.util.Scanner;

public class AnyBaseToDecimal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int multiplier = in.nextInt();
        int conversionValue = getBaseConvInAny(num, multiplier);
        System.out.println(conversionValue);
    }
    public static int getBaseConvInAny(int num, int multiplier) {
        int base =10;
        int count = 0;
        int res = 0;
        while(num>0){
            int temp = num%base;
            num = num/base;
            temp = (int) (temp*Math.pow(multiplier, count));
            res+=temp;
            count++;
        }
        return res;       
}
}
