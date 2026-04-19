package lab3;
public class Q5 {
    public static String removeWhitespace(String str) {
        return str.replaceAll("\\s+", "");
    }

    public static void main(String[] args) {
        String s = "Java Programming Language";

        System.out.println("Without spaces: " + removeWhitespace(s));
    }
}