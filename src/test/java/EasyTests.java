import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class EasyTests {
    int a = 5;
    int b = 8;

    @Test
    @Tag("1st_Test")
    void falseTest () {
        assertNotEquals(a, b, "a not equals b");
    }

    @Test
    @Tag("2nd_Test")
    void trueTest () {
        assertEquals(a * b, 40, "a * b equals 40");
    }

    @Test
    @Tag("doNot_Test_It")
    void doNotDoTest () {
        assertEquals(a * b, 40, "a * b equals 40");
    }
}

