package recursion;

public class PalindromeString {
    public static boolean isPalindrome(String s, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return isPalindrome(s, start + 1, end - 1);
    }

    public static void main(String[] args) {
        String ex = "as";
        boolean result = isPalindrome(ex, 0, ex.length() - 1);
        System.out.println(result);
    }
}
