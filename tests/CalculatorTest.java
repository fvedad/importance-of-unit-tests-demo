import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

// must be public
public class CalculatorTest {

    Calculator calculator = new Calculator(2, 5);
    // OR:
    @Before
    public void setUp() {
        calculator = new Calculator(2, 5);
    }

    // must be annotated with @Test and should be public
    @Test
    public void testAdd() {
        Assert.assertEquals(7, calculator.add());
    }

    /**
     * <ticket id (ideally with title)>
     */
    @Test
    public void testSubtract() {
        Assert.assertEquals(-3, calculator.subtract());
    }

}