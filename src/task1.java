import java.util.Scanner;

public class task1 {
    public static int findMin(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num: arr) {
            if (num < min) min = num;
        }
        return min;
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
