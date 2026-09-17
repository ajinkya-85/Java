//Java program to swap to numbers.
import java.util.Scanner;

public class SwapTwoNo{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two no. :");

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("a : " + a + " b : "+ b);

        a = a + b;
        b = a - b;
        a = a - b ;
        System.out.println("After Swap : \na : " + a + " b : " + b);

        sc.close();
    }
}