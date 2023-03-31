import java.util.Scanner;

public class task4 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a number:");
        int n = sc.nextInt();

        System.out.println("The factorial is: " + factorial(n));
    }
}
