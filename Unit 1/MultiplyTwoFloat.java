// java program to multiply two floating point no.

import java.util.Scanner;

public class MultiplyTwoFloat{

    float multiply(float n1 , float n2){
        return n1 * n2;
    }


    public static void main(String[] arg){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two floating no. :");
        float a = sc.nextFloat();
        float b = sc.nextFloat();

        MultiplyTwoFloat mf = new MultiplyTwoFloat();

        System.out.println("Multiplication : " + mf.multiply(a,b));

    }
}