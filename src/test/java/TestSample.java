import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestSample {

    @Test
    void testAddition() {
        assertEquals(4, 2 + 2);
    }

    @Test
    void testSubtraction() {
        assertEquals(2, 5 - 3);
    }

    @Test
    void testMultiplication() {
        assertEquals(6, 2 * 3);
    }

    @Test
    void testDivision() {
        assertEquals(2, 10 / 5);
    }
}
