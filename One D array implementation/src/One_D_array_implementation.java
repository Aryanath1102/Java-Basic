import java.util.Scanner;

public class One_D_array_implementation {
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n= sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.print("Enter the element of array ["+i+"]: ");
            a[i]= sc.nextInt();
        }
        System.out.println("The array elements are: ");
        for (int i=0;i<n;i++)
            System.out.print(a[i]+" ");
    }
}
