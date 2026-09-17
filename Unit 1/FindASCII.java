// Java program to find ASCII value of a character.

import java.util.Scanner;

public class FindASCII{
    public static void main(String[] arg){
        System.out.println("Enter single character :");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0); // to take single char.

        System.out.println("ASCII : " + (int)ch);
        sc.close();
    }
}