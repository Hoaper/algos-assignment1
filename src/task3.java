import java.util.Scanner;

public class task3 {
    public static String checkPrime(int n) {
        if (n > 1) {
            for (int i = 2; i < Math.sqrt(n) + 1; i++) {
                if (n % i == 0) return "Composite";
            }
            return "Prime";
        } else {
            return "Composite";
        }
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int n = sc.nextInt();
        System.out.println(n + " is " + checkPrime(n) + "!");
    }
}
