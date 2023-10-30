import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calc;
    @Before
    public void before(){
        calc = new Calculator();}

    @Test
    public void canAdd(){
        assertEquals(7, calc.add(5,2));
    }
    @Test
    public void canSubtract(){
        assertEquals(7, calc.subtract(9,2));
    }

    @Test
    public void canMultiply(){
        assertEquals(8, calc.multiply(4,2));
    }

    @Test
    public void canDivide(){
        assertEquals(20.00, calc.divide(40.00,2.00), 0);
    }


}
