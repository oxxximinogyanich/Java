import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class Task10 extends Applet implements ActionListener {

    TextField tf;
    Button btn;
    String text = "";
    Color color = Color.RED;

    public void init() {
        tf = new TextField(20);
        btn = new Button("Show");

        add(tf);
        add(btn);

        btn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        text = tf.getText();

        // смена цвета
        if (color == Color.RED)
            color = Color.BLUE;
        else
            color = Color.RED;

        repaint();
    }

    public void paint(Graphics g) {
        g.setColor(color);
        g.fillRect(100, 100, 100, 100);

        g.setColor(Color.BLACK);
        g.drawString(text, 50, 80);
    }
}