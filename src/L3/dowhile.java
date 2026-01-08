package L3;

public class dowhile {

    public static void main(String[] args) {

        int n2 = 10;
        int i2 = 1;

        do { // prints first and then checks.
            System.out.println("Hello " + i2);
            i2++;
        }while(i2 <= n2);

        n2 = 10;
        i2  = 11;

        do {
            System.out.println("Hello " + i2);
            i2++;
        }while (i2 <= n2);

    }
}
