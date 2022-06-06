package ru.netology.stats;

public class StatsService {
    public int sumAllSales(int[] sales) {
        int summ = 0;
        for (int i = 0; i < sales.length; i++) {
            summ = summ + (sales[i]);
        }
        return (summ);
    }

    public double averageSalesMonth(int[] sales) {
        int sum = sumAllSales(sales);
        double medSales = (sum) / 12;
        return (medSales);
    }

    public int bigSalesMonth(int[] sales) {
        int bigMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale >= sales[bigMonth]) {
                bigMonth = month;
            }
            month = month + 1;
        }
        return bigMonth + 1;
    }

    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {

            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int minAverSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < averageSalesMonth(sales)) {
                month = month + 1;
            }
        }
        return month;
    }

    public int bigAverSales(int[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > averageSalesMonth(sales)) {
                month = month + 1;
            }
        }
        return month;
    }
}
