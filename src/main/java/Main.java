import ru.netology.stats.StatsService;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long[] sales = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        StatsService service = new StatsService();
        int minMonth = service.minSales(sales);
        int maxMonth = service.maxSales(sales);
        long sum = service.allSales(sales);
        double average = service.findAverage(sales);
        int belowAvrMonth = service.minSalesMonth(sales);
        int aboveAvrMonth = service.maxSalesMonth(sales);



        System.out.println(Arrays.toString(sales));
        System.out.println(" Сумма всех продаж " + sum );
        System.out.println(" Cредняя сумма продаж в месяц " + average );
        System.out.println(" Минимальные продажи в " + minMonth + " месяце");
        System.out.println(" Максимальные продажи в " + maxMonth + " месяце ");
        System.out.println(" Продажи были НИЖЕ среднего в " + belowAvrMonth + " месяцах ");
        System.out.println(" Продажи были ВЫШЕ среднего в " + aboveAvrMonth + " месяцах ");

    }
}
