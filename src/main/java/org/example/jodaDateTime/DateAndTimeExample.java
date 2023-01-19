package org.example.jodaDateTime;

import java.time.*;

/**
 * @author Kapil Kaushik on 19/01/23
 * @project java-8-learn-code
 */

/**
 * before 1.8
 * we have many classes
 * Date, Calendar, TimeStamp etc.
 *
 * many methods are deprecated and not up to mark with performance
 * for fix all issues and problems new api
 * joda.org api which is in java.time package
 */

public class DateAndTimeExample {
    public static void main(String[] args) {

        // get local date and time
        LocalDate date = LocalDate.now();
        LocalTime time = LocalTime.now();

//        System.out.println(date + "\n" + time);

//        System.out.println(date.getDayOfMonth());
//        System.out.println(date.getMonthValue());
//        System.out.println(date.getYear());

//        System.out.println(time.getHour());
//        System.out.println(time.getMinute());
//        System.out.println(time.getSecond());
//        System.out.println(time.getNano());

        // get both date and time in single instance
        LocalDateTime localDateTime = LocalDateTime.now();

//        System.out.println(localDateTime.getDayOfMonth());
//        System.out.println(localDateTime.getYear());
//        System.out.println(localDateTime.getHour());
//        System.out.println(localDateTime.getMinute());

        // of()
        LocalDateTime dt = LocalDateTime.of(date,time);

//        System.out.println(dt);
        // day after 6 months from now
//        System.out.println(dt.minusMonths(5).getMonth());
//        System.out.println(dt.plusMonths(6).getMonth());

        // Period api for diff/bet date & time
        LocalDate d1 = LocalDate.of(1998, Month.SEPTEMBER,14);
        LocalDate d2 = LocalDate.now();
        Period period = Period.between(d1,d2);

//        System.out.println(period.getYears());
//        System.out.println(period.getMonths());
//        System.out.println(period.getDays());

        // check year is leap year or not
        Year year1 = Year.of(2012);
        Year year2 = Year.of(2013);
//        System.out.println(year1.isLeap());
//        System.out.println(year2.isLeap());

        // zone
        ZoneId zoneId = ZoneId.systemDefault();
//        System.out.println(zoneId);
        ZoneId usId = ZoneId.of("America/Los_Angeles");
//        System.out.println(ZonedDateTime.now(usId));

    }
}
