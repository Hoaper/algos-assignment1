import java.util.Scanner;

public class task10 {
    public static int euclidGCDAlgoReq(int a, int b) {
        if (b == 0) return a; //base case
        return euclidGCDAlgoReq(b, a % b); //Euclid's algorithm
    }
    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a num for a:");
        int a = sc.nextInt();
        System.out.println("Please write a num for b:");
        int b = sc.nextInt();

        System.out.println("GCD is: " + euclidGCDAlgoReq(a, b));
    }
}
