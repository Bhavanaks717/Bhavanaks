package lab3;
public class Q3 {
    public static String reverseString(String str) {
        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    public static void main(String[] args) {
        String s = "Java";

        System.out.println("Reversed: " + reverseString(s));
    }
}