import action.ChooseFunction;
import ui.UI;


/**
 * Created by 张俊华 on 2017/3/18.
 */

public class Main {
    public static void main(String args[]) {
        UI userInterface = new UI();

        do {
            userInterface.printMenu();
            }while (ChooseFunction.main());
        }

    }
