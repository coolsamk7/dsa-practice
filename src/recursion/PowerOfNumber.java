package recursion;

public class PowerOfNumber {
    public static int powerOfNumber(int n, int pow) {
        if (pow == 0) {
            return 1;
        }
        if (pow % 2 == 0) {
            return powerOfNumber(n, pow / 2) * powerOfNumber(n, pow / 2);
        } else {
            return n * powerOfNumber(n, pow - 1);
        }

    }

    public static void main(String[] args) {
        int result = powerOfNumber(10, 3);
        System.out.println(result);
    }
}
