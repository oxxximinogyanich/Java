import java.applet.Applet;
import java.awt.*;

public class Task2 extends Applet {
    public void paint(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(50, 50, 100, 100);

        g.setColor(Color.GREEN);
        g.fillOval(200, 50, 100, 100);

        g.setColor(Color.BLUE);
        g.fillRect(350, 50, 100, 100);

        g.setColor(Color.ORANGE);
        g.fillOval(500, 50, 100, 100);
    }
}