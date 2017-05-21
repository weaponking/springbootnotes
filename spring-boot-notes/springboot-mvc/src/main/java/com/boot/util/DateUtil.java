package com.boot.util;

import java.util.Date;
import org.apache.commons.lang3.time.DateFormatUtils;

public final class DateUtil {

	public static final String[] parsePatterns = { "yyyy-MM-dd", "yyyy-MM-dd HH:mm:ss", "yyyy-MM-dd HH:mm", 
		"yyyy/MM/dd", "yyyy/MM/dd HH:mm:ss", "yyyy/MM/dd HH:mm","yyyyMMddHHmmss" };
	
	/**
	 * 拦截器时用
	 * @param timeMillis
	 * @return
	 */
	public static String formatDateTime(long timeMillis){
		long day = timeMillis/(24*60*60*1000);
		long hour = (timeMillis/(60*60*1000)-day*24);
		long min = ((timeMillis/(60*1000))-day*24*60-hour*60);
		long s = (timeMillis/1000-day*24*60*60-hour*60*60-min*60);
		long sss = (timeMillis-day*24*60*60*1000-hour*60*60*1000-min*60*1000-s*1000);
		return (day>0?day+",":"")+hour+":"+min+":"+s+"."+sss;
    }
	/**
	 * 按格式 格式化字符串
	 * @param pattern 格式数组 parsePatterns[index]
	 * @return
	 */
	public static String getDate(String pattern) {
		return DateFormatUtils.format(new Date(), pattern);
	}
	
}
