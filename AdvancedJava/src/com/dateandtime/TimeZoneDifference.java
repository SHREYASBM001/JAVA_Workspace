package com.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class TimeZoneDifference {
	public static void main(String[] args) {
		ZoneId ind=ZoneId.of("Asia/Kolkata");
		System.out.println(ind);
		ZoneId usa=ZoneId.of("America/Chicago");
		System.out.println(usa);
		ZonedDateTime india=ZonedDateTime.now();
		ZonedDateTime america=ZonedDateTime.now(usa);
		Duration d=Duration.between(india.toLocalTime(), america.toLocalTime());
		System.out.println(d);
		System.out.println(d.toHours());
		System.out.println(d.toMinutes());
		System.out.println(d.toSeconds());
		
		System.out.println("-------------------");
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
		DateTimeFormatter dtf=DateTimeFormatter.ofPattern("MM-dd-yyyy");
		System.out.println(dtf);
		String s=ld.format(dtf);
		System.out.println(s);
	}
}
