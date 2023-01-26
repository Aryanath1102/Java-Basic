import java.util.Scanner;

public class last_digit {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n1= sc.nextInt(),n2= sc.nextInt(),n3= sc.nextInt();
        System.out.println(hasSameLastDigit(n1,n2,n3));
    }
    static boolean hasSameLastDigit(int n1,int n2,int n3)
    {
        if((n1>=10&&n1<=1000)&&(n2>=10&&n2<=1000)&&(n3>=10&&n3<=1000) ) {
            int n11 = n1 % 10;
            int n22 = n2 % 10;
            int n33 = n3 % 10;
            if ((n11 == n22) || (n22 == n33) || (n33 == n11))
                return true;
            else
                return false;

        }
            return false;
    }

}
