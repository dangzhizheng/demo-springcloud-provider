package com.dzz.microservice.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 日期格式化工具
 * @author dangzhizheng
 */
public class DateUtil {

	private static SimpleDateFormat sdf1 = new SimpleDateFormat("yyyyy-MM-dd HH:mm:ss");

	public static String dataFormat(Date date) {
		if (null == date) {
			return null;
		}
		return sdf1.format(date);
	}

	/**
	 * 格式化当前时间，返回格式"2017-12-12 12:15:00"
	 */
	public static String dateFormat() {
		return dataFormat(new Date());
	}
}
