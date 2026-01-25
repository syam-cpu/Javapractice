package L8;

import java.util.ArrayList;

public class Arraylistdemo {

    public static void main(String[] args) {

        ArrayList<String> languages = new ArrayList<String>();
        languages.add("java");
        languages.add("javascript");
        languages.add("Swift");

        System.out.println(languages);

        //access
        String str = languages.get(1);
        System.out.println(str);

        //changes
        languages.set(1, "c++");
        System.out.println(languages);

        //remove
        System.out.println(languages.size());
        languages.remove(2);
        System.out.println(languages);
        System.out.println(languages.size());
        


    }
}
