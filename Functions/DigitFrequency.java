import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int digit = in.nextInt();
        int countOfDigit = getDigitFreq(num, digit);
        System.out.println(countOfDigit);
    }
    public static int getDigitFreq(int num, int digit) {
        int count = 0;
        while(num>0){
            int temp = num%10; //extracyt digit
            num = num/10; //Divide by 10
            if(temp==digit){
                count++;
            }   
        }
        return count;
    }
}