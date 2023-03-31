import java.util.Scanner;

public class task6 {
    public static int power(int base, int power) {
        return switch (power) {
            case 1 -> base;
            case 0 -> 1;
            default -> base * power(base, power-1);
        };
    }

    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num:");
        int base = sc.nextInt();
        System.out.println("Please write a power:");
        int power = sc.nextInt();

        System.out.println("The " + base + "^" + power + "=" + power(base, power));
    }
}
