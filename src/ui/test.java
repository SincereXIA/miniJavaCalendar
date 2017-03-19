package ui;

import javax.swing.*;
import java.awt.*;

/**
 * Created by 93773 on 2017/3/19.
 */
public class test
{
    public static void main(String args[]){
        Font f = new Font("\u5fae\u8f6f\u96c5\u9ed1", Font.PLAIN, 11);//宋体
        Frame frame = new Frame("日历");
        Panel panel = new Panel();
        panel.add(new Button("u查询星期"),f);
        panel.add(new TextArea("ljadhjhdajhdajhdajldhadjl"));
        frame.add(panel);
        frame.setBounds(300,300,2500,1200);
        frame.setVisible(true);
    }
}
