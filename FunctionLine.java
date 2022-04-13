import javax.swing.JPanel;

import java.awt.*;

public class FunctionLine extends JPanel {
    FunctionLine() {
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
      
        g2.setStroke(new BasicStroke(2f));
        g2.setPaint(Color.red);
        
        //draw x net
        g2.drawLine(110, 355, 260, 55);
        
    }
}
