import java.util.Scanner;

public class Even_sum {
    static boolean isEven(int number)
    {
        if(number>0 && number%2==0)
            return true;
        return false;

    }
    static int sumEven(int start ,int end)
    {
        int s=0;
        if(end<start)
            return -1;
        if (end<=0 || start<=0)
            return -1;
        for (int i=start; i<=end; i++){
                if(isEven(i))
                    s=s+i;}
        return s;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Start: ");
        int start= sc.nextInt();
        System.out.print("End: ");
        int end= sc.nextInt();
        System.out.println(sumEven(start,end));

    }
}
