package org.example;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class FactorialCalculatorTest {

    private final FactorialCalculator calculator = new FactorialCalculator();

    @Test
    public void testGetFirstNFactorials() {
        List<BigInteger> result = calculator.getFirstNFactorials(5);
        assertEquals(new BigInteger("1"), result.get(0));
        assertEquals(new BigInteger("2"), result.get(1));
        assertEquals(new BigInteger("6"), result.get(2));
        assertEquals(new BigInteger("24"), result.get(3));
        assertEquals(new BigInteger("120"), result.get(4));
    }

    @Test
    public void testInvalidInputZero() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.getFirstNFactorials(0);
        });
        assertEquals("Число n должно быть положительным.", exception.getMessage());
    }

    @Test
    public void testInvalidInputNegative() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.getFirstNFactorials(-5);
        });
        assertEquals("Число n должно быть положительным.", exception.getMessage());
    }

    @Test
    public void testFactorialForLargeNumber() {
        List<BigInteger> result = calculator.getFirstNFactorials(50);
        assertNotNull(result);
        assertEquals(new BigInteger("1"), result.get(0));
        assertEquals(new BigInteger("30414093201713378043612608166064768844377641568960512000000000000"), result.get(49));
    }
}
