package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import main.Utils;


public class TestJUnit {
    @Test
    public void testAddition(){
        Utils utils = new Utils();
        System.out.println("Testing testAddition...");
        assertEquals(4, utils.Add(2, 2));
    }

    @Test
    public void testSubtraction(){
        Utils utils = new Utils();
        System.out.println("Testing testSubtraction...");
        assertEquals(4, -2);
    }
}
