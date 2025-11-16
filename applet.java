
import java.awt.*;
import java.applet.*;
public class applet extends Applet {
    public void paint(Graphics g)
    {
       g.drawOval(50, 50, 100, 150);
       g.drawOval(57, 57, 30, 20);
         g.drawOval(113, 57, 30, 20);
         g.drawArc(80, 100, 50, 20, 180, 180);
    }
}

