package service;

import org.jetbrains.annotations.Contract;

/**
 * Created by 93773 on 2017/3/18.
 */
public class FetchWeekDay {

    public Integer daynumber;

    @Contract(pure = true)
    public static int fetchWeekday(int y, int m, int d) {
        int w;
        y = y%100;
        switch (m) {
            case 1:
                m = 13;
                y -= 1;
                break;
            case 2:
                m = 14;
                y -= 1;
                break;
        }
        w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        //w=y+(y/4)+(c/4)-2*c+(26*(m+1)/10)+d-1;
        //w = (y-1) + ((y-1)/4) - ((y-1)/100) + ((y-1)/400) + d;
        return w;
    }


}
