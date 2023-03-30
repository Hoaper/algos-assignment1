public class task1 {
    public static int findMin(int n, int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int num: arr) {
            if (num < min) min = num;
        }
        return min;
    }

    public static void main(String[] args){
        System.out.println(findMin(5, new int[]{-123,-2131,1223,-12313243, -32})); //-12313243
        System.out.println(findMin(6, new int[]{-21,-23,1223,-1, -32, 4332})); //-32
        System.out.println(findMin(7, new int[]{12,-2, 1, 4, -32, -33, -34})); //-34
    }
}
