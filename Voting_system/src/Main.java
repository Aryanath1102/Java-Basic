import java.util.Scanner;

public class Main {
    public  static  void main(String[] args)
    {
        Scanner Scanner =  new Scanner (System.in);
        int age=Scanner.nextInt();
        if(age>=18)
        {
            System.out.println("HE OR SHE CAN VOTE.");
        }
        else
            System.out.println("HE OR SHE CANNOT VOTE.");
    }
}