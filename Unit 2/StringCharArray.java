// convert string to char array.

import java.util.Scanner;
import java.util.Arrays; // for Arrays.toString()

class StringCharArray{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String :- ");
        String str = sc.nextLine();
        char[] ch = str.toCharArray();
        
        System.out.println(Arrays.toString(ch));
    }
}