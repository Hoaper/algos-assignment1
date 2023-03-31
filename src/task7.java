import java.util.Arrays;
import java.util.Scanner;

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

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        reverseArray(arr);
        System.out.println("Your current arrays is: " + Arrays.toString(arr));
    }
}
