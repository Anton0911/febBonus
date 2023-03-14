package ru.netologi;

import static org.testng.Assert.*;

public class CashBackHackerTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashBackHacker service = new CashBackHacker();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemain1() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1500;
        int expected = 500;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
    @org.testng.annotations.Test
    public void testRemain2() {
        CashBackHacker service = new CashBackHacker();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(amount);
        assertEquals(actual,expected);
    }
}