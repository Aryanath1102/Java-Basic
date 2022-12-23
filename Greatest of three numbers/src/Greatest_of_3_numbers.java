import java.util.Scanner;

public class Greatest_of_3_numbers
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter 1st number :");
        int x=sc.nextInt();
        System.out.print("Enter 2nd number :");
        int y=sc.nextInt();
        System.out.print("Enter 3rd Number : ");
        int z=sc.nextInt();
        compare(x,y,z);
    }
    static void compare(int x,int y,int z)
    {
        if(x>=y && x>=z)
            System.out.println("Greatest is 1st number :"+x);
        else if (y>=x && y>=z)
            System.out.println("Greatest is 2nd Number :"+y);
        else
            System.out.println("Greatest is 3rd number :"+z);
    }
}
