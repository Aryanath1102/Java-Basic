//Write a program to accept three number and check whether they are pythagorean triplet or not.
import java.util.Scanner;

public class Pythagoran_triplet {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of 1st no.: ");
        int a= sc.nextInt();
        System.out.print("Enter the value of 2nd no.: ");
        int b= sc.nextInt();
        System.out.print("Enter the value of 3rd no.: ");
        int c= sc.nextInt();
        calculate(a,b,c);
    }
    static void calculate(int a,int b , int c)
    {
        int p,q,r;
        p=a*a;
        q=b*b;
        r=c*c;
        if(p+q==r)
            System.out.println("They are pythagorean triplet.");
        else
            System.out.println("They are not pythagorean triplet.");
    }

}
