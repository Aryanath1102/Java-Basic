//Write a method hasEqualProduct with 3 parameters of type int.
//
//The method should return boolean and it needs to return true if the product of the first and second parameter is equal to the third parameter. Otherwise, return false.
//
//Example
//
//Input :
//
//2 3 6
//
//Output :
//
//True
//
//Explanation:
//
//Since 2*3 is equal to 6, hence return true.


import java.util.Scanner;
public class Product {
    public static boolean hasEqualProduct(int a,int b,int c )
    {
        return ((a*b)==c);
    }



    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the 1st no.: ");
        int a= sc.nextInt();
        System.out.print("Enter the 2nd no.: ");
        int b= sc.nextInt();
        System.out.print("Enter the 3rd no.: ");
        int c= sc.nextInt();
        System.out.println(hasEqualProduct(a,b,c));
    }


}
