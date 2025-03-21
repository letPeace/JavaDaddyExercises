package mentorship.roadmap.Java_Core.step2_Base.topic8_Methods.task8_PalindromeChecker;

public class PalindromeChecker {

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("\\s+", "").toLowerCase();

        int left = 0, right = clean.length() - 1;

        while (left < right) {
            if (clean.charAt(left) != clean.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String test = "A man a plan a canal Panama";
        System.out.println("Is palindrome: " + isPalindrome(test));
    }
}
