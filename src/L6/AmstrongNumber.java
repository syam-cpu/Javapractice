package L6;

public class AmstrongNumber {
    public static void main(String[] args) {

        // abc  = a^n + b^n + c^n

        // 153 = 1^3 + 5^3 + 3^3
        // 1634 = 1^4 + 6^4 + 3^4 + 4^4

        // given an input number , true/false , if it is an amstrong number or not
        // 153 - true
        // 570- false
        // 1634 - true

        System.out.println(isArmstrong(1634));
        System.out.println(isArmstrong(153));
        System.out.println(isArmstrong(570));
        printAmstrongNumbers(1, 500);
    }

    //this code uses the previous code . this shows how powerful functionc are it makes code readable and maintainable.
    public static void printAmstrongNumbers(int lo , int high)
    {
        for (int n = lo; n <= high; n++)
        {
            boolean res = isArmstrong(n);
            if (res)
            {
                System.out.println(n);
            }
        }
    }

    public static boolean isArmstrong(int n)
    {
        int nod = countDigits(n);
        int on = n;
        int sum = 0;

        while (on > 0)
        {
            int rem = on % 10; // 4
            sum += Math.pow(rem, nod);
            on = on / 10;
        }
        return sum == n;
    }

    public static int countDigits(int n)
    {
        int nod = 0;

        while (n > 0)
        {
            n = n / 10;
            nod++;
        }
        return nod;
    }

}
