import java.util.Scanner;

public class Shared_digits {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt(),n2= sc.nextInt();

            System.out.println(has_hshared_digits(n1,n2));
    }
    static boolean has_hshared_digits(int n1,int n2)
    {
        if(n1>=10 && n2<=100)
        {int n11=n1/10;
        int n12=n1%10;
        int n21=n2/10;
        int n22=n2%10;
        if(n11==n21||n12==n22||n11==n22||n12==n21)
            return true;
        else return false;
        }
        else
            return false;

    }
}
