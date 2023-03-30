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
    public static void main(String[] args) {
        System.out.println(checkPrime(4));   // Composite
        System.out.println(checkPrime(23));  // Prime
        System.out.println(checkPrime(26));  // Composite
    }
}
