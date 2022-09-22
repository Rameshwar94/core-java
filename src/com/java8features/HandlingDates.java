package com.java8features;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class HandlingDates {

	public static void main(String[] args) {
		LocalDate currentDate=LocalDate.now();
		System.out.println("current date:"+currentDate);

		LocalTime currentTime=LocalTime.now();
		System.out.println("Current time:"+currentTime);//24 hour format
		
		LocalDateTime currentDateTime=LocalDateTime.now();
		System.out.println(currentDateTime);
		
		LocalDate anotherDate=LocalDate.parse("2020-07-16");//parse will take string format only
		System.out.println("date other than current date:"+anotherDate);
		
		LocalDate anotherDate2=LocalDate.of(1997,9,03);
		System.out.println("Another date using of method: "+anotherDate2);
		
		//retriving yesterday and tomorrow's date
		LocalDate yesterday=currentDate.minusDays(1);
		System.out.println("Yesterday's date: "+yesterday);
		
		LocalDate tomorrow=currentDate.plusDays(1);
		System.out.println("tomorrows date: "+tomorrow);
		
		System.out.println("is leap year? "+currentDate.isLeapYear());
		
		DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");//setting pattern
		String formatedDate=currentDateTime.format(formatter);
		System.out.println("Formatted Date: "+formatedDate);
		
		Month month=currentDateTime.getMonth();
		System.out.println(currentDateTime.getMonthValue());
		int day=currentDateTime.getDayOfMonth();
		int year=currentDateTime.getYear();
		
		int hour=currentDateTime.getHour();
		int min=currentDateTime.getMinute();
		int ss=currentDateTime.getSecond();
		System.out.println("Date is:"+day+"-"+month+"-"+year+"  "+hour+":"+min+":"+ss);
		
		//Handling zones
		ZonedDateTime current=ZonedDateTime.now();
		System.out.println("current date time and zone: "+current);
		System.out.println("current zone: "+current.getZone());
		ZoneId tokyo=ZoneId.of("Asia/Tokyo");//search on google for zoneId's
		ZonedDateTime tokyoZone=current.withZoneSameInstant(tokyo);
		System.out.println("Tokyo zone: "+tokyoZone);
	}

}
