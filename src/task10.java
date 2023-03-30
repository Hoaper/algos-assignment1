public class task10 {
    public static int euclidGCDAlgo(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static void main(String[] args) {
        System.out.println(euclidGCDAlgo(32, 48));   // 16
        System.out.println(euclidGCDAlgo(10, 7));    // 1
    }
}
