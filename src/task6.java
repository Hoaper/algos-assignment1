public class task6 {
    public static int power(int base, int power) {
        return switch (power) {
            case 1 -> base;
            case 0 -> 1;
            default -> base * power(base, power-1);
        };
    }

    public static void main(String[] args) {
        System.out.println(power(2, 10));   // 1024
        System.out.println(power(1, 20));   // 1
        System.out.println(power(3, 5));    // 243
        System.out.println(power(0, 0));    // 1
    }
}
