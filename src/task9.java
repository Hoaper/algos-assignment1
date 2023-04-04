import java.util.Scanner;

public class task9 {
    public static int binCoefficient(int n, int k) {
        if (k == n) return 1; //base case

        return switch (k) {
            case 0 -> 1; //base case
            default -> binCoefficient(n-1, k-1) + binCoefficient(n-1, k); //binCoefficient rule
        };
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num for N:");
        int n = sc.nextInt();
        System.out.println("Please write a num for K:");
        int k = sc.nextInt();

        System.out.println("The binomial coefficient of n=" + n + " k=" + k +" is: " + binCoefficient(n, k));
    }
}
