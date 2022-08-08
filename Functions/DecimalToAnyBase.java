import java.util.Scanner;

public class DecimalToAnyBase{
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            int num = in.nextInt();
            int base = in.nextInt();
            int conversionValue = getConvInBase(num, base);
            System.out.println(conversionValue);
        }
        public static int getConvInBase(int num, int base) {
            int rem = 0;
            int multiplier =10;
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