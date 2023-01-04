import java.util.Scanner;

public class Equility_printer
{
    public static void main(String [] args)
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter three numbers: ");
        int x= sc.nextInt(),y= sc.nextInt(),z= sc.nextInt();
        System.out.println(printequal(x,y,z));
    }
    static  String printequal(int x,int y,int z)
    {
        if(x<=0 || y<=0 || z<=0)
            return ("Invalid value");
        else if ((x!=y)&&(y!=z)&&(z!=x))
            return ("All numbers are differnt");
        else if (x==y &&y==z && z==x)
            return ("All number are equal");
        else
            return ("neither are equal or differnt ");
        }

    }

