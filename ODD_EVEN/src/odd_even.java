import java.util.Scanner;

public class odd_even {

    public static void main(String[] args)
    {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = Scanner.nextInt ();
        if(n%2==0)
            System.out.println("Number is even ");
        else
            System.out.println("Number is odd");


    }

}
