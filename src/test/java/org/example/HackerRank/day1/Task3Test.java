package org.example.HackerRank.day1;

import org.junit.jupiter.api.Test;

import java.text.ParseException;


import static org.junit.jupiter.api.Assertions.*;

class Task3Test {

    Task3 task3 = new Task3();


    @Test
    void timeConversionTest() throws ParseException {
        String time1 = "12:02:22PM";
        String time2 = "12:02:22AM";
        String time3 = "11:02:22PM";

        String convertedTime1 = task3.timeConversion(time1);
        String convertedTime2 = task3.timeConversion(time2);
        String convertedTime3 = task3.timeConversion(time3);

        assertEquals("12:02:22", convertedTime1);
        assertEquals("00:02:22", convertedTime2);
        assertEquals("23:02:22", convertedTime3);
    }
}