package L4;

public class switchdemo {

    public static void main(String[] args) {
        int number = 111;

        String size;

        switch (number)
        {
            case 29:
                size = "small";
                break;
            case 42:
                size = "medium";
                break; //keyword- certain words which are reserved by java as programming language.
            case  48:
                size = "large";
                break;
            case 50:
                size = "Extra Large";
                break;
            default:
                size = "Unknown";
                break;


        }
        System.out.println(size);

        int value = 10;
        //int switch = 10; cannot use switch name as it is keyword.
        //int break = 10; cannot use switch name as it is keyword.


        int expr = 2;

        switch (expr)
        {
            case 1:
                System.out.println("Case 1");
            case 2: // once matching case is present then it will keep on executing all the statements of other cases also.
                System.out.println("Case 2");
            case 3:
                System.out.println("Case 3");
            default:
                System.out.println("Default");
        }
    }

}
