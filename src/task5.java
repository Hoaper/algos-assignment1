import java.util.Scanner;

public class task5 {
    public static int fib(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fib(n - 1) + fib(n - 2);
        };
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int n = sc.nextInt();
        System.out.println("The fibonacci value is: " + fib(n));
    }
}
