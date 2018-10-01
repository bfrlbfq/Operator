package sqldemo;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dt
{
public static void main(String[] args)
{
 try
 {
 System.out.println("System Date:" + generateTimestamp("yyyy-MM-dd HH:mm:ss"));
 }
 catch (Exception e)
 {
 e.printStackTrace();
 }
}
public static Timestamp generateTimestamp(String format)
{
 Timestamp timestamp = null;
 try
 {
 SimpleDateFormat dateFormat = new SimpleDateFormat(format);
 Date date = dateFormat.parse(generateDate(format));
 timestamp = new Timestamp(date.getTime());
 }
 catch (ParseException e)
 {
 e.printStackTrace();
 }
 return timestamp;
}
public static String generateDate(String format)
{
 Date date = Calendar.getInstance().getTime();
 DateFormat dateFormat = new SimpleDateFormat(format);
 return (dateFormat.format(date));
}
}
