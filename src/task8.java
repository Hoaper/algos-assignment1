import java.util.Scanner;

public class task8 {
    public static String loop(String letter) {
        return recFunction(letter.split(""), 0, letter.length());
    }
    static String recFunction(String[] arr, int pos,  int stop) {
        if (pos < stop) {
            if (isNum(arr[pos])) {
                return recFunction(arr, ++pos, stop); // loop for checking every char in String
            } else {
                return "No"; // if not passed then it's not integer char
            }
        }
        return "Yes"; // default if everything is okay
    }
    static boolean isNum(String s) {
        try {
            Integer.parseInt(s); //while parsing non int representation exception could be accorupted
            return true; // if no exception then it's int
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main() {
        // getting input
        Scanner sc = new Scanner(System.in);
        System.out.println("Please write a string to check is it number:");
        String n = sc.nextLine();
        System.out.println("Is this string a num? " + loop(n));
    }
}
