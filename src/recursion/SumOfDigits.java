package recursion;

public class SumOfDigits {
    public static int sumOfDigits(int digits) {
        if (digits == 0) {
            return 0;
        }
        return digits % 10 + sumOfDigits(digits / 10);
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigits(123));
    }
}
