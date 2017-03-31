package cn.com.noomn.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToTimestamp {
	
	/**
	 * 日期格式化：将String转为Long
	 * @param date
	 * @param pattern
	 * @return
	 */
	public static Long formStringToLong(String date, String pattern ) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		Date newDate = null;
		try {
			newDate = simpleDateFormat.parse(date);
		} catch (ParseException e) {
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		return newDate.getTime();
	}
	
	/**
	 * 日期格式化：将Long转为String
	 * @param timestamp
	 * @param pattern
	 * @return
	 */
	public static String fromLongToString(Long timestamp, String pattern) {
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
		String formatDate = simpleDateFormat.format(new Date(timestamp));
		return formatDate;
	}
}
