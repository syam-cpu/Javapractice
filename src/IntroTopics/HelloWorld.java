package IntroTopics;

public class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("Hello World");// prints and moves the cursor to next line
        System.out.println("Universe is good");

        System.out.print("Hello World"); // prints but doesnt move the cursor
        System.out.print("Universe is good");

        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Hello %s!%n", "World");
        System.out.printf("Java is %d fun", 10);
        //25:37

        // staticly typed language.
        int a = 10;
        // datatype variable or container  and value at that position.

        int speed;
        //System.out.println(speed); gives compile time error as this was not initialized
        //35:32

        speed = 20;
        System.out.println(speed);

        speed = 50;
        System.out.println(speed);

        //case sensitive
        int age = 10;
        int AGE = 20;
        System.out.println(age);
        System.out.println(AGE);

        //Start letter.either letter or dollar or underscore.
        int start;
        int $start; // works but bad practice
        int _start; // works but bad practice
        //int my age; Spacing is also not allowed.
        // print_roll_no -> snake casing used in python.
        // printRollNo; camelCase
        // n, s, l dont use variable names like this. variable names should make sense.
        // these are not small things they will reject you.


        //45.45


    }
}
