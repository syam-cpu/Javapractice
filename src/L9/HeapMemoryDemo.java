package L9;

import java.util.ArrayList;

public class HeapMemoryDemo {


    public static void main(String[] args) {

        int x = 10; // this will be in stack.

        ArrayList<Integer> list = new ArrayList<>(); // this ref will be in stack

        list.add(10); // list is in heap memory
        list.add(20);
        list.add(30);




    }
}
