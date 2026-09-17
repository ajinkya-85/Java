//Java program to find the frequency of char. in sting.
import java.util.Scanner;

public class FrequencyCharString{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string and char. :");
        String str = sc.nextLine();
        char k = sc.next().charAt(0);
        int count =0 ;
        for(int i=0;i<str.length();i++){
            if(k == str.charAt(i)){
                count++;
            }
        }
        System.out.println("Frequency of " + k + " is "+ count);
        sc.close();

    }
}