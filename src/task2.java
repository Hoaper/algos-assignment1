import java.util.Scanner;

public class task2 {
    public static float findAverage(int n, int[] arr) {
        float sm = 0f;
        for (int num:arr) sm += num;
        return sm/n;
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("The average value is: " + findAverage(n, arr));
    }
}
