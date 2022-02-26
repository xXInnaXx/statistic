package ru.netology.sqr;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticCalcTest {

    @Test
    void shouldCalculateSum() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=180;
        int actual= service.calculateSum(companySales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldFindAverage() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=15;
        int actual= service.findAverage(companySales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldFindMaxMonth() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=20;
        int actual= service.findMaxMonth(companySales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldFindMinMonth() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=9;
        int actual= service.findMinMonth(companySales);

        assertEquals(expected, actual);


    }
    @Test
    void shouldfindMonthsUnderAvg() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        int actual= service.findMonthsUnderAvg(companySales);

        assertEquals(expected, actual);


    }

    @Test
    void shouldfindMonthsUpperAvg() {
        StatisticCalc service= new StatisticCalc();
        int[] companySales={8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expected=5;
        int actual= service.findMonthsUpperAvg(companySales);

        assertEquals(expected, actual);


    }
}



