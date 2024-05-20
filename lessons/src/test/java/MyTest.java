import org.junit.jupiter.api.Test;
import school.lesson12.Factorial;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MyTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int result = factorial.calculateFactorial(4);
        assertEquals(24, result);
    }

    @Test
    public void testFactorialWithNegativeValue() {
        Factorial factorial = new Factorial();
        assertThrows(IllegalArgumentException.class, () ->
                factorial.calculateFactorial(-5));
    }
}
