import java.awt.*;
import java.awt.event.*;


public class MouseTracker_Task3 extends Frame{
    public boolean release;
    public Point start;
    public Point end;

    MouseTracker_Task3() {
        addWindowListener(new WindowAdapter(){  
            public void windowClosing(WindowEvent e) {  
                dispose();  
            }  
        });
        addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e) {
                start = e.getPoint();
                release = false;
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                end = e.getPoint();
                release = true;
                repaint();
            }
        });
        this.setSize(550,550);    
        this.setLayout(null);
        this.setVisible(true);
        this.setResizable(true);
        this.setLocationRelativeTo(null);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2D.setBackground(Color.white);
        g2D.setColor(Color.BLACK);
        if (release) {
            g2D.drawLine(this.start.x, this.start.y, this.end.x, this.end.y);
        }
    }

    public static void main (String args[]) {
        MouseTracker_Task3 m = new MouseTracker_Task3();
        m.setVisible(true);
    }
}
