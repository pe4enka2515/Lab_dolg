package com.company;

import javax.swing.*;
import java.awt.*;

public class JOptionPaneMouse extends JFrame {
    public JOptionPaneMouse(String text){
        String itog = "";
        switch (text) {
            case "CENTER":
                itog = "Добро пожаловать в";
                break;
            case "WEST":
                itog = "Добро пожаловать в Джидда";
                break;
            case "SOUTH":
                itog = "Добро пожаловать Абха";
                break;
            case "NORTH":
                itog = "Добро пожаловать в";
                break;
            case "EAST":
                itog = "Добро пожаловать в Дахране";
                break;
        }
        JLabel lab = new JLabel(itog);
        JPanel contents = new JPanel();
        contents.setLayout(new BorderLayout());
        lab.setHorizontalAlignment(JLabel.CENTER);
        contents.add(lab, BorderLayout.CENTER);
        setContentPane(contents);
        setSize(220, 90);
        setVisible(true);
    }
}