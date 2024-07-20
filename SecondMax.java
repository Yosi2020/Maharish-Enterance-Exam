import java.util.Arrays;

public class SecondMax {
    public static void main(String[] args) {
        int[] array = {10789, 2035, 1899, 1456, 2013, 1458, 2458, 1254, 1472, 2365, 1456, 2165, 1457, 2456};
        System.out.println("Original array: " + Arrays.toString(array));

        Arrays.sort(array);
        System.out.println("Second largest element: " + array[array.length - 1]);
        System.out.println("Second largest element: " + array[array.length - 2]);
    }
}
