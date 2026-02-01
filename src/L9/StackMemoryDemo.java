package L9;

public class StackMemoryDemo {

    public static void main(String[] args) {

        System.out.println("Hello there!");
        greetings();
        askQuery();

        int defaultVal = 0;
        defaultVal = multiplyTwo(defaultVal);
        defaultVal = multiplyFour(defaultVal);
        greetings();
        askQuery();
    }

    private static int multiplyTwo(int val)
    {
        val *= 4; // these values are stored in stack because these are primitive.
        return val;
    }

    private static int multiplyFour(int val)
    {
        val *= 2;
        return val;
    }

    public static void greetings()
    {
        System.out.println("Hope you are doing well! ");
    }

    public static void askQuery()
    {
        System.out.println("How may i help you today");
    }
}
