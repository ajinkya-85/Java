// Java program to check whether number is EVEN or ODD.
import java.util.Scanner;

public class EvenOdd{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number :");
        int num = sc.nextInt();

        System.out.println((num % 2 == 0) ? "EVEN" : "ODD");

        sc.close();
    }
}