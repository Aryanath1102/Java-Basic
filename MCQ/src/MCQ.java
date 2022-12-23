//Write a program to create an interface of an MCQ, ask the user for the option of his choice as an integer
//and print the option that he has selected.Options are marked from 1 to 4 any other integer input should be printed as invalid

import java.util.Scanner;

public class MCQ
{
    public static void main(String[]arga)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your Choice: ");
        int ch= sc.nextInt();
        switch (ch)
        {
            case 1:
                System.out.println("OPTION 1 SELECTED");
                break;
            case 2:
                System.out.println("OPTION 2 SELECTED");
                break;
            case 3: System.out.println("OPTION 3 SELECTED");
                    break;
            case 4: System.out.println("OPTION 4 SELECTED");
                    break;
            default:
                System.out.println("INVALID");
                break;
        }
    }

}
