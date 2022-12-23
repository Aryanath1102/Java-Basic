//Without using Math.pow or recursion
import java.util.Scanner;

public class Number_Power {
    public static void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the base: ");
        double base=sc.nextDouble();
        System.out.print("Enter the exponent: ");
        double exp= sc.nextDouble();
        double result=1;
        while(exp!=0)
        {
            result=result*base;
            --exp;
        }
        //double result=Math.pow(base,exp);


        System.out.print("Result is: "+result);
    }
}
