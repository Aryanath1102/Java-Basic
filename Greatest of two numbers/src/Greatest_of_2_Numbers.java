import java.util.Scanner;

public class Greatest_of_2_Numbers {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Numbers : ");
        System.out.print("X: ");
        int x= sc.nextInt();
        System.out.print("\nY: ");
        int y=sc.nextInt();
        compare(x,y);
    }
    static void compare(int x,int y)
    {
        if(x==y)
            System.out.println("Both the numbers are equal.");
        else if (x>y)
            System.out.println("The number X: "+ x +" is greater than the number Y: "+y);
        else
            System.out.println("The number Y: " + y + " is greater than the number X: "+ x);



        }
    }


