import java.util.Scanner;

public class Multiples {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number the table you want to know :");
        int a = sc.nextInt();
        table(a);
    }
    static void table(int a)
    {
        int i;
        for(i=1;i<=10;i++)
        {
            System.out.println("Product of "+ a +" X "+i +" = :"+a*i);

        }
    }
}
