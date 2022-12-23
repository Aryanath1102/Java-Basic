//Write a program to print all numbers between two intervals, namely low and high.
// But, with a special condition that numbers divisible by 5 must not be printed and skipped. (Do this using continue Statement)
import java.util.Scanner;
public class Divisability {
    public static  void main (String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range");
        int low=sc.nextInt(),high= sc.nextInt();

        while(low<=high)
        {
            if (low%5==0)
            {
                low++;
                continue;
            }

            System.out.print(low+" ");
            low++;
        }
        sc.close();

    }
}

