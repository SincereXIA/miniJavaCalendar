package service;


/**
 * Created by 张俊华 on 2017/3/18.
 */
public class FetchWeekDay {

    public static int fetchWeekday(int y, int m, int d) {
        /**
         *计算某一天周几
         *@param y:年
         *       m:月
         *       d:日
         *@return int w:0~6 对应周一 ~ 周日
         *@exception
         *@author 张俊华 16030199025
         */
        int w;
        y = y % 100; //按照公式，需要取年的最后两位
        switch (m) {
            case 1:
                m = 13;
                y -= 1;
                break;
            case 2:
                m = 14;
                y -= 1;
                break;
        } //按照公式，每年的一月二月当做上一年的13、14月

        w = (d + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        //计算公式

        return w;
    }
}
