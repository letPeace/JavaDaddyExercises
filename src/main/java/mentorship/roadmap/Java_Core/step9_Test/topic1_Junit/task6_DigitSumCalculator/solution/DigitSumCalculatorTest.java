package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task6_DigitSumCalculator.DigitSumCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigitSumCalculatorTest {

    @Test
    void testSingleDigit() {
        assertEquals(5, DigitSumCalculator.sumDigits(5));
    }

    @Test
    void testMultipleDigits() {
        assertEquals(15, DigitSumCalculator.sumDigits(12345));
    }

    @Test
    void testNegativeNumber() {
        assertEquals(15, DigitSumCalculator.sumDigits(-12345));
    }

    @Test
    void testZero() {
        assertEquals(0, DigitSumCalculator.sumDigits(0));
    }
}
