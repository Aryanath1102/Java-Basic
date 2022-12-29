import java.util.Scanner;

public class Convert_Weight {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the weight in Kg you want to convert");
        double weightkg= sc.nextDouble();
        convert(weightkg);

    }
   static void convert(double weightkg)
   {
       double grams=0,miligrams=0;
       grams+=weightkg*1000;
       miligrams=miligrams+grams*1000;
       display (weightkg,grams,miligrams);
   }
   static void display( double weightkg, double grams, double miligrams)
   {
       System.out.println(weightkg+" Kg in grams  is"+grams+" grams");
       System.out.println(weightkg+" Kg in miligrams is"+miligrams+" miligrams");
   }

}
