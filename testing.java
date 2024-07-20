import java.util.Arrays;

public class testing {
    public static void main(String[] args) {

        System.out.println("Value 1 is: " + getValue1()); //Output: 6
    }

    private static int getValue1() {
        int j = 6;
        return j++;
    }
}
