//Java program to round the numbers to n decimal places.

import java.util.Scanner;

public class RoundDecimal{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = sc.nextDouble();
        sc.close();
        System.out.format("Number is %.2f",num);
    }
}