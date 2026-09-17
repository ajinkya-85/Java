//Java program to find all the roots of a Quadratic equation.
import java.util.Scanner;

public class RootsOfQuadraticEqu{
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of real no. a,b and c : ");

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        sc.close();

        double root1 ,root2;
        //calculate the discriminant (b2 - 4ac)
        double discriminant = b * b - 4 * a * c;

        if(discriminant > 0){
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f",root1,root2);
        }
        else if (discriminant == 0){
            root1 = root2 = -b / (2 * a);
            System.out.format("root1 = root2 = %.2f",root1);
        }
        else{
            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-discriminant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}