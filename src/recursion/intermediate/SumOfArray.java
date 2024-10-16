package recursion.intermediate;

public class SumOfArray {

    public static int sum(int[] nums, int n) {
        if (n == 0) {
            return 0;
        }
        return nums[n - 1] + sum(nums, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6 };
        int sum = sum(arr, arr.length);
        System.out.println(sum);
    }
}
