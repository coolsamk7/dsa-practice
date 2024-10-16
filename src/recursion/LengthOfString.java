package recursion;

public class LengthOfString {
    public static int findLength(String s) {
        if (s.equals("")) {
            return 0;
        }
        return 1 + findLength(s.substring(1, s.length()));
    }

    public static void main(String[] args) {
        System.out.println(findLength("sameer344hdfgfdfg") + " " + "sameer344hdfgfdfg".length());
    }
}
