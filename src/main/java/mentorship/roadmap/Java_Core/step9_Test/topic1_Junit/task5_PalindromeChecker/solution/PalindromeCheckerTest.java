package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task5_PalindromeChecker.PalindromeChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PalindromeCheckerTest {
    @Test
    void testSimplePalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("madam"));
    }

    @Test
    void testCaseSensitivity() {
        assertFalse(PalindromeChecker.isPalindrome("Madam"));
    }

    @Test
    void testPalindromeWithSpaces() {
        assertFalse(PalindromeChecker.isPalindrome("nurses run"));
    }

    @Test
    void testEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }
}
