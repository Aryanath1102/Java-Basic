import java.util.Scanner;

public class Prime {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the range: ");
        int r1= sc.nextInt();
        int r2= sc.nextInt();

        primeinrange(r1,r2);

    }
    static void primeinrange(int r1, int r2)
    {
        int j,c=0;
        for(int i=r1;i<=r2;i++){
            for(j=2;j<i;j++)
            {     if(i%j==0)
                    break;
            }

            if(i==j)
                    System.out.println(j);}
    }
}
