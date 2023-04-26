package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    void shouldCalculateForNull() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {0, 8, 105, 34};
        long expected = 3;

        // вызываем целевой метод:
        long actual = service.minSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void shouldCalculateForEqual() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {5, 5, 5, 5};
        long expected = 0;

        // вызываем целевой метод:
        long actual = service.minSalesMonth(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

}
