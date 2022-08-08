import java.util.Scanner;

public class PrintRotateNumByKDigit{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number which you want to rotate?");
        int num = in.nextInt();
        System.out.println("Enter the digit for how many time to you rotate?");
        int numofDigit = in.nextInt();
        int temp = num;
        int nod = 0; 
      /*int div = (int) Math.pow(10, numofDigit);
        int count = 0;
        while(div!=0){
            r = num%div;
            q = num/div;
            div = div/10;
            count++;
            System.out.println(r +"-->"+ q);
        }*/ 
        while(temp > 0){
            temp = temp/10;
            nod++;
        }
        numofDigit = numofDigit%nod;
        if(numofDigit<0){
            numofDigit = numofDigit + nod;
        }
        int div = 1;
        int mul = 1;
        for(int i=1; i<=nod; i++){
            if(i<=numofDigit){
                div = div *10;
            }
            else{
                mul = mul*10;
            }
        }
        int q = num/div;
        int r = num%div;
        int rot = (r*mul)+ q;
        System.out.println(rot);
    }
}