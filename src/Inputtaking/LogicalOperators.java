package Inputtaking;

public class LogicalOperators {

    public static void main(String[] args) {

        //Logical operators are basically used to check wheather a expression is true or false.
        // They are used in decison making.

        // 1. && (Logical AND)  expression1 && expression2

        // true only if exp1 and exp2 are true.

        System.out.println((5 > 3) && (8 > 5));
        System.out.println((5 < 3) && (8 > 5));

        // 2. || (Logical OR) exp1 || exp2
        //true if either of the exp1 or exp2 is true
        // false only when both are false.
        System.out.println((5 < 3) || (8 > 5)); //true
        System.out.println((5 > 3) || (8 > 5)); // true
        System.out.println((5 < 3) || (8 < 5));// false
        //37

        // 3. !(Logical NOT) !expression.
        // true if exp is false and viceversa .
        System.out.println(!(5==3)); // this can be called as unary opertor
        System.out.println(!(5 > 3));
    }
}
