import java.util.Scanner;

public class Prime {
    public  static  void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter any Number: ");
        int n= sc.nextInt();
        isprimenumber(n);
    }
    static void isprimenumber(int n)
    {
        int i,c=0;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
                c++;
        }
        if(c==2)
            System.out.println("It is a prime number.");
        else
            System.out.println("It is not a prime number.");

    }
}
