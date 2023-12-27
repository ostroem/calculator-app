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
    }

    @Test
    public void testSubtract(){
        Utils utils = new Utils();
        System.out.println("Testing testSubtract...");
        assertEquals(4, utils.Subtract(6, 2));
        assertEquals(12, utils.Subtract(8, -4));
    }
    @Test
    public void testMultiply(){
        Utils utils = new Utils();
        System.out.println("Testing testMultiply...");
        assertEquals(4, utils.Multiply(2, 2));
        assertEquals(15, utils.Multiply(3, 5));
        assertEquals(36, utils.Multiply(6, 6));
    }
}
