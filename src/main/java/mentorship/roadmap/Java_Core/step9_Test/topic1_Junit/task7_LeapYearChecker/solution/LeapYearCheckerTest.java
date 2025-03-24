package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task7_LeapYearChecker.LeapYearChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LeapYearCheckerTest {

    @Test
    void testLeapYear() {
        assertTrue(LeapYearChecker.isLeapYear(2024));
    }

    @Test
    void testNonLeapYear() {
        assertFalse(LeapYearChecker.isLeapYear(2023));
    }

    @Test
    void testCenturyNonLeapYear() {
        assertFalse(LeapYearChecker.isLeapYear(1900));
    }

    @Test
    void testDivisibleBy400() {
        assertTrue(LeapYearChecker.isLeapYear(2000));
    }
}
