import java.util.Scanner;

import javax.xml.crypto.Data;

public class BarChart {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sizeOfArray = in.nextInt();
        int[] arr = new int[sizeOfArray];
        for(int data=0; data<arr.length; data++){
            arr[data] = in.nextInt();
                }
                BarChart.printBarChartVertically(arr);
    }
    public static void printBarChartVertically(int arr[]){
        int max = SpanOfArray.maxArr(arr);
        for(int floor = max; floor>=1; floor--)
        {
            for(int building=0; building<arr.length; building++){
                if(arr[building]>=floor){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
