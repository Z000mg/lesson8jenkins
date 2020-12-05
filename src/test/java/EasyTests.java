import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class EasyTests {
    int a = 5;
    int b = 8;

    @Test
    @Tag("1st_test")
    void falseTest () {
        assertNotEquals(a, b, "a not equals b");
    }

    @Test
    @Tag("2nd_test")
    void trueTest () {
        assertEquals(a * b, 40, "a * b equals 40");
    }

    @Test
    @Tag("dont_test_it")
    void dontDoTest () {
        assertEquals(a * b, 40, "a * b equals 40");
    }
}

