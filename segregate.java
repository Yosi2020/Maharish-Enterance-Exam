import java.util.Arrays;

public class segregate {
    public static void main (String[] args)
    {
        int a[] = {0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1};
        int i,  nums_size = a.length;
        int left = 0, right = nums_size - 1;

        System.out.println("Original Array : "+ Arrays.toString(a));

        while (left < right)
        {
            /* While  0 at left increment left index  */
            while (a[left] == 0 && left < right)
                left++;

            /* While we see 1 at right decrement right index*/
            while (a[right] == 1 && left < right)
                right--;


            if (left < right)
            {
                a[left] = 0;
                a[right] = 1;
                left++;
                right--;
            }
        }

        System.out.println("Array after segregation is : "+Arrays.toString(a));
    }
}
