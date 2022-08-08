import java.util.Scanner;

/**
 * AnyBaseToBaseAddition
 */
public class AnyBaseToBaseAddition {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int base = in.nextInt();
        System.out.println(getAnyBaseToBaseAddition(num1, num2, base));

    }
    public static int  getAnyBaseToBaseAddition(int num1, int num2, int base) {
        int res = 0;
        int carry =0;
        int count =0;
        while(num1>0||num2>0||carry>0){
            int temp1 = num1%10; //gives remainder1
            int temp2 = num2%10; //gives remainder2
            num1/=10;
            num2/=10;
            int additionOfTwoNum = temp1+temp2 + carry;
            carry = additionOfTwoNum/base;
            additionOfTwoNum = additionOfTwoNum%base;
            res+=(int) (additionOfTwoNum*Math.pow(10, count));
            count++;
        }
        return res;
    }
    



}