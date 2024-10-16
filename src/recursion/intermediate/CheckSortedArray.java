package recursion.intermediate;

public class CheckSortedArray {
    public static boolean isSortedArray(int[] nums, int n) {
        if (n == nums.length - 1) {
            return true;
        }
        if (nums[n] > nums[n + 1]) {
            return false;
        }
        return isSortedArray(nums, n + 1);
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 98 };
        System.out.println(isSortedArray(arr, 0));
    }
}
