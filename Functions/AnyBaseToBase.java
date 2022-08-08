import java.util.Scanner;

public class AnyBaseToBase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int base = in.nextInt();
        int multiplier = in.nextInt();
        System.out.println(getAnyBaseToAnyBaseConv(num, base,multiplier));
    }
    public static int getAnyBaseToAnyBaseConv(int num, int base, int multiplier) {
        int res = 0;
        int count = 0;
        while(num>0){
            int temp = num%base;
            num = num/base;
            temp = (int) (temp * Math.pow(multiplier, count));
            res+=temp;
            count++;
        }
        return res;
    }

}
