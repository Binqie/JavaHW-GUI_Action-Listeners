import javax.swing.JPanel;

import java.awt.*;

public class Net extends JPanel {
    Net() {
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
      
        g2.setStroke(new BasicStroke(1f));
        g2.setPaint(Color.gray);
        
        //draw x net
        g2.drawLine(0, 50, 400, 50);
        g2.drawLine(0, 75, 400, 75);
        g2.drawLine(0, 100, 400, 100);
        g2.drawLine(0, 125, 400, 125);
        g2.drawLine(0, 150, 400, 150);
        g2.drawLine(0, 175, 400, 175);
        g2.drawLine(0, 225, 400, 225);
        g2.drawLine(0, 250, 400, 250);
        g2.drawLine(0, 275, 400, 275);
        g2.drawLine(0, 300, 400, 300);
        g2.drawLine(0, 325, 400, 325);
        g2.drawLine(0, 350, 400, 350);

        //draw y net
        g2.drawLine(50, 400, 50, 0);
        g2.drawLine(75, 400, 75, 0);
        g2.drawLine(100, 400, 100, 0);
        g2.drawLine(125, 400, 125, 0);
        g2.drawLine(150, 400, 150, 0);
        g2.drawLine(175, 400, 175, 0);
        g2.drawLine(225, 400, 225, 0);
        g2.drawLine(250, 400, 250, 0);
        g2.drawLine(275, 400, 275, 0);
        g2.drawLine(300, 400, 300, 0);
        g2.drawLine(325, 400, 325, 0);
        g2.drawLine(350, 400, 350, 0);
    }
}
