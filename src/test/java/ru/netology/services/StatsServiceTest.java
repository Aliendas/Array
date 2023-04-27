package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.stats.StatsService;

public class StatsServiceTest {

    @Test
    // все продажи
    public void shouldCalculateallSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;
        long actual = service.allSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    // средние продажи
    @Test
    public void shouldCalculateAverage() {
        StatsService service = new StatsService();

        // подготавливаем данные:
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        // вызываем целевой метод:
        double actual = service.findAverage(sales);

        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, actual);
    }

    // минимальные продажи
    @Test
    public void shouldCalculateMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15};
        long expected = 1;
        long actual = service.minSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    // максимальные продажи
    @Test
    public void shouldCalculateMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15};
        long expected = 4;
        long actual = service.maxSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    //количество месяцев, в которых продажи были ниже среднего
    @Test
    public void shouldCalculateForNull() {
        StatsService service = new StatsService();

        long[] sales = {0, 8, 105, 34};
        long expected = 3;
        long actual = service.minSalesMonth(sales);
        Assertions.assertEquals(expected, actual);
    }

    //количество месяцев, в которых продажи были выше среднего
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
