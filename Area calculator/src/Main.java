import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the the radius of the circle: ");
        double radius= sc.nextDouble();
        System.out.println("Enter length of the rectangle: ");
        double length=sc.nextDouble();
        System.out.println("Enter the breadth of the rectangle");
        double breadth= sc.nextDouble();
        System.out.println(area(radius));
        System.out.println(area(length,breadth));
    }
    static  double area(double radius)
    {
        if(radius<0.0)
            return -1;
        return (Math.PI*radius*radius);
    }
    static  double area(double length,double breadth)
    {
        if(length<0.0 || breadth <0.0)
            return -1;
        return (length*breadth);
    }
}