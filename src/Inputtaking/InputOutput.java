package Inputtaking;

import java.util.Scanner;

public class InputOutput {

    public static void main(String[] args) {
        System.out.println("Hello");


        int val = 10;
        System.out.println(val);
        System.out.println(4);

        System.out.println("I am " + "awesome at programming");
        System.out.println("Number = " + val);

        //creating an object of scanner class.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer value : ");
        //take input from user.
        int number = input.nextInt(); // program halts here until user enters number presess enter.
        //9:23.
        System.out.println("Yout entered : " + number);

        float myFloat = input.nextFloat();
        double myDouble = input.nextDouble();

        String myString = input.next();

    }
}
