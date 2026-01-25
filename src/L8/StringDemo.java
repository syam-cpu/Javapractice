package L8;

public class StringDemo {

    public static void main(String[] args) {

        String first = "Java"; // string literals.
        String second = "Python";
        String third = "Java";

        //print
        System.out.println(first);
        System.out.println(third);

        String stringName  = new String("string_value");
        System.out.println(stringName);


        // String operations.
        String greet = "Hello World";
        System.out.println("String : " + greet);
        System.out.println(greet.length());

        //joining two strings.
        String joinedString = first.concat(second);
        System.out.println(joinedString);

        // Compare two strings.

        boolean res1 = first.equals(second);
        System.out.println(res1);

        boolean res2 = first.equals(third);
        System.out.println(res2);

        String name1 = new String("Program1");
        String name2 = new String("Program1");

        boolean res3 = (name1 == name2); // compare references
        boolean res4 = name1.equals(name2);



        System.out.println(res3);
        System.out.println(res4);

        String n1 = new String("Program2");
        String n2 = n1;

        boolean r1 = (n1 == n2);
        boolean r2 = n1.equals(n2);

        System.out.println(r1 + " " + r2);



        // this is a "very" important project
        String example = "this is \"very\" important project";

        //Immutability. in strings java strings are immutable.
        int a = 10;
        String example1 = "hello";
        example1 = example1.concat(" World");
        System.out.println(example1); // new string created . now both hello and helloworld are present


        String newStr = "hello";

        char ch = newStr.charAt(0);
        System.out.println(newStr.charAt(1));

        System.out.println(newStr.charAt(newStr.length() - 1));

        //substring
        // Range : 0 -> length
        System.out.println(newStr.substring(1,4));
        //System.out.println(newStr.substring(0, 5));
        //System.out.println(newStr.substring(4, 1));
        newStr.substring(1);

        System.out.println(newStr.lastIndexOf('l'));
        System.out.println(newStr.startsWith("He"));
        System.out.println(newStr.startsWith("hel"));


        String s1 = "Hello";
        String s2 = s1;
        String s3 = "Hello";
        String s4 = new String("Hello");
        System.out.println((s1 == s2) + ", " + s1.equals(s2));
        System.out.println((s1 == s3) + ", " + s1.equals(s3));
        System.out.println((s1 == s4) + ", " + s1.equals(s4));
        // equals compares content usually (s1 == s4) that will be reference comparsion






    }
}
