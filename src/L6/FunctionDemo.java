package L6;

public class FunctionDemo {
    public static void main(String[] args) {

        System.out.println("Lets get started");
        sayHello();// calling a function.
        System.out.println("see you soon!" + addNum(30, 40));

        addNumbers(10, 20);
        addNumbers(30, 30);
        addNumbers(30, 333);
        addNumbers();

        for (int i = 0 ; i < 10; i++)
        {
            int result = getSquare(i);
            System.out.println("Square of " + i + "is : " + result);
        }
    }

    //purpose : greating customers.
    // process of declaring a function.
    //20
    public static void sayHello()
    {
        System.out.println("Hello to you!");
        System.out.println("Hope you are having a good day!");
    }

    public static void addNumbers(int a , int b)
    {
        int sum = a + b;
        System.out.println(sum);
    }

    public static void addNumbers()
    {
        int a = 8;
        int b = 10;
        System.out.println(a + b);
    }

    public static int addNum(int a , int b)
    {
        int sum = a + b;
        return sum;
    }


    public  static int getSquare(int x)
    {
        return x * x ;
    }
}
