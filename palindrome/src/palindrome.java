import java.util.Scanner;

public class palindrome {
    public static void main (String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number to check palindrome: ");
        int n= sc.nextInt();
        System.out.println(ispalindrome(n));

    }
    static boolean ispalindrome(int n)
    {
        int t,s=0;
        if (n>=10){
        t=n;

        while(n!=0)
        {
            //int r=n%10;
            s=s*10+n%10;
            n=n/10;

        }
        if(t==s)
            return true;
        else
            return false;
    }
        return false;
    }

}
