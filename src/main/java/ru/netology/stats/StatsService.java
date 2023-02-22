package ru.netology.stats;

public class StatsService {
    public int summaAllSales(int[] sales) {
        int summaAllSales = 0;
        for (int sale : sales) {
            summaAllSales += sale;
        }
        return summaAllSales;
    }

    public double middleSumSales(int[] sales) {

        return summaAllSales(sales) / sales.length;
    }

    public int monthPeakSales(int[] sales) {
        int numberMonthPeak = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[numberMonthPeak]) {
                numberMonthPeak = i;
            }
        }
        return numberMonthPeak + 1;
    }

    public int monthLeastSales(int[] sales) {
        int numberMonthLeast = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[numberMonthLeast]) {
                numberMonthLeast = i;
            }
        }
        return numberMonthLeast + 1;
    }

    public int sumMonthLowMiddleSales(int[] sales) {
        int sumMonth = 0;
        double sumMonthLowMiddleSales = middleSumSales(sales);
        for (int sale : sales) {
            if (sale < sumMonthLowMiddleSales) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }

    public int sumMonthHighMiddleSales(int[] sales) {
        int sumMonth = 0;
        double sumMonthHighMiddleSales = middleSumSales(sales);
        for (int sale : sales) {
            if (sale > sumMonthHighMiddleSales) {
                sumMonth = sumMonth + 1;
            }
        }
        return sumMonth;
    }
}