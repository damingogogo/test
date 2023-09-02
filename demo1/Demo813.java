package demo1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Demo813 {

    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();


        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年");
        String format = simpleDateFormat.format(time);
        System.out.println(format);


        System.out.println("=====================");
        String d="2023年8月";
        SimpleDateFormat s = new SimpleDateFormat("yyyy年MM月");
        Date parse = s.parse(d);
        System.out.println(parse);
        System.out.println("=============================");
        System.out.println("=============================");

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("yyyy-MM-dd HH-mm-ss");
        String format1 = dateTimeFormatter.format(now);
        System.out.println(format1);
        String da="2023-12-12 12-22-22";
        LocalDateTime parse1 = LocalDateTime.parse(da, dateTimeFormatter);
        System.out.println("66666666666666666666666666666");
        System.out.println(parse1);


    }
}
