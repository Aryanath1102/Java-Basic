import java.util.Scanner;

public class Factors {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        printFactors(n);
    }
    static void printFactors(int n)
    {
        if(n<1)
            System.out.println("invalid value");
        for (int i=1;i<=n;i++)
            if(n%i==0)
                System.out.println(i);

    }
}
