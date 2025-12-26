package IntroTopics;


// datatype demo class for understanding.
public class Datatypedemo {
    public static void main(String[] args) {
        boolean flag = true;
        System.out.println(flag);

        byte range; // -128 to 127
        range = 120;
        System.out.println(range);
        //56

        short temperature; //-32768 to  32767
        temperature = -200;
        System.out.println(temperature);

        int ranges = -425000; //variable names have to unique
        System.out.println(ranges); //-2^31 to 2^31 - 1

        long ranges1 = -422334556563536L; // need to keep L
        System.out.println(ranges1);

        double number = -42.3;// can hold 64 points.
        System.out.println(number);
        float num  = 34.444f; // can hold 32 points.
        System.out.println(num);

        char  c = 'a'; //holds many letters and symbols 65000+ and they have correpsonding number.
        System.out.println(c);
        /*
        *
        *
        * This is a illustration of program used to illustrate the concept of
        * data types
        *
        * this is called traditional or multiline comment*/

    }
}
