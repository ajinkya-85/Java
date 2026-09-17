//Java program to check if a string is empty ot null.
import java.util.Scanner;

public class StringEmptyNull{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string :");
        String str = sc.nextLine();
        sc.close();
        check(str);

    }

    static void check(String str){
        if(str == null){
            System.out.println("NULL");
        }
        else if(str.trim().isEmpty()){
            System.out.println("EMPTY");
        }
        else{
            System.out.println("NULL or EMPTY");
        }
    }
}