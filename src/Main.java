import action.Action;
import ui.UI;

import java.util.Scanner;

/**
 * Created by 93773 on 2017/3/18.
 */

public class Main {
    public static void main(String args[]) {
        Action action = new Action();
        UI userInterface = new UI();
        userInterface.printMenu();


        Scanner sc = new Scanner(System.in);
        int choose = sc.nextInt();
        switch (choose){
            case 1:
                action.fetchWeekday();
                break;
            case 2:
                action.printMonthCalender();
                break;
            case 3:
                action.printYearCalender();

        }

    }
}
