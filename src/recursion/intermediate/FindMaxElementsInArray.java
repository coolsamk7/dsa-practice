package recursion.intermediate;

public class FindMaxElementsInArray {
    static int max = Integer.MIN_VALUE;
    // TC: O(n)
    // SC: O(n)

    public static int maxElement(int[] nums, int left, int right) {
        if (left > right) {
            return max;
        }
        max = Math.max(max, nums[right]);
        max = Math.max(max, nums[left]);
        return maxElement(nums, ++left, --right);
    }

    public static void main(String[] args) {
        int arr[] = { 20000, 30, 40, 60, 90, 98, 102, 302, 409, 598, 620, 661 };
        System.out.println(maxElement(arr, 0, arr.length - 1));
    }
}
