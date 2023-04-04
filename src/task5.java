import java.util.Scanner;

public class task5 {
    public static int fib(int n) {
        return switch (n) {
            case 0 -> 0; // base case
            case 1 -> 1; // base case
            default -> fib(n - 1) + fib(n - 2); // fibonacci sequence rule
        };
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int n = sc.nextInt();
        System.out.println("The fibonacci value is: " + fib(n));
    }
}
