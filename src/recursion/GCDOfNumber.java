package recursion;

public class GCDOfNumber {
    public static int findGCD(int a, int b) {
        if (a == 0) {
            return b;
        }

        return findGCD(b % a, a);
    }

    public static void main(String[] args) {
        int result = findGCD(10, 15);
        System.out.println(result);
    }
}
