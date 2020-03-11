import java.awt.*;
import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String n;
        Scanner in = new Scanner(System.in);
        n = in.next();
        new Window(n);
    }
    static class Window extends JFrame{
        Window(String n){
            setSize(400, 600);
            setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            setLayout(new FlowLayout());

//            ImageIcon icon = new ImageIcon("icon.jpg");
            ImageIcon icon = new ImageIcon(n);

            setIconImage(icon.getImage());
            getContentPane().add(new JLabel(icon)).setPreferredSize(new Dimension(400, 600));

            setLocationRelativeTo(null);
            setVisible(true);
        }
    }
}
/*Shift + ПКМ в пакпе с Main
В строке:
javac Main.java
java Main
путь к изображению*/