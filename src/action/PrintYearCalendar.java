package action;

import service.MonthCalendar;
import ui.UI;

/**
 * Created by 张俊华 on 2017/3/28.
 */
public class PrintYearCalendar {
    public static void main(int LINE){
        UI ui = new UI();
        int year = ui.scanYear();

        StringBuffer yearCalendar[][] = new StringBuffer[12][6];
        for (int month = 1;month<=12;month++){
            yearCalendar[month-1] = MonthCalendar.getMonthCalender(year,month);
        }
        int month = 0;
        StringBuffer wholeCalender[][] = new StringBuffer[12/LINE][6];
        StringBuffer head = new StringBuffer();
        for (int i =0;i<LINE;i++){
            head.append("\t一\t二\t三\t四\t五\t六\t日").append("\t\t");
        }
        for (int row = 0;row<12/LINE;row++) {
            System.out.println(head);
            for (int r = 0; r < 6; r++) {
                for (int line = 0; line < LINE; line++) {
                    System.out.print(yearCalendar[month][r]);
                    System.out.print("\t\t");
                    month++;
                }
                month-=LINE;
                System.out.println();
            }
            month+=LINE;
        }
    }
}
