public class task8 {
    public static String loop(String letter) {
        for (String chr: letter.split("")) {
            if (!isNum(chr)) return "No";
        }
        return "Yes";

    }
    static boolean isNum(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(loop("12345"));      // Yes
        System.out.println(loop("12345a"));     // No
        System.out.println(loop("NotAnInt"));   // No
    }
}
