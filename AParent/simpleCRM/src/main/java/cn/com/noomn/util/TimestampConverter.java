package cn.com.noomn.util;

import java.sql.Timestamp;

import org.springframework.core.convert.converter.Converter;

/**
 * string转换为Timestamp
 * @author lbz
 *
 */
public class TimestampConverter implements Converter<String, Timestamp> {

	@Override
	public Timestamp convert(String timestamp) {
		if(timestamp == null) return null;
		Long time = StringToTimestamp.formStringToLong(timestamp, "yyyy-MM-dd");
		return new Timestamp(time);
	}

}
