public class task9 {
    public static int binCoefficient(int n, int k) {
        if (k == n) return 1;

        return switch (k) {
            case 0 -> 1;
            default -> binCoefficient(n-1, k-1) + binCoefficient(n-1, k);
        };
    }

    public static void main(String[] args) {
        System.out.println(binCoefficient(2, 1));   // 2
        System.out.println(binCoefficient(7, 3));   // 35
    }
}
