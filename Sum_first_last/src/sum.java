import java.util.Scanner;

public class sum {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any number: ");
        int n= sc.nextInt();
        System.out.print("The sum of the first and last digit is: "+sum_first(n));

    }
    static  int sum_first(int n)
    {
        int last=n%10,t=n;
        while(n>9)
        {
            n=n/10;
        }
        int first =n;
        System.out.println("The first and last digit of the number "+ t +" is "+first+" , "+ last);

        return first+last;
    }
}
