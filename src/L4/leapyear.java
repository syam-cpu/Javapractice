package L4;

import java.util.Scanner;

public class leapyear {

    public static void main(String[] args) {
        // a year is considered  a leap year if
        // 1 . if year is exactly by four
        // and not divisible by 100
        // or 2 . an year is divisible by 400 then it is a leap year.

        Scanner scn = new Scanner(System.in);
        int year = scn.nextInt();

        if ( ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
        {
            System.out.println("this is leap year");
        }
        else
        {
            System.out.println("not a leap year");
        }
    }
}
