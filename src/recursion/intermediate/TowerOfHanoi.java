package recursion.intermediate;

/**
 * TowerOfHanoi
 */
public class TowerOfHanoi {

    public static void hanoi(int n, String s, String a, String d) {
        if (n == 1) {
            System.out.println("move 1st disk from " + s + " to " + d);
            return;
        }
        hanoi(n - 1, s, d, a);
        System.out.println("move " + n + " th disk from " + s + " to " + d);
        hanoi(n - 1, a, s, d);
    }

    public static void main(String[] args) {
        hanoi(2, "s", "a", "d");
    }

}