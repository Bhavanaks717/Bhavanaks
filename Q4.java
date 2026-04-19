package lab3;
public class Q4 {
    public static boolean isPalindrome(String str) {
        // Remove punctuation & spaces, ignore case
        String clean = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        String rev = new StringBuilder(clean).reverse().toString();

        return clean.equals(rev);
    }

    public static void main(String[] args) {
        String s = "Madam";

        if (isPalindrome(s)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }
    }
}
