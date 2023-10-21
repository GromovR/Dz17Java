package ru.netology;


import static org.testng.Assert.*;


public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void TestFullAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestLackingAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestMoreAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestMinimalAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1;
        int actual = service.remain(amount);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @org.testng.annotations.Test
    public void TestZeroAmount() {
        CashbackHackService service = new CashbackHackService();

        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;
        assertEquals(actual, expected);
    }
}