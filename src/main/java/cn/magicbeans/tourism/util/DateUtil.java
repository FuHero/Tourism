package cn.magicbeans.tourism.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	
	public static final SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	
    public static Date parseFromString(String input)
    {
		try {
			return sdf.parse(input);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;
    }

    public static String toString(Date date)
    {
        return sdf.format(date);
    }
	
}
