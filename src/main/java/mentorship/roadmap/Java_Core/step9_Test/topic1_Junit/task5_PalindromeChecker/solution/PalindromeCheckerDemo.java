package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.solution;

public class PalindromeCheckerDemo {
    public static boolean isPalindrome(String text) {
        String cleanText = text.replaceAll("[^a-zA-Z]", "").toLowerCase();
        String reversed = new StringBuilder(cleanText).reverse().toString();
        return cleanText.equals(reversed);
    }
}
