package mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter.solution;

import mentorship.roadmap.Java_Core.step9_Test.topic1_Junit.task4_WordCounter.WordCounter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WordCounterTest {
    @Test
    void testNormalSentence() {
        assertEquals(5, WordCounter.countWords("Hello world, this is a test"));
    }

    @Test
    void testEmptyString() {
        assertEquals(0, WordCounter.countWords(""));
    }

    @Test
    void testMultipleSpaces() {
        assertEquals(3, WordCounter.countWords("Hello   world  test"));
    }

    @Test
    void testTabsAndNewLines() {
        assertEquals(3, WordCounter.countWords("Hello\tworld\nTest"));
    }
}
