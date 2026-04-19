package lab3;

public class Q8 {
    public static boolean isNumeric(String str) {
        return str.matches("\\d+");
    }

    public static void main(String[] args) {
        String s = "12345";

        if (isNumeric(s)) {
            System.out.println("Numeric String");
        } else {
            System.out.println("Not Numeric");
        }
    }
}
