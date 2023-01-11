import java.util.Scanner;

public class Mul_table {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number whose multiplication you want: ");
        int n= sc.nextInt();
       table(n);
    }
    static void table(int n)
    {
        int i=1;
        while (i<=10){
            System.out.println(n+" X "+i+" = "+n*i);
            i++;
        }

    }
}
