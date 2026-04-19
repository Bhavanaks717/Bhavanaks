package lab3;

public class Q10 {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) {
            return 0;
        }
        String[] words = str.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String s = "Java is a programming language";
        System.out.println("Word count: " + countWords(s));
    }
}