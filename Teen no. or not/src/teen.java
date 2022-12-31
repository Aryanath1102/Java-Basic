//Write a method named hasNotTeen with 3 parameters of type int.
//
//We’ll say that a number is  “teen” if it is in the range 13..19 inclusive,
// otherwise it is not teen. Given 3 int values, return true if none of them are teen, otherwise return false..
//
//Example
//
//Sample Input 1 :
//
//13 12 20
//
//Sample Output 1:
//
//False
//
//Explanation:
//
//Since 13 is a teen number, hence false is returned.
//
//
//
//Sample Input 2:
//
//9 29 21
//
//Sample output 2:
//
//True
//
//Explanation:
//
//Since numbers 9,29,21 are not in range 13-19, hence true is returned.

import java.util.Scanner;

public class teen {

    static boolean hasnotteen(int a,int y,int z)
    {
       if (a>=13 && a<=19)
           return false;
       else if (y>=13 && y<=19)
           return  false;
       else if (z>=13 && z<=19)
           return false;
       else
           return true;


    }
    public static void main(String[]args)
    {
        Scanner sc =new Scanner(System.in);
        int x= sc.nextInt(),y= sc.nextInt(),z= sc.nextInt();
        System.out.println(hasnotteen(x,y,z));
    }

}
