package com.company;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class CustomListener implements MouseListener {

    public void mouseClicked(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}
    public void mousePressed(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}

    public void mouseEntered(MouseEvent e) {
        JButton button = (JButton) e.getSource();
        String text = button.getText();
        JOptionPaneMouse b = new JOptionPaneMouse(text);
    }
}

