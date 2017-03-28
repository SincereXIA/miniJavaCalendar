package action;

import service.FetchWeekDay;
import ui.UI;

import java.util.Scanner;

/**
 * Created by 93773 on 2017/3/28.
 */
public class PrintWeekday {
    public static void main(){
        char[] chineseWeekday = {'一','二','三','四','五','六','日'};
        UI ui = new UI();
        int year = ui.scanYear();
        int month = ui.scanMonth();
        int day = ui.scanDay();
        int weekday = FetchWeekDay.fetchWeekday(year,month,day);
        System.out.printf("%d年%d月%d日是星期%s%n", year, month, day, chineseWeekday[weekday]);
    }
}
