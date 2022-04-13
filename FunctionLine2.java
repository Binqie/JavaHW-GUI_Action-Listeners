import javax.swing.JPanel;
import java.awt.geom.*;
import java.awt.*;

public class FunctionLine2 extends JPanel {
    FunctionLine2() {
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        // draw quadratic curve
        g.setColor(Color.red);
        g2.setStroke(new BasicStroke(2f));
        Path2D p = new Path2D.Double();
        p.moveTo(50,350);
        p.quadTo(200,0, 350,350 );

        g2.draw(p);
    }
}
