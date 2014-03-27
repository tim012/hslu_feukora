package ch.feukora.util;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {

	public static String getTime() {
		SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
		String time = sdf.format(new Date());
		return time;
	}

	public static String getDate() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");
		String date = sdf.format(new Date());
		return date;
	}

}
