public class task10 {
    public static int euclidGCDAlgoReq(int a, int b) {
        if (b == 0) return a;
        return euclidGCDAlgoReq(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println(euclidGCDAlgoReq(32, 48));   // 16
        System.out.println(euclidGCDAlgoReq(10, 7));    // 1
    }
}
