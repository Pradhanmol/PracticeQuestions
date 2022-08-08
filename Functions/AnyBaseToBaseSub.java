import java.util.Scanner;

public class AnyBaseToBaseSub {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1=in.nextInt();
        int num2=in.nextInt();
        int base=in.nextInt();
        System.out.println(getAnyBaseToBaseSub(num1, num2, base));
    }
    public static int getAnyBaseToBaseSub(int num1, int num2, int base) {
        int res=0;
        int carry =0;
        int count = 0;
        int subOfBothNum = 0;
        while(num2>0){
            int temp1 = num1%10;
            int temp2 = num2%10;
            num1/=10;
            num2/=10;
            temp1 = temp2+carry;
            if(temp1>=temp1){
                carry=-1;
                subOfBothNum = temp2 + base - temp1;
            }else{
                carry=0;
                subOfBothNum = temp2 - temp1;
            }
            res+= (int) (subOfBothNum*Math.pow(base, count));
            count++;
        }
        return res;
    }
}
