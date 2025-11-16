import java.applet.Applet;
import java.awt.*;

public class House extends Applet implements Runnable {
    boolean flag;
    Thread t;
    
    public void start() {
        t = new Thread(this);
        t.start();
        flag = true;
    }
    
    public void run() {
        while(true) {
            try {
                if(flag)
                    flag = false;
                else
                    flag = true;
                t.sleep(1000);
                repaint();
            } catch(Exception e) {
            }
        }
    }
    
    public void paint(Graphics g) {
        // House roof
        int x[] = {300, 400, 500};
        int y[] = {300, 200, 300};
        g.drawPolygon(x, y, 3);
        g.setColor(new Color(150, 150, 150));
        g.fillPolygon(x, y, 3);
        
        // House body
        g.drawRect(300, 300, 200, 100);
        g.setColor(Color.yellow);
        g.fillRect(300, 300, 200, 100);
        
        if(flag) {
            // Closed door
            g.drawRect(375, 350, 50, 50);
            g.setColor(new Color(120, 0, 0));
            g.fillRect(375, 350, 50, 50);
            g.setColor(Color.black);
            g.drawLine(400, 350, 400, 400);
        } else {
            // Open door
            g.drawRect(375, 350, 50, 50);
            g.setColor(Color.black);
            g.fillRect(375, 350, 50, 50);
            
            // Left door
            int x1[] = {375, 390, 390, 375, 375};
            int y1[] = {350, 360, 390, 400, 350};
            g.setColor(new Color(120, 0, 0));
            g.fillPolygon(x1, y1, 5);
            
            // Right door
            int x2[] = {425, 410, 410, 425, 425};
            int y2[] = {350, 360, 390, 400, 350};
            g.setColor(new Color(120, 0, 0));
            g.fillPolygon(x2, y2, 5);
        }
    }
}
