public class task2 {
    public static float findAverage(int n, int[] arr) {
        float sm = 0f;
        for (int num:arr) sm += num;
        return sm/n;
    }
    public static void main(String[] args) {
        System.out.println(findAverage(4, new int[]{1,2,3,4})); // 2.5
        System.out.println(findAverage(3, new int[]{213,12,213})); // 146.0
        System.out.println(findAverage(4, new int[]{1,2,3,4,4,3})); // 4.25
    }
}
