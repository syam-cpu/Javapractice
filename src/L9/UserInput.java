package L9;
import  java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {


        // java provides different ways to get input from the user.
        // Scanner
        // BufferReader.

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = input.nextInt();
        System.out.println("you entered : " + num);


        System.out.println("Enter Text: ");
        String myString = input.next(); // takes only first word. spaces cannot be  read.
        System.out.println("You entered: " + myString);

        input.close();
    }
}
