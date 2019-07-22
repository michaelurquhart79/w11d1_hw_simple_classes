import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
//                Calculator calculator = new Calculator();
        assertEquals(7.00, calculator.add(2.00, 5.00), 0.01);
    }

    @Test
    public void canSubtract(){
        assertEquals(6.66, calculator.subtract(9.99, 3.33), 0.001);
    }

    @Test
    public void canMultiply(){
        assertEquals(4.50, calculator.multiply(3.00, 1.50), 0.001);
    }

    @Test
    public void canDivide(){
        assertEquals(0.75, calculator.divide(3.0, 4.0), 0.001);
    }

}
