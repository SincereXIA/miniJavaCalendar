package ui;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by 张俊华 on 2017/3/18.
 */
public class UI {
    Scanner scanner = new Scanner(System.in);
    public void printMenu(){
        out.println("===================================");
        out.println("1 ----------------- 查询某一天周几");
        out.println("2 ----------------- 打印某一月的月历");
        out.println("3 ----------------- 查询某一年的年历");
        out.println("4 ----------------- 退出程序");
        out.println("===================================");
        out.print("请输入对应的序号：");
    }

    public int scanYear(){
        out.print("请输入需要查询的年份：");
        return scanner.nextInt();
    }

    public int scanMonth(){
        out.print("请输入需要查询的月份：");
        return scanner.nextInt();
    }
    public int scanDay(){
        out.print("请输入需要查询的日期：");
        return scanner.nextInt();
    }
}
