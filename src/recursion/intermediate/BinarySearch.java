package recursion.intermediate;

public class BinarySearch {
    // TC O(logn) -> base2
    // Space O(logn) -> base 2
    public static boolean isExist(int left, int right, int[] nums, int target) {
        if (left > right) {
            return false;
        }
        int mid = left + (right - left) / 2;
        if (nums[mid] == target) {
            return true;
        }
        if (nums[mid] < target) {
            return isExist(mid + 1, right, nums, target);
        } else {
            return isExist(left, mid - 1, nums, target);
        }
    }

    public static void main(String[] args) {
        int arr[] = { 20, 30, 40, 60, 90, 98, 102, 302, 409, 598, 620, 661 };
        System.out.println(isExist(0, arr.length - 1, arr, 598));
    }
}
