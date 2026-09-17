//Java program to remove all the whitespaces from string.
import java.util.Scanner;

public class RemoveSpaces{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String with spaces. :");
        String str = sc.nextLine();
        sc.close();
        System.out.println(str.replaceAll(" ",""));
    }
}