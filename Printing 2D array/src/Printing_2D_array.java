import java.util.Scanner;

public class Printing_2D_array {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Size of the 2d array: ");
        int m= sc.nextInt(),n=sc.nextInt();
        int a[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.println("Enter the element of array ["+i+"]["+j+"] : ");
                a[i][j]= sc.nextInt();
            }
        }
        System.out.println("The elements of the array are: ");
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]);

            }
            System.out.println();
        }

    }
}
