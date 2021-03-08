package com.company;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();

        DaysOfTheWeek monday = new DaysOfTheWeek("Monday");
        DaysOfTheWeek tuesday = new DaysOfTheWeek("Tuesday");
        DaysOfTheWeek wednesday = new DaysOfTheWeek("Wednesday");
        DaysOfTheWeek thursday = new DaysOfTheWeek("Thursday");
        DaysOfTheWeek friday = new DaysOfTheWeek("Friday");
        DaysOfTheWeek saturday = new DaysOfTheWeek("Saturday");
        DaysOfTheWeek sunday = new DaysOfTheWeek("Sunday");

        DaysOfTheWeek[] days = {monday, tuesday, wednesday, thursday, friday, saturday, sunday};

        Map<DaysOfTheWeek, Integer> daysOfTheWeek = new LinkedHashMap<>();

        for (int i = 0; i < 100; i++) {
            DaysOfTheWeek daysOfWeek = days[random.nextInt(7)];
            int prevCount = daysOfTheWeek.getOrDefault(daysOfWeek, 0);
            daysOfTheWeek.put(daysOfWeek, ++prevCount);
        }

        System.out.println(daysOfTheWeek);
    }
}
