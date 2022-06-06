import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        System.out.println(Arrays.toString(sales));

        StatsService service = new StatsService();

        int res = service.sumAllSales(sales);
        System.out.println("Сумма продаж за все месяцы = " + res);

        double med = service.averageSalesMonth(sales);
        System.out.println("Средняя сумма продаж в месяц = " + med);

        int bigMonth = service.bigSalesMonth(sales);
        System.out.println("Номер месяца пиковых продаж = " + bigMonth);

        int minMonth = service.minSalesMonth(sales);
        System.out.println("Номер месяца c минимальными продажами = " + minMonth);

        int minAver = service.minAverSales(sales);
        System.out.println("Месяцев с продажами ниже среднего = " + minAver);

        int bigAver = service.bigAverSales(sales);
        System.out.println("Месяцев с продажами выше среднего = " + bigAver);
    }
}
