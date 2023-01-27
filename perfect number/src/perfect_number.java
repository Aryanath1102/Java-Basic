import java.util.Scanner;

public class perfect_number {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(isPerfectNumber(n));
    }
    static boolean isPerfectNumber(int n)
    {
        int factor=0;
        if(n>=1)
        {
            for(int i=1;i<n;i++)
            {
                if(n%i==0)
                    factor+=i;
            }
            if(factor==n)
                return true;
        }
        return false;
    }
}
