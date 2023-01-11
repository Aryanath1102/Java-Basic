import java.util.Scanner;

public class sum_of_digits {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        sum(n);
    }
    static void sum(int n)
    {
        int num=n;
        int sum=0;
        do {
            sum=sum+n%10;
            n=n/10;

        }while (n!=0);
        System.out.println("The sum of the digits of this number "+ num +" is: "+sum);
    }
}
