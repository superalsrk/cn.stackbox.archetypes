package ${package}.util;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class TimeUtil {

    private static DateTimeFormatter format = DateTimeFormat.forPattern("yyyy-MM-dd");

    public static Date parseStartTime(Long timestamp) {
        return (new DateTime(timestamp)).withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0).toDate();
    }

    public static DateTime parseStartDate(DateTime dateTime) {
        return dateTime.withHourOfDay(0).withMinuteOfHour(0).withSecondOfMinute(0).withMillisOfSecond(0);
    }

    public static Date parseEndTime(Long timestamp) {
        return (new DateTime(timestamp)).withHourOfDay(23).withMinuteOfHour(59).withSecondOfMinute(59).withMillisOfSecond(999).toDate();
    }

    public static DateTime parseEndDate(DateTime dateTime) {
        return dateTime.withHourOfDay(23).withMinuteOfHour(59).withSecondOfMinute(59).withMillisOfSecond(999);
    }

    public static String lastDay(String timeString) {
        DateTime parsedDate = format.parseDateTime(timeString);
        DateTime retDate = parsedDate.minusDays(1);
        return retDate.toString("yyyy-MM-dd");
    }

    public static DateTime parseDay(String timeString) {
        DateTime parsedDate = format.parseDateTime(timeString);
        return parsedDate;
    }
}
