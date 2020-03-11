package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;

public class Window extends JFrame {

    JButton firstButton = new JButton("AC Milan");
    JButton secondButton = new JButton("Real Madrid");
    JButton closeProgram = new JButton("Завершить");
    JLabel result = new JLabel("Result: 0 X 0;");
    JLabel lastScorer = new JLabel("Last Scorer: N/A;");
    JLabel winner = new JLabel("Winner: DRAW;");

    void setResult(int firstScore, int secondScore){
        result.setText("Result: " + firstScore + " X " + secondScore + ";");
    }

    void setWinner(int firstScore, int secondScore){
        if(firstScore > secondScore) winner.setText("Winner: AC Milan;");
        else
        if(firstScore < secondScore) winner.setText("Winner: Real Madrid;");
        else
            winner.setText("Winner: DRAW.");
    }

    int milanScores = 0;
    int madridScores = 0;

    Window() {
        super("Window");
        setLayout(new FlowLayout());
        setSize(350, 200);
        setVisible(true);
        add(firstButton);
        add(secondButton);
        add(closeProgram);
        add(result);
        add(lastScorer);
        add(winner);


        firstButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                milanScores++;
                lastScorer.setText("Last Scorer: AC Milan;");
                setResult(milanScores, madridScores);
                setWinner(milanScores, madridScores);

            }
        });

        secondButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                madridScores++;
                lastScorer.setText("Last Scorer: Real Madrid;");
                setResult(milanScores, madridScores);
                setWinner(milanScores, madridScores);
            }
        });


        closeProgram.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                JOptionPane.showMessageDialog(null, ("Match complete. \n" + result.getText() + "\n" + winner.getText() + "\n" + lastScorer.getText()));
                System.exit(0);
            }
        });
    }

    public static void main(String[] args) {
        new Window();
    }
}
