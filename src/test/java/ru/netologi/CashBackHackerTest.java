package ru.netologi;

import org.junit.Test;
import org.junit.Assert;

import static org.junit.Assert.assertEquals;


public class CashBackHackerTest {


    @Test
    public void testRemain1() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }
    @Test
    public void testRemain2() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(expected,actual);
    }

    @Test
    public void remain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(expected,actual);


    }
}