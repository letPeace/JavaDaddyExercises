package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task3_PasswordValidator.PasswordValidator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PasswordValidatorTest {
    @Test
    void testValidPassword() {
        assertTrue(PasswordValidator.isValid("Password1"));
    }

    @Test
    void testShortPassword() {
        assertFalse(PasswordValidator.isValid("Pass1"));
    }

    @Test
    void testPasswordWithoutNumber() {
        assertFalse(PasswordValidator.isValid("Password"));
    }

    @Test
    void testEmptyPassword() {
        assertFalse(PasswordValidator.isValid(""));
    }
}
