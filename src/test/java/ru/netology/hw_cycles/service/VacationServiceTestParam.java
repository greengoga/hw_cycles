package ru.netology.hw_cycles.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class VacationServiceTestParam {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/vacations.csv")
    void lowIncomeLoser(int expected, int income, int expenses, int threshold) {

        VacationService service = new VacationService();

        int actual = service.calculate(income, expenses, threshold);

        assertEquals(expected, actual);

    }
}