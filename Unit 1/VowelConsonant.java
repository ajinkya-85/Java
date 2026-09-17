//Java program to check whether alphabet is vowel ot consonant.
import java.util.Scanner;

public class VowelConsonant{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet :");

        char ch = sc.next().charAt(0);

        System.out.println((ch == 'a' || ch =='A' || ch == 'e' || ch == 'E' || ch == 'I' || ch == 'i' || ch == 'o' || ch == 'O' || ch == 'u' || ch == 'U') ? "VOWEL" : "Consonant");

        sc.close();
    }
}