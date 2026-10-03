// java program to convert char type variable to int.
import java.util.Scanner;

class CharInt{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char.:- ");
        char ch = sc.next().charAt(0);

        //ASCII value
        // int num = ch;
        
        //getNumericValue() of class character to return the exact numeric int value not ASCII.
        //int num = Character.getNumericValue(ch);

        //parseInt() requires string as actual para.
        int num = Integer.parseInt(String.valueOf(ch));
        System.out.println("no. :- " + num);


    }
}