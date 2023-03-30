import java.util.Arrays;

public class task7 {
    public static void reverseArray(int[] arr) {
        reverse(arr, 0, arr.length-1);
    }
    public static void reverse(int[] arr, int start, int stop) {
        if (start < stop) {
            int temp = arr[start];
            arr[start] = arr[stop];
            arr[stop] = temp;
            reverse(arr, ++start, --stop);
        }
    }

    public static void main(String[] args) {
        int[] test1 = new int[]{1,2,3,4};
        int[] test2 = new int[]{1,2,3,4,5,6};
        reverseArray(test1);
        reverseArray(test2);
        System.out.println(Arrays.toString(test1));   // [4, 3, 2, 1]
        System.out.println(Arrays.toString(test2));   // [6, 5, 4, 3, 2, 1]
    }
}
