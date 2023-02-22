package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void summaAllSales() {
        StatsService service = new StatsService(); //сумма продаж за год
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 1_248_042;

        int actual = service.summaAllSales(sales);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void middleSumSales() {//средняя сумма продаж в мес
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 104_003;
        double actual = service.middleSumSales(sales);
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void monthPeakSales() { //последний месяц с пиком продаж
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 11;
        int actual = service.monthPeakSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void monthLeastSales() { //последний месяц с минимумом продаж
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 10;
        int actual = service.monthLeastSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sumMonthLowMiddleSales() { //количество мес, где продажи были меньше средней суммы
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 6;
        double actual = service.sumMonthLowMiddleSales(sales);
        Assertions.assertEquals(expected, actual);

    }

    @Test
    void sumMonthHighMiddleSales() { //количество мес, где продажи были больше средней суммы
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        int expected = 6;
        double actual = service.sumMonthHighMiddleSales(sales);
        Assertions.assertEquals(expected, actual);

    }
}




