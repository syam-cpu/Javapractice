package L6;

public class MethodOverLoading {

    public static String formatNumber(int value)
    {
        return String.format("%d", value);
    }

    public static String formatNumber(double value)
    {
        return String.format("%.3f", value);
    }

    public  static String formatNumber(String s)
    {
        return String.format("%.2f", Double.parseDouble(s));
    }





    public static void main(String[] args) {

        System.out.println(formatNumber(1));
        System.out.println(formatNumber(89.33));
        System.out.println(formatNumber("440"));


        System.out.println("________________________case1_____________________");
        int one = 10;
        int two = 20;

        int sum = scopes(one, two);
        System.out.println(sum);

        System.out.println("________________________case2_____________________");
        System.out.println(one + ", " + two);
        swap(one, two);
        System.out.println(one + ", " + two);
    }

    public  static void swap(int one , int two)
    {
        System.out.println(one + ", " + two);
        int temp = one;
        one  = two;
        two = temp;
        System.out.println(one + ", " + two);
    }

    public static int scopes(int one, int another)
    {
        int sum = one  + another;
        return sum;
    }

    void func(){}

    void func(int a ){}

    void func(double a){}

    int func(int a, float b){return 1;}

    // Method overloading is not associated with return types.

     //void func(double a){}
     //int func(double a) {return -1;}
    // parameters must be different.
}
