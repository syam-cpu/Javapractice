package IterativeStatements;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 10;

        int div = 2;

        int flag = 0;

        while (div <= n - 1)
        {
            if (n % div == 0)
            {
                flag = 1;
                break;
            }
            div += 1;
        }

        if (flag == 1)
        {
            System.out.println("Not Prime");
        }
        else
        {
            System.out.println("Prime");
        }


        for (int i = 1; i <= 10; i++)
        {
            if (i == 5)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
