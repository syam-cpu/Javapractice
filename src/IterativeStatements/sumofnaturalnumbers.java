package IterativeStatements;

public class sumofnaturalnumbers {

    public static void main(String[] args) {
        //print sum of n natural numbers from 1 to 1000
        // 1 to 4 => 1 + 2 + 3 + 4 = 10
        int sum = 0;
        for (int i = 1; i <= 1000; i++)
        {
            sum += i;
        }
        System.out.println("sum is " + sum);
        // 23

        int i1 = 1;
        int n = 1000;
            sum = 0;
        while (i1 <= n)
        {
            sum += i1;
            i1++;
        }
        System.out.println("Sum is " + sum);
    }
}
