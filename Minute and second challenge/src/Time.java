//Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
//
//You should validate that the first parameter minutes is >= 0.
//
//You should validate that the 2nd parameter seconds is >= 0 and <= 59. The method should return Invalid value in the method if either of the above are not true.
//
//If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format gXXh YYm ZZsh where XX represents a number of hours, YY the minutes and ZZ the seconds.
//
//Create a 2nd method of the same name but with only one parameter seconds.
//
//Validate that it is >= 0, and return gInvalid valueh if it is not true.
//
//If it is valid, then calculate how many minutes are in the seconds value and then call the other overloaded method passing the correct minutes and seconds calculated so that it can calculate correctly.
//
//Call both methods to print values to the console.
//
//Tips:
//
//Use int or long for your number data types is probably a good idea.
//
//1 minute = 60 seconds and 1 hour = 60 minutes or 3600 seconds.
//
//Methods should be static as we have used previously.
//
//Bonus:
//
//For the input 61 minutes output should be 01h 01m 00s, but it is ok if it is 1h 1m 0s (Tip: use if-else)
//
//Create a new console project and call it SecondsAndMinutesChallenge


import java.util.Scanner;

public class Time {
    public static void  main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter minutes: ");
        int minutes= sc.nextInt();
        System.out.println("Enter seconds: ");
        int seconds= sc.nextInt();
        System.out.println(getdurationstring(minutes,seconds));
        System.out.println(getdurationstring(seconds));

            }
    static String getdurationstring(int minutes,int seconds)
    {
        String hour=" ",min=" ",sec=" ";
        if (minutes >= 0 && (seconds >= 0 && seconds <= 59)) {
            int hours = minutes / 60;
            int rem_minutes = minutes % 60;
            hour=hours+"h";
            if(hours<10)
                hour="0"+hour;
            min=rem_minutes+"m";
            if (rem_minutes<10)
                min="0"+min;
            sec=seconds+"s";
            if (seconds<10)

                sec="0"+sec;
            return hour+ " " +min + " " + sec + " ";
        }
        else
            return "Invalid value";
    }
    static String getdurationstring(int seconds)
    {
        if(seconds>=0)
        {
           int minutes=seconds/60;
           int rem_seconds=seconds%60;
           return getdurationstring(minutes, rem_seconds);
        }
        else
            return "Invalid value";

    }

}

