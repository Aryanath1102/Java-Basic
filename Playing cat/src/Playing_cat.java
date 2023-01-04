import java.util.Scanner;

public class Playing_cat {
    public  static  void  main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter wheather it is summer or not (True for summer; false otherwise): ");
        boolean summer= sc.nextBoolean();
        System.out.print("Enter temperature: ");
        int  temparature= sc.nextInt();
        System.out.println(iscatplaying(summer,temparature));

    }
    static boolean iscatplaying(boolean summer, int temparature)
    {
        if(summer) {
            if (temparature >= 25 && temparature <= 45)
                    return true;
            else
                return false;}

        else {
            if (temparature >= 25 && temparature <= 35)
                return true;
            else
                return false;
        }
    }
    }

