public class task4 {
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(4));   // 24
        System.out.println(factorial(23));  // 862453760
        System.out.println(factorial(25));  // 2076180480
    }
}
