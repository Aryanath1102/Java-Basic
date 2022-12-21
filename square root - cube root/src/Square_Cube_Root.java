import java.util.Scanner;

public class Square_Cube_Root {
    public static  void main(String [] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the  Number \n"+"X :");
        int x=sc.nextInt();
         squareroot(x);
         cuberoot(x);
    }
    static  double squareroot(int x)
    {
        double root=(double)Math.sqrt(x);
        System.out.println("Square Root of " + x+ " is :"+root);
        return 0;

    }
    static  double cuberoot(int x)
    {
        double root=(double) Math.cbrt(x);
        System.out.println("The Cube Root of " +x+" is :"+root);
        return  0;
    }

}

