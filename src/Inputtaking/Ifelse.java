package Inputtaking;

import java.sql.SQLOutput;

public class Ifelse {

    public static void main(String[] args) {
        // if else
        boolean primeSub = true;
        if (primeSub == true)
        {
            System.out.println("You are welcome to the prime subscription.");
        }
        else
        {
            System.out.println("Please become member of amazon prime now");
        }

        // if
        int num = 19;

        if (num < 0)
        {
            System.out.println("This is a negative number");
        }

        System.out.println("Now you are out of else block");

        // if elseif else : there is no rule for how many else if subscriptions should be there.
        int hotstartsubs = 1;

        if (hotstartsubs == 0)
        {
            System.out.println("Now is a good tiem to get a hotstar");
        }
        else if(hotstartsubs == 1)
        {
            System.out.println("Why dont you upgrade to premium subscription");
        }
        else
        {
            System.out.println("Welcome to hotstar premium");
        }

        // nested if else
        String movie = "line of duty";
        boolean acorn = true;
        boolean amc = false;
        if (primeSub)
        {
            if (acorn || amc)
            {
                System.out.println("Yes you can watch moview");
            }
            else
            {
                System.out.println("We recommend buying either acorn or amc subs to enjoy the movie");
            }
        }
        else
        {
            System.out.println("Cannot watch movie");
        }

    }
}
