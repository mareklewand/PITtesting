package calculator;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

    private static Calculator calculator;

    @BeforeClass
    public static void init() {
        calculator = new Calculator();
    }

    @Test
    public void addTwoNumbersTest() {
        Assert.assertEquals(2, calculator.addTwoNumbers(2,0));
    }

    @Test
    public void subTwoNumbersTest() {
        Assert.assertEquals(5, calculator.subTwoNumbers(5, 0));
    }

    @Test
    public void multiplyTwoNumbersTest() {
        Assert.assertEquals(1, calculator.multiplyTwoNumbers(1, 1));
    }

    @Test
    public void divTwoNumbersTest() {
        Assert.assertEquals(3, calculator.divTwoNumbers(3, 1), 0);
    }


}
