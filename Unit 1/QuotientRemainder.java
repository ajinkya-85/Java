// java program to compute quotient and remainder.
import java.util.Scanner;

public class QuotientRemainder{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Dividend and Divisor :");
        int divident = sc.nextInt();
        int divisor = sc.nextInt();

        System.out.println("Quotient : " + divident / divisor);
        System.out.println("Remainder : " + divident % divisor);
    }
}