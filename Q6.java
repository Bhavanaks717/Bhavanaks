package lab3;

public class Q6 {
    public static String capitalizeWords(String str) {
        String[] words = str.toLowerCase().split("\\s+");
        String result = "";

        for (String w : words) {
            result += Character.toUpperCase(w.charAt(0)) + w.substring(1) + " ";
        }

        return result.trim();
    }

    public static void main(String[] args) {
        String s = "java programming language";
        System.out.println(capitalizeWords(s));
    }
}