import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt(), second = sc.nextInt();
        System.out.println(getGreatestCommonDivisor(first, second));
    }

    static int getGreatestCommonDivisor(int n1, int n2) {
        int gcd=0;
        if(n1>10&&n2>10){
                for (int i = 1; (i <= n1)&&(i<=n2); ++i) {
                    if (n1 % i == 0 && n2 % i == 0)
                        gcd = i;
                }
                    return gcd;
                }


                return -1;

    }
}
