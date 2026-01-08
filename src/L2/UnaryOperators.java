package L2;

public class UnaryOperators {

    public static void main(String[] args) {
        // Unary operators are used with one operand . for eg : ++ ,--
        int num = 5;
        System.out.println(++num);

        int a = 12, b = 12;
        int res1 , res2;
        System.out.println(a);

        res1 = ++a;
        System.out.println(res1);

        res2 = --b;
        System.out.println(res2);

        // + : unary plus
        // - : unary minus
        // 47.2

        int var1 = 5, var2 =5;
        System.out.println(var1++); //postfix .var will be printed or returned.then it will be incremented.
        System.out.println(++var1);// prefix. var will incremented and then printed or returned.


    }
}
