import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends Assert{

    @Test(suiteName = "suite1", groups = {"unit1"})
    public void testAddition() throws Exception {
        Calculator calculator = new Calculator();
        float result1 = calculator.addition(2, 2);

        assertEquals(4, result1, 0);
    }

    @Test(suiteName = "suite1", groups = {"unit1"})
    public void testSubtraction() throws Exception {
        Calculator calculator = new Calculator();

        float result1 = calculator.subtraction(2, 2);
        assertEquals(0, result1, 0);
    }

    @Test(suiteName = "suite1", groups = {"unit2"})
    public void testMultiplication() throws Exception {
        Calculator calculator = new Calculator();

        float result1 = calculator.multiplication(3, 2);
        assertEquals(6, result1, 0);
    }

    @Test(suiteName = "suite1", groups = {"unit2"})
    public void testDivision() throws Exception {
        Calculator calculator = new Calculator();

        float result1 = calculator.division(4, 2);
        assertEquals(2, result1, 0);
    }
}
