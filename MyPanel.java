import javax.swing.JPanel;

import java.awt.*;
//import java.awt.geom.*;

public class MyPanel extends JPanel {
    MyPanel() {
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        Graphics2D g3 = (Graphics2D) g;
        
        g3.setStroke(new BasicStroke(2f));
        g3.setPaint(Color.black);

        g3.drawLine(0, 200, 400, 200);
        g3.drawLine(200, 0, 200, 400);
    }
}
