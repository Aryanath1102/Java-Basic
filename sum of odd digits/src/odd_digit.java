import java.util.Scanner;

public class odd_digit {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println(sum(n));


    }
    static int sum(int n) {
        int s = 0;
        if (n < 0)
            return -1;
        while (n !=0)
        {
            int t=n%10;
            if(t%2!=-0)
                s=s+n%10;
            n=n/10;
        }
        return s;

    }

}

