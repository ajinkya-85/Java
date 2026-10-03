// Java program to convert character to string and vice-versa.

import java.util.Scanner;

class CharString{


    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter a character :- ");
        ch = sc.next().charAt(0);

        String str = Character.toString(ch);

        System.out.println("String :- "+ str);

    }
}