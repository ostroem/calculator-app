package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.Utils;


public class TestJUnit {
    @Test
    public void testAdd(){
        Utils utils = new Utils();
        System.out.println("Testing testAdd...");
        assertEquals(4, utils.Add(2, 2));
        assertEquals(11, utils.Add(9, 2));
        assertEquals(-5, utils.Add(-10, 5));
        assertEquals(0, utils.Add(-16, 16));
    }

    @Test
    public void testSubtract(){
        Utils utils = new Utils();
        System.out.println("Testing testSubtract...");
        assertEquals(-64, utils.Subtract(-61, 3));
        assertEquals(4, utils.Subtract(6, 2));
        assertEquals(12, utils.Subtract(8, -4));
    }
    @Test
    public void testMultiply(){
        Utils utils = new Utils();
        System.out.println("Testing testMultiply...");
        assertEquals(4, utils.Multiply(2, 2));
        assertEquals(14, utils.Multiply(-2, -7));
        assertEquals(15, utils.Multiply(3, 5));
        assertEquals(36, utils.Multiply(6, 6));
    }
    @Test
    public void testDivide(){
        Utils utils = new Utils();
        System.out.println("Testing testDivide...");
        assertEquals(2, utils.Divide(4, 2));
        assertEquals(3, utils.Divide(9, 3));
        assertEquals(9, utils.Divide(18, 2));
        assertEquals(-12, utils.Divide(-36, 3));
    }
    @Test
    public void testRemainder(){
        Utils utils = new Utils();
        System.out.println("Testing testRemainder...");
        assertEquals(2, utils.Remainder(15, 13));
        assertEquals(5, utils.Remainder(26, 21));
        assertEquals(8, utils.Remainder(17, 9));
        assertEquals(-8, utils.Remainder(-2, 3));
    }
}
