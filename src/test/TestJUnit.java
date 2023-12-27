package test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class TestJUnit {
    @Test
    public void testAddition(){
        System.out.println("Testing testAddition...");
        assertEquals(5, 5);
    }
}
