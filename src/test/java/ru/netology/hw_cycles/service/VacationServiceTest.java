package ru.netology.hw_cycles.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class VacationServiceTest {

    @Test
    void lowIncomeLoser() {

        VacationService service = new VacationService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int expected = 3;
        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);

    }

    @Test
    void wannabeRich() {

        VacationService service = new VacationService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int expected = 2;
        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);

    }
}