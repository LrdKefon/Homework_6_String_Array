package ru.netology.stats;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        StatsService service = new StatsService();
        int[] sales = {
                178_000, 50_000, 16_785, 112_257, 200_000, 150_000, 25_000,
                33_000, 44_000, 15_000, 250_000, 174_000};
        System.out.println(service.summaAllSales(sales));
        System.out.println(service.middleSumSales(sales));
        System.out.println(service.monthPeakSales(sales));
        System.out.println(service.monthLeastSales(sales));
        System.out.println(service.sumMonthLowMiddleSales(sales));
        System.out.println(service.sumMonthHighMiddleSales(sales));

    }
}