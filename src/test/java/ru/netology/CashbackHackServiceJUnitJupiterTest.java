package ru.netology;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceJUnitJupiterTest {

    CashbackHackService cashbackHackService = new CashbackHackService();

    @Test

    public void shouldCalculateIfAmountUnderCashback () {

        int amount = 900;

        int actual = cashbackHackService.remain(amount);
        int expected = 100;

        assertEquals(actual, expected);
    }

    @Test

    public void shouldCalculateIfAmountZero () {

        int amount = 0;

        int actual = cashbackHackService.remain(amount);
        int expected = 1000;

        assertEquals(actual, expected);
    }

    @Test

    public void shouldCalculateIfAmountMinCashback () {

        int amount = 1000;

        int actual = cashbackHackService.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);
    }
}

