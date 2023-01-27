import java.util.Scanner;

public class number_to_words {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        numbertowords(n);
    }
    static void numbertowords(int n)
    {
        String word="",temp="";
        if(n<0)
            System.out.println("Invalid value");
        while (n>0)
        {
            int r= n%10;
            switch (r)
            {
                case 1:
                    word="One "+word;
                    break;
                case 2:
                    word="Two "+word;
                    break;
                case 3:
                    word="Three "+word;
                    break;
                case 4:
                    word="Four "+word;
                    break;
                case 5:
                    word="Five "+word;
                    break;
                case 6:
                    word="Six "+word;
                    break;
                case 7:
                    word="Seven "+word;
                    break;
                case 8:
                    word="Eight "+word;
                    break;
                case 9:
                    word="Nine "+word;
                    break;
                default: word="Zero"+word;
            }
            n=n/10;
        }
        System.out.print(word);
    }
}
