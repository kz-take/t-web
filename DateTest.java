package javaTest;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
	public static void main(String... args) {
		Date now = new Date();
		Calendar c = Calendar.getInstance();
		c.setTime(now);
		Date future = c.getTime();
		SimpleDateFormat sdf = new SimpleDateFormat("西暦yyyy年MM月dd日");
		System.out.println(sdf.format(future));

		//or条件：a.length() == 0は評価されない
		String a = null;
		if (a == null || a.length() == 0) {
		System.out.println(a);
		}
	}

}