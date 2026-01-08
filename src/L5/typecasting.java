package L5;

public class typecasting {

    public static void main(String[] args) {
        byte by = 10;
        short sh = 10;
        int in = 10;
        long lo = 10;

       // bigger cannot go in to smaller:  by = sh; // cannot go directly needs human intervention.
       // bigger cannot go in to smaller:  by = in;
        // bigger cannot go in to smaller: by = lo;

        sh = by; // smaller can in to bigger..automatically.
        in = by;
        lo = by;

        float  f = 4.5f;
        double d = 5.35;

        // f = d // cannot write like this

        d = f;

        // cannot valid  directly in = f;

        // forcefull conversion
        in = (int)f;


        byte b = (byte) 130;
        System.out.println(b); // goes in a loop if any bigger number is assigned from out of range forcefully.

        // case 5;

        char ch  = 'a';
        in = ch;
        System.out.println(in);
        System.out.println(ch);
        System.out.println((int) ch);


        ch = 70;
        System.out.println(ch);
        System.out.println((int)200); // typecasting is not needed.
        ch = (char) (ch + 1);
        System.out.println(ch);

        ch = (char) (ch + 1);
        System.out.println(ch);

        ch = 'a' + 1;
        System.out.println(ch);
        ch = (char)(ch + 'a');
        System.out.println(ch);

        System.out.println(10 + 20 + "Hello" + 20 + 10);//30HEllo2010
        System.out.println(2 + ' ' + 5);//39
        System.out.println(2 + " " + 5);// 2 5
        System.out.println("Hello" + '\t' + "World"); //  Hello World
        System.out.println("Hello" + "\t" + "World"); // Hello World
        System.out.println(2 + '\t' + 3); // 14


    }
}
