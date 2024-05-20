import org.testng.annotations.Test;
import school.lesson7_testng.Factorial;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

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
