//write a program to print an integer from the user.

import java.util.Scanner;

public class PrintInteger{
    public static void main(String arg[]){
        
        int num=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer : - ");
        num = sc.nextInt();

        System.out.println("Number is :- " + num);


    }
}