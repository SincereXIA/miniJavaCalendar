package action;

import java.util.Scanner;

/**
 * Created by 93773 on 2017/3/28.
 */
public class ChooseFunction {
    private static int LINE = 3;
    public static boolean main() {
        Scanner sc = new Scanner(System.in);
        int choose = 0;
        choose = sc.nextInt();
        switch (choose) {
            case 1:
                PrintWeekday.main();
                break;
            case 2:
                PrintMonthCalendar.main();
                break;
            case 3:
                PrintYearCalendar.main(LINE);
                break;
            case 4:
                return false;
        }
        return true;
    }
    public void setLINE(int line){
        LINE = line;
    }

}
