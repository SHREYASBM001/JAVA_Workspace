package com.dateandtime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Test2 {
	public static void main(String[] args) {
		ZoneId usa=ZoneId.of("America/Chicago");
		LocalDate ld=LocalDate.now(usa);
		LocalDateTime ldt=LocalDateTime.now(usa);
		ZonedDateTime india=ZonedDateTime.now();
		ZonedDateTime america=ZonedDateTime.now(usa);
		System.out.println(usa);
		System.out.println("Local Date of AM:"+ld);
		System.out.println("LocalDateTime of AM:"+ldt);
		System.out.println("ZonedDateTime of AM:"+america);
		System.out.println("ZonedDateTime of India:"+india);
		
		Duration d=Duration.between(india.toLocalTime(), america.toLocalTime());
		Period p=Period.between(india.toLocalDate(),america.toLocalDate());
		System.out.println(d);
		System.out.println(p);
	}
}
