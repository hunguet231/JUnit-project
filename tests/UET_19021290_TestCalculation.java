package tests;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import programs.Calculation;

import java.util.Arrays;
import java.util.List;

public class UET_19021290_TestCalculation {

    private Calculation calculation;

    @Before
    public void setUp() {
        calculation = new Calculation();
    }

    @After
    public void tearDown() {

    }

    @Test
    public void testAdd() {
        Assert.assertEquals(Long.valueOf(3L), calculation.add(-2L, 5L));
    }

    @Test
    public void testSubtract() {
        Assert.assertEquals(Long.valueOf(13L), calculation.subtract(20L,7L));
    }

    @Test
    public void testMultiply(){
        Assert.assertEquals(Long.valueOf(50L), calculation.multiply(5L, 10L));
    }

    @Test
    public void testDivide() {
        try {
            Assert.assertEquals(Long.valueOf(2L), calculation.divide(6L, 0L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testDivide2() {
        try {
            Assert.assertEquals(Long.valueOf(3L), calculation.divide(6L, 2L));
        }
        catch (Exception e) {
            Assert.assertEquals("Invalid Division", e.getMessage());
        }
    }

    @Test
    public void testFindMaximumNumber() {
        List<Long> numbers = Arrays.asList(-5L, 2L, 10L, 3L, 6L, 9L);
        Assert.assertEquals(Long.valueOf(10L),calculation.findMaximumNumber(numbers));
    }
}