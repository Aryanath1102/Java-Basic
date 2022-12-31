//Write a method areEqualByFiveDecimalPlaces with three parameters of type double.
// The method should return boolean and
// it needs to return true if three double numbers are the same up to five decimal places.Otherwise, return false.
//Example
//areEqualByFiveDecimalPlaces(1.176231, 1.176232, 1.176233) -> should return true since number are equal up to 5 decimal places.
//areEqualByFiveDecimalPlaces(2.23543, 2.235432, 2.235451) -> should return false since numbers are not equal up to 5 decimal places.


import java.util.Scanner;

public class Decimal_comparator {
    public  static  void  main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 3 numbers.");
        double x= sc.nextDouble(),y= sc.nextDouble(),z= sc.nextDouble();
        System.out.println(areEqualByFiveDecimalPlaces(x,y,z));
    }
    static boolean areEqualByFiveDecimalPlaces(double x,double y,double z)
    {
        x=Math.round(x*100000);
        y=Math.round(y*100000);
        z=Math.round(z*100000);
        System.out.println("x: "+x+" y: "+y+" z: "+z);
        return (x==y) && (y==z);
    }
}
