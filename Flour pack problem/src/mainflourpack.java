// The packet must be fully filled.
// extra packet is allowed
// for example if big packet =2 ,small packet =2 and  goal =11
// then big packet can store = 2* 5 kg =10kg
// small packet can store =2*1 kg=2kg
// and the goal is 11
// therefore total quantity that packets can be filled = 10+2 =12kg but the goal is 11kg then 1kg small packet is extra.

import java.util.Scanner;

public class mainflourpack {
    public static void main(String[]args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the quantity of Big packet of flours of 5 kg each : ");
        int bigpack= sc.nextInt(); // big bag of flour 5kg.
        System.out.println( "big packet can store = "+ bigpack*5 + "Kg of flour");
        System.out.print("/nEnter the quantity of Small packet of flours of 1 kg each : ");
        int smallpack= sc.nextInt(); // small bag of flour 1kg .
        System.out.println("small packet can store =" + smallpack+"kg of flour");
        System.out.print("Enter the quantity flours required : ");
        int goal= sc.nextInt(); // total quantity of flour that is require to fill the bags.
        System.out.println(canpack(bigpack,smallpack,goal));
    }
    public static boolean canpack(int bigpack,int smallpack,int goal)
    {
        if(bigpack<0 || smallpack<0 || goal<0) // bigpack , smallpack and goal cannot be negative.
            return false;

        if(goal>(bigpack*5)+smallpack) // if goal > bigpack & smallpack then some flour is left behind so false.
            return false;               // bigpack*5 = no of bigpack of quantity 5kg each

        if((goal%5) > smallpack)
            return false;


        return true; // if no goal is left behind then all flours are in big packet and small packet then return true.
    }
}
