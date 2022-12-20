import java.util.Scanner;

public class Positive_Negative
{
    public  static void main(String[] args)
    {
        Scanner Scanner =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = Scanner.nextInt();
        if(n>0)
            System.out.println("It is Positive number");
        else if(n<0)
            System.out.println("It is Negative number");
        else
            System.out.print("It is neither Positive or Negative number. It is ZERO.");
    }
}

