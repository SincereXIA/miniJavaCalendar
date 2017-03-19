package service;

/**
 * Created by 93773 on 2017/3/18.
 */
public class MonthCalender {

    private int getMonthDay(int year, int month) {
        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
            return 31;

        else if (month == 2)
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                return 29;
            } else return 28;
        else
            return 30;
    }

    public void printMonthCalender(int year, int month) {
        int date = 1;
        int week = 0;
        StringBuffer outWeek = new StringBuffer();
        StringBuffer[] outMonth = new StringBuffer[6];
        int firstWeekday = FetchWeekDay.fetchWeekday(year, month, 1);
        for (int i = 0; i < firstWeekday; i++) {
            outWeek.append(" \t");
        }
        for (int i = firstWeekday; i < 7; i++) {
            outWeek.append("\t").append(date);
            date++;
        }
        outMonth[week++] = outWeek;
        while (date <= this.getMonthDay(year, month)) {
            outWeek = new StringBuffer();
            outWeek.delete(0, 14);
            for (int i = 0; i < 7; i++) {
                outWeek.append("\t").append(date);
                date++;
                if (date > this.getMonthDay(year, month)) {
                    break;
                }
            }
            outMonth[week++] = outWeek;

        }
        for (int i = 0; i < week; i++) {
            System.out.println(outMonth[i]);
        }
    }
}
