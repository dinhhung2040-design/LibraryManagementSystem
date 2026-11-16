import org.junit.Test;
import static org.junit.Assert.*;

public class FineCalculatorTest {

    @Test
    public void testNoFine() {
        FineCalculator calc = new FineCalculator();
        assertEquals(0, calc.calculate(0), 0.01);
    }

    @Test
    public void testNormalFine() {
        FineCalculator calc = new FineCalculator();
        assertEquals(25000, calc.calculate(5), 0.01);
    }

    @Test
    public void testHeavyFine() {
        FineCalculator calc = new FineCalculator();
        assertEquals(66000, calc.calculate(11), 0.01);
    }
}
