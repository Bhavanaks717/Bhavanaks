package lab2;
import java.util.*;

public class StringOperationsDemo {
    public static void main(String[] args) {

        // 1. String Creation and Basic Operations
        String str1 = "Hello";
        String str2 = new String("World");
        System.out.println("String 1: " + str1);
        System.out.println("String 2: " + str2);

        // 2. Length and Character Access
        System.out.println("\nLength of str1: " + str1.length());
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));

        // 3. String Comparison
        String str3 = "hello";
        System.out.println("\nEquals: " + str1.equals(str3));
        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str3));
        System.out.println("CompareTo: " + str1.compareTo(str2));

        // 4. String Searching
        String text = "Java Programming Language";
        System.out.println("\nIndex of 'Programming': " + text.indexOf("Programming"));
        System.out.println("Contains 'Java': " + text.contains("Java"));
        System.out.println("Starts with 'Java': " + text.startsWith("Java"));
        System.out.println("Ends with 'Language': " + text.endsWith("Language"));

        // 5. Substring Operations
        System.out.println("\nSubstring (0-4): " + text.substring(0, 4));
        System.out.println("Substring from index 5: " + text.substring(5));

        // 6. String Modification
        String mod = "Java";
        System.out.println("\nUppercase: " + mod.toUpperCase());
        System.out.println("Lowercase: " + mod.toLowerCase());
        System.out.println("Replace 'Java' with 'Python': " + mod.replace("Java", "Python"));

        // 7. Whitespace Handling
        String spaceStr = "   Hello World   ";
        System.out.println("\nBefore Trim: '" + spaceStr + "'");
        System.out.println("After Trim: '" + spaceStr.trim() + "'");

        // 8. String Concatenation
        String concat = str1 + " " + str2;
        System.out.println("\nConcatenation using + : " + concat);
        System.out.println("Concatenation using concat(): " + str1.concat(str2));

        // 9. String Splitting
        String fruits = "Apple,Banana,Orange";
        String[] arr = fruits.split(",");
        System.out.println("\nSplitting string:");
        for (String f : arr) {
            System.out.println(f);
        }

        // 10. StringBuilder Demo
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        sb.insert(5, " Java");
        sb.replace(0, 5, "Hi");
        sb.delete(2, 7);
        System.out.println("\nStringBuilder Result: " + sb);

        // 11. String Formatting
        String name = "Bhavana";
        int marks = 90;
        String formatted = String.format("Name: %s, Marks: %d", name, marks);
        System.out.println("\nFormatted String: " + formatted);

        // 12. Email Validation
        String email = "example@gmail.com";
        if (email.contains("@") && email.startsWith("example") && email.endsWith(".com")) {
            System.out.println("\nValid Email");
        } else {
            System.out.println("\nInvalid Email");
        }
    }
} 