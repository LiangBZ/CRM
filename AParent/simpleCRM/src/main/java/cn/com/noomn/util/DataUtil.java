package cn.com.noomn.util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataUtil {

	public static long getNextDay() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.DAY_OF_YEAR, 1);
		return calendar.getTimeInMillis();
	}
	
	public static String formatDate(Long time) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return sdf.format(new java.sql.Date(time));
	}
}
