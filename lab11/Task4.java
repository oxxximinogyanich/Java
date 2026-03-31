import javax.swing.*;
import java.awt.event.*;

public class Task4 {
    public static void main(String[] args) {
        JFrame f = new JFrame("Calculator");
        JTextField t1 = new JTextField();
        JTextField t2 = new JTextField();
        JButton b = new JButton("=");
        JLabel res = new JLabel();

        t1.setBounds(50,50,100,30);
        t2.setBounds(50,100,100,30);
        b.setBounds(50,150,50,30);
        res.setBounds(50,200,200,30);

        f.add(t1); f.add(t2); f.add(b); f.add(res);

        b.addActionListener(e -> {
            double a = Double.parseDouble(t1.getText());
            double c = Double.parseDouble(t2.getText());
            res.setText("Result: " + (a + c));
        });

        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);
    }
}