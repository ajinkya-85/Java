// Java program to add two integers.
import java.util.Scanner;

public class AddToInteger{
    public static void main(String[] arg){
        int a=0;
        int b=0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two no. :- ");
        a=sc.nextInt();
        b=sc.nextInt();
        System.out.println("Addition : " + (a + b));

    }
}