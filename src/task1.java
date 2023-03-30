public class task1 {
    public static int findMin(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num: arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args){
        System.out.println(findMin(5, new int[]{-123,-2131,1223,-12313243, -32}));
    }
}
