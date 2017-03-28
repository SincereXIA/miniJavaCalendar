package action;

import service.MonthCalendar;
import ui.UI;


/**
 * Created by 93773 on 2017/3/28.
 */
public class PrintMonthCalendar {
    public static void main(){
        UI ui = new UI();
        int year = ui.scanYear();
        int month = ui.scanMonth();
        StringBuffer monthCalendar[] = MonthCalendar.getMonthCalender(year,month);

        System.out.println("\t一\t二\t三\t四\t五\t六\t日");
        for (StringBuffer w : monthCalendar){
            System.out.println(w);
        }

    }
}
