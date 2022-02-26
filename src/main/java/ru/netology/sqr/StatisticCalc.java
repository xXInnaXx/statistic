package ru.netology.sqr;

import java.util.Comparator;
import java.util.stream.Stream;

public class StatisticCalc {
    public int calculateSum(int[] sales) {
        int sum = 0;
        for (int sale : sales) {
            sum = sum + sale;

        }
        return sum;
    }


    public int findAverage(int[] sales) {
        return calculateSum(sales) / sales.length;
    }

    public int findMaxMonth(int[] sales) {
        int currentMonth = sales[0];
        for (int sale : sales) {
            if (sale > currentMonth) {
                currentMonth = sale;
            }
        }
        return currentMonth;
    }

    public int findMinMonth(int[] sales) {
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

    public int findMonthsUnderAvg(int[] sales) {
        int avg = findAverage(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (avg > sale) {
                monthCount += 1;
            }
        }
        return monthCount;
    }
    public int findMonthsUpperAvg(int[] sales) {
        int avg = findAverage(sales);
        int monthCount = 0;
        for (int sale : sales) {
            if (avg < sale) {
                monthCount += 1;
            }
        }
        return monthCount;
    }
}