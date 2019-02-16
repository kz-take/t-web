package javaTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateCalc {
	public static void main(String[] args) throws ParseException {

		// DateFormat
		DateFormat df = new SimpleDateFormat("yyyyMMdd");

		// 2014/08/01でDateオブジェクト作成
		Date dt = df.parse("20140801");

		// カレンダークラスのインスタンスを取得
		Calendar cal = Calendar.getInstance();

		// 現在時刻を設定
		//cal.setTime(dt);

		cal.setTime(dt);
		// 366日を減算
		cal.add(Calendar.DATE, -366);
		// 結果を表示
		System.out.println(df.format(cal.getTime()));

	}

}
