//Declare two integer variables as length and breadth, and
// one double variable as height for storing the dimensions of the figures.
//
//Declare three double variables as sq_area, rect_area, and tri_area, for calculating the area of the three figures.
//
//Create three different methods as follows:
//
//area(int length) - for calculating the area of the square.
//
//area(int length, int breadth) - for calculating the area of the rectangle.
//
//area(int breadth, double height) - for calculating the area of the triangle.
import java.util.Scanner;

public class Area {
    public  static  void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int length= sc.nextInt(),breadth= sc.nextInt();
        double height= sc.nextDouble();
        double sq_area,rect_area,tri_area;
        sq_area=area( length);

        rect_area=area( length, breadth);
        tri_area=area(breadth,height);
        System.out.println("Area of the square is "+sq_area);
        System.out.println("Area of the rectangle is "+rect_area);
        System.out.println("Area of the triangle is "+tri_area);
    }
    static double area(int length)
    {
        return length*length;
    }
    static double area(int length,int breadth)
    {
        return length*breadth;
    }
    static double area(int breadth,double height)
    {
        return 0.5 * breadth * height;
    }

}
