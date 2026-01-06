package L6;

public class MethodOverLoading {

    private  String formatNumber(int value)
    {
        return String.format("%d", value);
    }


    public static void main(String[] args) {


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
