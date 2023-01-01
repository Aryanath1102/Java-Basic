import java.util.Scanner;

public class Calender {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the minutes that you want to convert: ");
        int minutes= sc.nextInt();
        printyearanddays(minutes);
    }
    static void printyearanddays(int minutes)
    {
        if(minutes<0)
            System.out.println("Invalid value");
        else
        {
            int year=minutes/(365*24*60);
            int rem_minutes=minutes-(year*365*24*60);
            int days=rem_minutes/(24*60);
            System.out.println(minutes+" min "+"=" + year+"y"+" and "+days+"d");
        }
    }
}
