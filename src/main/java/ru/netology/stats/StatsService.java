package ru.netology.stats;
public class StatsService {
    // все продажи
    public int allSales(long[] sales) {
        long sum = 0;
        for (long element : sales) {
            sum += element;
        }
        return (int) sum;
    }

    // средние продажи
    public double findAverage(long[] sales) {
        double average = allSales(sales);
        return (double) average / sales.length;
    }

    // минимальные продажи
    public int minSales(long[] sales) {
        int minMonth = 0;// номер месяца с минимальными продажами среди просмотренных ранее
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) { // значит, в рассматриваемом i-м месяце продаж меньше
                minMonth = i; // запомним его как минимальный
            }
        }
        return minMonth + 1;
    }

    // максимальные продажи
    public int maxSales(long[] sales) {
        int maxMonth = 0;
        for (int a = 0; a < sales.length; a++) {
            if (sales[a] >= sales[maxMonth]) {
                maxMonth = a;
            }
        }
        return maxMonth + 1;
    }

    //количество месяцев, в которых продажи были ниже среднего
    public int minSalesMonth(long[] sales) {
        int belowAvrMonth = 0;
        double average = findAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < average) {
                belowAvrMonth++;
            }
        }
        return belowAvrMonth;
    }

    //количество месяцев, в которых продажи были выше среднего
    public int maxSalesMonth(long[] sales) {
        int aboveAvrMonth = 0;
        double average = findAverage(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > average) {
                aboveAvrMonth++;
            }
        }
        return aboveAvrMonth;
    }
}


