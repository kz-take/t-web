package javaTest;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateTest {
	public static void main(String... args) {
		LocalDate ldate = LocalDate.now();
		ldate = LocalDate.parse("2013/07/07", DateTimeFormatter.ofPattern("yyyy/MM/dd"));
		System.out.println(ldate);

	}

}