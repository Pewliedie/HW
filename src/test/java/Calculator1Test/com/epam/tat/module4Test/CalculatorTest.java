package Calculator1Test.com.epam.tat.module4Test;

import com.epam.tat.module4.Calculator;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeClass
    public void initCalculator() {
        calculator = new Calculator();
    }

    @Test
    public void sumTestWithLongs() {
        long result = calculator.sum(2, 2);
        Assert.assertEquals(result, 4);
    }

    @Test
    public void sumTestWithDoubles() {
        double result = calculator.sum(2.5, 2.5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void subTestWithLongs() {
        long result = calculator.sub(10, 5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void subTestWithDoubles() {
        double result = calculator.sub(1.5, 2.5);
        Assert.assertEquals(result, -1.0);
    }

    @Test
    public void multTestWithLongs() {
        long result = calculator.mult(2, 5);
        Assert.assertEquals(result, 10);
    }

    @Test
    public void multTestWithDoubles() {
        double result = calculator.mult(2.0, 2.5);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void divTestWithLongs() {
        long result = calculator.div(10, 2);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void divTestWithDoubles() {
        double result = calculator.div(5.0, 2.0);
        Assert.assertEquals(result, 2.5);
    }

    @Test(expectedExceptions = NumberFormatException.class)
    public void divTestWithLongsByZero() {
        long result = calculator.div(10, 0);
    }

    @Test
    public void divTestWithDoublesByZero() {
        double result = calculator.div(2.0, 0);
        Assert.assertEquals(result, Double.POSITIVE_INFINITY);
    }


    @Test
    public void powTest() {
        double result = calculator.pow(5.0, 3.0);
        Assert.assertEquals(result, 125);
    }

    @Test
    public void sqrtTest(){
        double result = calculator.sqrt(256.0);
        Assert.assertEquals(result,16.0);
    }

    @Test
    public void tgTest(){
        double result = calculator.tg(7.0);
        Assert.assertEquals(result,0.8714479827243188);
    }

    @Test
    public void ctgTest(){
        double result = calculator.ctg(7.0);
        Assert.assertEquals(result,1.1475154224051358);
    }

    @Test
    public void cosTest(){
        double result = calculator.cos(11.0);
        Assert.assertEquals(result,0.7539022543433046);
    }

    @Test
    public void sinTest() {
        double result = calculator.sin(11.0);
        Assert.assertEquals(result, -0.9999902065507035);
    }

    @Test
    public void isPositiveTestAsTrue() {
        boolean result = calculator.isPositive(10L);
        Assert.assertTrue(result);
    }

    @Test
    public void isPositiveTestAsFalse() {
        boolean result = calculator.isPositive(-10L);
        Assert.assertFalse(result);
    }

    @Test
    public void isNegativeTestAsTrue(){
        boolean result = calculator.isNegative(-10L);
        Assert.assertTrue(result);
    }

    @Test
    public void isNegativeTestAsFalse(){
        boolean result = calculator.isNegative(10L);
        Assert.assertFalse(result);
    }
}
