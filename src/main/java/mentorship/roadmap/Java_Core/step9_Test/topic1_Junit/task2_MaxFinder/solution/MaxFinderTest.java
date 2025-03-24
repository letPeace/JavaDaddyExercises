package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task2_MaxFinder.MaxFinder;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MaxFinderTest {

    @Test
    void testFindMax() {
        assertEquals(5, MaxFinder.findMax(new int[]{1, 3, 5, 2}));
    }

    @Test
    void testSingleElementArray() {
        assertEquals(7, MaxFinder.findMax(new int[]{7}));
    }

    @Test
    void testNegativeNumbers() {
        assertEquals(-1, MaxFinder.findMax(new int[]{-10, -5, -3, -1}));
    }

    @Test
    void testEmptyArray() {
        assertThrows(IllegalArgumentException.class, () -> MaxFinder.findMax(new int[]{}));
    }

}
