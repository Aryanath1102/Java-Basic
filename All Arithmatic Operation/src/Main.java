import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Scanner=new Scanner(System.in);
        System.out.println("Enter two numbers");
        int a=Scanner.nextInt(),b=Scanner.nextInt();
        System.out.println("Addition of two variable "+ a +" + " +b + " = " +
            (add(a,b)));
        System.out.println("Substraction of two variable "+ a +" - " +b + " = " +
            (Sub(a,b)));
        System.out.println("Multiplication of two variable " + a + " * " +b + " = " +
            (Multiply(a,b)));
        System.out.println("Division of two variable " + a +" / " +b + " = " +
                (Div(a,b)));
        System.out.println("Modulo of two variable " + a +" % " +b + " = " +
                (mod(a,b)));
        System.out.println("Power of two variable " + a +" ^ " +b + " = " +
                (pow(a,b)));

    }

    static int add(int a,int b)
    {
        int sum=0;
        sum=a+b;
        return  sum;
    }
    static  int Sub(int a, int b)
    {
        int sub=0;
        sub =a-b;
        return sub;

    }
    static int Multiply(int a, int b)
    {
        int product=1;
        product=a*b;
        return  product;
    }
    static float Div(int a,int b)
    {
        float quotient;
        quotient= (float)a/b;
        return  quotient;
    }
    static float mod(int x,int y)
    {
        float remainder;
        remainder= (float)x%y;
        return remainder;
    }
    static double pow(int x,int y)
    {
        double c;
        c=Math.pow(x,y);
        return  c;
    }

}
