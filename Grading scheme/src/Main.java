//WAP to check the grade of the student
//if marks <50 then F
//if marks >=50 <60 then D
//if marks >=60 <70 then C
//if marks >=70 <80 then B
//if marks >=80 <90 then A
//if marks >=90 <=100 then A+
//If the marks is not in the above range invalid
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter the marks");
        int marks = Scanner.nextInt();

        if (marks >= 0 && marks < 50) {
            System.out.println("Grade F");
        } else if (marks >= 50 && marks < 60) {
            System.out.println("Grade D");
        } else if (marks >= 60 && marks < 70) {
            System.out.println("Grade C");
        } else if (marks >= 70 && marks < 80) {
            System.out.println("Grade B");
        } else if (marks >= 80 && marks < 90) {
            System.out.println("Grade A");
        } else if (marks >= 90 && marks <= 100) {
            System.out.println("Grade A+");
        } else
            System.out.println("Invalid");
    }

}






