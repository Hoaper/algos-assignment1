import java.util.Scanner;

public class task1 {
    public static int findMin(int n, int[] arr) {
        int a = arr[n-1];
        if (n == 1) return a;
        int otherMin = findMin(n-1, arr);
        return a < otherMin ? a : otherMin;
    }

    public static void main(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a length of array:");
        int n = sc.nextInt();
        System.out.println("Write a " + n + " elements:");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.println("The min value is: " + findMin(n, arr));
    }
}
