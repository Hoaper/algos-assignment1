import java.util.Scanner;

public class task10 {
    public static int euclidGCDAlgoReq(int a, int b) {
        if (b == 0) return a;
        return euclidGCDAlgoReq(b, a % b);
    }
    public static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num for a:");
        int a = sc.nextInt();
        System.out.println("Please write a num for a:");
        int b = sc.nextInt();

        System.out.println("GCD is: " + euclidGCDAlgoReq(a, b));
    }
}
