public class task5 {
    public static int fib(int n) {
        return switch (n) {
            case 0 -> 0;
            case 1 -> 1;
            default -> fib(n - 1) + fib(n - 2);
        };
    }

    public static void main(String[] args) {
        System.out.println(fib(5));   // 5
        System.out.println(fib(17));  // 1597
        System.out.println(fib(25));  // 75025
    }
}
