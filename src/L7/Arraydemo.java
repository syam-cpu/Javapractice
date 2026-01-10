package L7;

public class Arraydemo {

    public static void main(String[] args) {
        int[] arr = new int[5];
        System.out.println(arr);

        System.out.println(arr.length);

        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

        //set update
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;

        //get
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        // System.out.println(arr[5]); throws index out of bounds error.

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.println(arr[i]);
        }


        System.out.println("_________________EF______________________");
        //Enhanced for loop
        // can only read elements.
        //forward only.
        for (int val : arr) {
            System.out.println(val);
        }

        // no new array is crated but both are pointing at same location.
        int[] arr1 = arr;
        arr1[3] = 100;
        System.out.println(arr[3]);

        int i = 0;
        int j = 2;


        System.out.println("------------------CASE1---------------");
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr[i], arr[j]);
        System.out.println(arr[i] + ", " + arr[j]);


        System.out.println("------------------CASE2---------------");
        System.out.println(arr[i] + ", " + arr[j]);
        swap(arr, i, j);
        System.out.println(arr[i] + ", " + arr[j]);


        System.out.println("-------------------CASE3--------------");
        int[] other = {100, 200, 300};
        System.out.println(arr[0] + ", " + other[0]);
        swap(arr, other);
        System.out.println(arr[0] + ", " + other[0]);
    }

    //  the existence of one and two will be only present inside this function.
    public static void swap(int[] one, int[] two)
    {
        int[] temp = one;
        one = two;
        two = one;
    }

    // ref to the array is passed . a is also pointing to same location as arr.
    public static void swap(int[] a, int i, int j)
    {
        System.out.println(a[i] + ", " + a[j]);
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    public static void swap(int one, int two)
    {
        int temp = one;
        one = two;
        two = temp;
    }
}
