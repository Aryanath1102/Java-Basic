//Write a program to print all numbers between two intervals, namely low and high.
// But, with a special condition that if any number in the range while getting printed becomes divisible by 13
// then you must not print anything further and stop. (Do this using the Break Statement)

import java.util.Scanner;

public class not_divisable_by_13 {
   public static void main(String[]args)
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the range: ");
       int x=sc.nextInt();
       int y= sc.nextInt();
       while(x!=y)
       {
           if (x%13==0)
               break;
           else
               System.out.print(x +" ");
            x++;
       }
   }
}
