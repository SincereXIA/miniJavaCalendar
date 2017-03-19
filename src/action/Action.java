package action;

import service.FetchWeekDay;
import service.MonthCalender;

import java.util.Scanner;

/**
 * Created by 93773 on 2017/3/18.
 */
public class Action {
    public void fetchWeekday(){
        char[] chineseWeekday = {'一','二','三','四','五','六','日'};
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入需要查询的年月日，使用空格隔开：");
        int year = sc.nextInt();
        int month = sc.nextInt();
        int day = sc.nextInt();
        int weekday = FetchWeekDay.fetchWeekday(year,month,day);
        System.out.printf("%d年%d月%d日是星期%s%n", year, month, day, chineseWeekday[weekday]);
    }
    public void printMonthCalender(){
        System.out.println("请输入需要查询的年月，使用空格隔开：");

        MonthCalender monthCalender = new MonthCalender();

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        int month = sc.nextInt();
        System.out.println("\t一\t二\t三\t四\t五\t六\t日");
        monthCalender.printMonthCalender(year, month);

    }
    public void printYearCalender(){
        System.out.println("请输入需要查询的年：");

        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        MonthCalender monthCalender = new MonthCalender();
        for (int m = 1;m<=12;m++){
            System.out.println("\t"+year+"年"+m+"月");
            System.out.println("\t一\t二\t三\t四\t五\t六\t日");
            monthCalender.printMonthCalender(year,m);
            System.out.println("_______________");
        }

    }

}
