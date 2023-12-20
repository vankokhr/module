import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.*;

public class FactorialCalculatorTest {
    @Test
    public void test(){
        Assert.assertEquals(1, FactorialCalculator.factorial(0));
    }
    @Test
    public void testFactorialOf1() {
        assertEquals(1, FactorialCalculator.factorial(1));
    }

    @Test
    public void testFactorialOfPositiveNumber() {
        assertEquals(120, FactorialCalculator.factorial(5));
    }
    
    @Test(expected = IllegalArgumentException.class)
    public void testFactorialThrowsExceptionForNegativeNumber() {
        FactorialCalculator.factorial(-5);
    }
}
