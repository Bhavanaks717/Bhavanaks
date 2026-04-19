package lab3;
public class Q1 {
    public static boolean isNullOrEmpty(String str) {
        return (str == null || str.trim().isEmpty());
    }

    public static void main(String[] args) {
        String s = "   ";

        if (isNullOrEmpty(s)) {
            System.out.println("String is NULL or only whitespace");
        } else {
            System.out.println("String is valid");
        }
    }
}