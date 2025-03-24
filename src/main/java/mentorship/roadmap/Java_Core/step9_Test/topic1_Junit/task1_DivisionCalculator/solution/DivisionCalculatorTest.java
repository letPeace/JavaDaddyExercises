package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task1_DivisionCalculator.DivisionCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class DivisionCalculatorTest {

    @Test
    void testNormalDivision() {
        assertEquals(2.0, DivisionCalculator.divide(4, 2));
    }

    @Test
    void testDivisionByZero() {
        assertThrows(ArithmeticException.class, () -> DivisionCalculator.divide(4, 0));
    }
}
