public class isCentered {
    public static void main(String[] args){
        System.out.println(isCentered(new int []{5,3,3,4,5}));
        System.out.println(isCentered(new int []{3,2,1,4,5}));
        System.out.println(isCentered(new int []{3,2,1,4,1}));
        System.out.println(isCentered(new int []{3,2,1,1,4,6}));
        System.out.println(isCentered(new int []{}));
        System.out.println(isCentered(new int []{1}));
    }

    public static int isCentered(int[] a) {
        // Check if the array is empty or has an even number of elements
        if (a.length == 0 || a.length % 2 == 0) {
            return 0;
        }

        // Identify the middle element
        int midIndex = a.length / 2;
        int middleElement = a[midIndex];

        // Check if all other elements are strictly greater than the middle element
        for (int i = 0; i < a.length; i++) {
            if (i != midIndex && a[i] <= middleElement) {
                return 0;
            }
        }

        // If all conditions are met, it's a centered array
        return 1;
    }

}
