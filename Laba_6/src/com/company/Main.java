package com.company;

import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.*;

public class Main extends JFrame {

    public Main() {
        super("Main");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new BorderLayout());

        JButton butN = new JButton("NORTH");
        JButton butS = new JButton("SOUTH");
        JButton butE = new JButton("EAST");
        JButton butW = new JButton("WEST");
        JButton butC = new JButton("CENTER");

        buttonsPanel.add(butN, BorderLayout.NORTH);
        buttonsPanel.add(butS, BorderLayout.SOUTH);
        buttonsPanel.add(butE, BorderLayout.EAST);
        buttonsPanel.add(butW, BorderLayout.WEST);
        buttonsPanel.add(butC, BorderLayout.CENTER);

        butN.addMouseListener(new CustomListener());
        butS.addMouseListener(new CustomListener());
        butE.addMouseListener(new CustomListener());
        butW.addMouseListener(new CustomListener());
        butC.addMouseListener(new CustomListener());

        getContentPane().add(buttonsPanel);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                JFrame.setDefaultLookAndFeelDecorated(true);
                JFrame frame = new Main();
                frame.setPreferredSize(new Dimension(500, 140));
                frame.pack();
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
            }
        });
    }
}