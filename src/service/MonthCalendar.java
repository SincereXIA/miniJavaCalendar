package service;

/**
 * Created by 张俊华 on 2017/3/18.
 */
public class MonthCalendar {

    private static int getMonthDay(int year, int month) {
        /**
         *计算某年某月有几天
         *@param year 年
         *@param month 月
         *@return 某月的天数
         *@exception
         *@author 张俊华 16030199025
         */
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) ||
                (month == 8) || (month == 10) || (month == 12)) {
            return 31;//1 3 5 7 8 10 12 月，每个月有31天
        } else if (month == 2)
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return 29; //闰年
            } else return 28; //非闰年
        else
            return 30;
    }

    public static StringBuffer[] getMonthCalender(int year, int month) {
        /**
         *获得一个月历数组
         *@param year 年
         *@param month 月
         *@return StringBuffer[] outMonth: 月历数组，每天已经用\t分隔
         *@exception
         *@author 张俊华 16030199025
         */
        int date = 1;
        int week = 0;
        StringBuffer outWeek = new StringBuffer();
        //初始化周字符串
        StringBuffer[] outMonth = new StringBuffer[6];
        // 初始化月数组
        int firstWeekday = FetchWeekDay.fetchWeekday(year, month, 1);
        //这个月第一天是星期几
        int dayInThisMonth = MonthCalendar.getMonthDay(year,month);
        //这个月有几天
        for (int i = 0; i < firstWeekday; i++) {
            outWeek.append(" \t");
        } //用空格和制表符对齐第一天的星期
        for (int i = firstWeekday; i < 7; i++) {
            outWeek.append("\t").append(date);
            date++;
        } //将第一周剩余的日子加入到第一周的字符串
        outMonth[week++] = outWeek;
        //将第一周加入到月数组

        while (date <= dayInThisMonth) {
            outWeek = new StringBuffer();
            for (int i = 0; i < 7; i++) {
                outWeek.append("\t").append(date);
                date++;
                if (date > dayInThisMonth) {
                    for (;i<6;i++){
                        outWeek.append("\t ");
                    }//最后一周补齐
                    break;//输出到每个月的最后一天
                }
            }//按顺序将每一天加入字符串
            outMonth[week++] = outWeek;

        }
        if (week<6){
            outMonth[5] = new StringBuffer("\t \t \t \t \t \t \t ");
        }
        return outMonth;
    }
}
