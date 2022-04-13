import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyWindow extends JFrame {
    JLabel l1, linear, x, y, zero;
    FunctionLine fn1;
    FunctionLine2 fn2;
    JButton btn1;
    JButton btn2;
    JPanel panel;
    Net net;

    MyWindow() {
        super("Math function");
        this.setSize(500, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);

        l1 = new JLabel("Linear function:");
        l1.setBounds(200, 10, 200, 40);
        
        linear = new JLabel("f(x) = 2x + 1");
        linear.setBounds(200, 30, 200, 40);
        
        x = new JLabel("X");
        x.setBounds(250, 100, 20, 20);
        
        y = new JLabel("Y");
        y.setBounds(430, 280, 20, 20);
        
        zero = new JLabel("0");
        zero.setBounds(230, 300, 20, 20);

        panel = new MyPanel();
        panel.setBounds(40, 100, 500, 500);

        net = new Net();
        net.setBounds(40, 100, 500, 500);

        btn1 = new JButton("1st Function");
        btn1.setBounds(10, 0, 150, 40);

        btn2 = new JButton("2nd Function");
        btn2.setBounds(10, 50, 150, 40); 

        fn1 = new FunctionLine();
        fn1.setBounds(40, 100, 500, 500);
        
        fn2 = new FunctionLine2();
        fn2.setBounds(40, 100, 500, 500);
        

        this.add(l1);
        this.add(linear);
        this.add(x);
        this.add(y);
        this.add(zero);
        this.add(panel);
        this.add(net);
        this.add(btn1);
        this.add(btn2);
        this.add(fn1);
        this.add(fn2);

        fn1.setVisible(true);
        fn2.setVisible(false);

        theHandler handler = new theHandler();

        btn1.addActionListener(handler); 
        btn2.addActionListener(handler); 
    } 

    private class theHandler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            if (event.getSource() == btn1) {
                fn1.setVisible(true);
                fn2.setVisible(false);
                l1.setText("Linear function:");
                linear.setText("f(x) = 2x + 1");
            } else if (event.getSource() == btn2) {
                fn1.setVisible(false);
                fn2.setVisible(true);
                l1.setText("Quadrantic function:");
                linear.setText("f(x) = ax2 + bx + c");
            }   
        }
    }
}