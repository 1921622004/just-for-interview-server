package com.awesome.justforinterview.utils;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateHelper {
  public static Date getAfterDate(Date date, int year, int month, int day, int hour, int minute, int second) {
    Calendar cal = new GregorianCalendar();
    cal.setTime(date);
    if (year != 0) {
      cal.add(Calendar.YEAR, year);
    }
    if (month != 0) {
      cal.add(Calendar.YEAR, month);
    }
    if (day != 0) {
      cal.add(Calendar.YEAR, day);
    }
    if (hour != 0) {
      cal.add(Calendar.YEAR, hour);
    }
    if (minute != 0) {
      cal.add(Calendar.YEAR, minute);
    }
    if (second != 0) {
      cal.add(Calendar.YEAR, second);
    }
    return cal.getTime();
  }
}
