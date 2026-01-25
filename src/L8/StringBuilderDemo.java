package L8;

public class StringBuilderDemo {

    public static void main(String[] args) {
        String str = "hello";
        StringBuilder sb = new StringBuilder("abc");
        StringBuilder sb1 = new StringBuilder(str);


        System.out.println(sb);
        System.out.println(sb1);
        System.out.println(sb1.length());

        //append
        sb1.append("abc");
        System.out.println(sb1);
        sb1.append("def");
        System.out.println(sb1);

        //insert
        //range -> 0 -> length
        sb.insert(0, 'z');// adding to start
        sb.insert(sb.length(), 'z'); // adding to end
        System.out.println(sb);

        sb.setCharAt(2, 'q');
        System.out.println(sb);

        String str1 = sb.toString();
        System.out.println(str1);
    }
}
