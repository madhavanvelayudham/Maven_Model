import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSample {

    @Test
    void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testSubtraction() {
        assertEquals(3, 5 - 2);
    }

    @Test
    void testMultiplication() {
        assertEquals(12, 3 * 4);
    }

    @Test
    void testDivision() {
        assertEquals(2, 10 / 5);
    }

    @Test
    void testStringConcat() {
        assertEquals("hello world", "hello " + "world");
    }

    @Test
    void testBooleanTrue() {
        assertTrue(10 > 5);
    }

    @Test
    void testBooleanFalse() {
        assertFalse(5 > 10);
    }

    // ❌ INTENTIONAL FAIL TEST (for demo)
    @Test
    void testFailure() {
        assertEquals(10, 2 + 3); // wrong on purpose
    }
}
