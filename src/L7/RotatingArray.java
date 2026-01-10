package L7;

public class RotatingArray {
    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6};

        rotate(arr, 6);
    }

    public  static void rotate(int[]arr, int k)
    {
        k = k % arr.length;
        if (k < 0)
        {
            k = k + arr.length;
        }

        int n = arr.length;
        for (int r = 1; r <= k; r++)
        {
            int temp = arr[n-1];

            for (int i = n - 1; i >= 1; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[0] = temp;
        }
        display(arr);
    }

    public static void display(int[] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
