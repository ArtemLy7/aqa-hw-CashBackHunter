package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTest {

    @Test
    void shouldReturn600IfAmountIs400() {

        CashbackHackService chs = new CashbackHackService();
        int amount = 400;

        int actual = chs.remain(amount);
        int expected = 600;

        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn0IfAmountIs1000() {
        CashbackHackService chs = new CashbackHackService();
        int amount = 1000;

        int actual = chs.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
    @Test
    void shouldReturn0IfAmountIs10() {
        CashbackHackService chs = new CashbackHackService();
        int amount = 10;

        int actual = chs.remain(amount);
        int expected = 990;

        assertEquals(expected, actual);
    }
}