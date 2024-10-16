package recursion;

public class FindNthFibonacci {
    public static int findNthFibonacci(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;

        return findNthFibonacci(n - 1) + findNthFibonacci(n - 2);
    }

    public static void main(String[] args) {
        int res = FindNthFibonacci.findNthFibonacci(5);
        System.out.println(res);
    }
}
