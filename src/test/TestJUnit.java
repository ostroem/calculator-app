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
        assertEquals(4, utils.Subtract(8, 4));
    }
}
