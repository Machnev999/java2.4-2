package ru.netology.stats;

public class StatsService {
    public int saleSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum += sale;
        }
        return sum;
    }

    public int avgSaleSum(int[] sales) {

        return saleSum(sales)/ sales.length;
    }

    public int maxSalesMonth(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }


    public int minSalesMonth(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lowAvgSalesMonth(int[] sales) {
        int avgSalesMonth = avgSaleSum(sales);
        int lowAvgMonth = 0;
        for (int sale : sales) {
            if (sale < avgSalesMonth)

                lowAvgMonth = lowAvgMonth + 1;
        }
        return lowAvgMonth;
    }

    public int UpAvgSalesMonth(int[] sales) {
        int avgSalesMonth= avgSaleSum(sales);
        int UpAvgMonth = 0;
        for (int sale : sales) {
            if (sale > avgSalesMonth)

                UpAvgMonth = UpAvgMonth + 1;
        }
        return UpAvgMonth;
    }

}


